import java.util.HashMap;

public class Walmart1 {

	public static String lengthOfLongestSubstring(String s) {

		HashMap<Character, Integer> values = new HashMap<Character, Integer>();
		int start = 0;
		int max = 0;
		int tempMax = 0;
		int count;

		for (int i = 0; i < s.length(); i++) {
			count = (values.getOrDefault(s.charAt(i), 0)) + 1;

			if (count > 1) {

				if (max < tempMax) {
					start = i;
					max = tempMax;
				}
				values.clear();
				tempMax = 0;
			} else {
				values.put(s.charAt(i), count);
				tempMax++;
			}

		}

		return s.substring(start, start + max);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcabcbb";

		String s1 = "bbbbb";

		System.out.println(lengthOfLongestSubstring(s));

		System.out.println(lengthOfLongestSubstring(s1));

	}

}
