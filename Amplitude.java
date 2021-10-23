import java.util.Arrays;

public class Amplitude {

	public static int solve(int[] nums, int k) {
		Arrays.sort(nums);
		int n = nums.length;
		if (k >= n - 1)
			return 0;

		//1,3,3,5,6;
		int res = Integer.MAX_VALUE;
		for (int i = 0; i <= k; i++) {
		/*	System.out.println(k+","+i);
			int remove_other = k - i;
			// remove i from left
			System.out.println("left:"+(n - 1 - remove_other));
			res = Math.min(res, nums[n - 1 - remove_other] - nums[i]);

			// remove i from right
			System.out.println("right:"+(n - 1 - i));
			res = Math.min(res, nums[n - 1 - i] - nums[remove_other]);*/
			
			System.out.println(n - k + i - 1);
			res = Math.min(res, nums[n - k + i - 1] - nums[i]);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 3, 5, 6, 1, 3 };
		int n = arr.length;
		int k = 2;

		// Function Call
		System.out.println("Maximum distinct elements = " + solve(arr, k));

	}

	// 1,3,3,5,6

	// 3,5,6,1,3

}
