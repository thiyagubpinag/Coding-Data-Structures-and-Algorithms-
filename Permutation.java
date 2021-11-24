import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Permutation {
	public static void main(String args[]) {
		Permutation sp = new Permutation();
		sp.permute("AABC".toCharArray()).forEach(s -> System.out.println(s));
	}

	public List<String> permute(char input[]) {

		HashMap<Character, Integer> countMap = new HashMap();

		for (int i = 0; i < input.length; i++) {
			countMap.put(input[i], (countMap.getOrDefault(input[i], 0)) + 1);
		}
		char[] str = new char[countMap.size()];
		int[] count = new int[countMap.size()];
		int i = 0;
		for (Map.Entry<Character, Integer> entrySet : countMap.entrySet()) {
			str[i] = entrySet.getKey();
			count[i] = entrySet.getValue();
			i++;
		}
		
		System.out.println();

		System.out.println(countMap);

		char[] result = new char[input.length];
		List<String> resultList = new ArrayList<String>();

		permuteUtil(str, count, result, 0, resultList);
		
		System.out.println(resultList.size());

		return resultList;

	}

	private void permuteUtil(char[] str, int[] count, char[] result, int i, List<String> resultList) {
		if (i == result.length) {
			resultList.add(new String(result));
			return;
		}

		for (int j = 0; j < str.length; j++) {
			if (count[j] == 0)
				continue;

			result[i] = str[j];
			count[j]--;

			permuteUtil(str, count, result, i + 1, resultList);

			count[j]++;

		}

	}
}
