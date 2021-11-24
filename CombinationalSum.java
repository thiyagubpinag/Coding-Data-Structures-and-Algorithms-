import java.util.ArrayList;
import java.util.List;

public class CombinationalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 3, 7, 8,5 };
		int n = arr.length;
		int sum = 10;
		List<List<Integer>> result = new ArrayList();

		printAllCombinationalSubsets(arr, 0, sum, new ArrayList<Integer>(), result);

		System.out.println(result);

	}

	private static void printAllCombinationalSubsets(int[] arr, int i, int sum, ArrayList<Integer> arrayList,
			List<List<Integer>> result) {
        System.out.println(i);
		if (sum < 0) {
			return;
		}

		if (sum == 0) {
			result.add(new ArrayList(arrayList));
		}

		for (int j = i; j < arr.length; j++) {
			arrayList.add(arr[j]);
			printAllCombinationalSubsets(arr, i+1, sum - arr[j], arrayList, result);
			arrayList.remove(arrayList.size() - 1);
		}

	}

}
