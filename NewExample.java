
public class NewExample {
	static int maxFreq(int[] arr, int n) {

		// using moore's voting algorithm
		int res = 0;
		int count = 1;
		for (int i = 1; i < n; i++) {
			if (arr[i] == arr[res]) {
				count++;
			} else {
				count--;
			}

			System.out.println(count);
			if (count == 0) {
				res = i;
				count = 1;
			}

		}
		
		

		return arr[res];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 40, 50, 30, 40, 50, 30,90 };
		int n = arr.length;
		int freq = maxFreq(arr, n);
		
		System.out.println(freq);
		
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == freq) {
				count++;
			}
		}
		System.out.println("Element " + maxFreq(arr, n) + " occurs " + count + " times");

	}

}
