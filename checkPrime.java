import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class checkPrime {

	static HashMap<Integer, Integer> values = new HashMap();

	static public int maxDigit(int a, int b) {
		// code here
		int flag;

		for (int i = a; i <= b; i++) {
			if (i == 0 || i == 1)
				continue;

			flag = 1;

			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}

			if (flag == 1)
				addHashMapValues(i);
		}
		int result = -1;
		try {
			int max = Collections.max(values.values());
			for (Integer value : values.keySet()) {
				if (values.get(value) == max) {
					result = Math.max(result, value);
				}
			}
		} catch (NoSuchElementException ex) {
			return result;
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 8;
		int b = 9;

		System.out.println(maxDigit(a, b));
		
		Integer a1=new Integer(21);
		
		
		

	}

	private static void addHashMapValues(int i) {
		// TODO Auto-generated method stub
		int rem;
		while (i > 0) {
			rem = i % 10;
			values.put(rem, (values.getOrDefault(rem, 0)) + 1);
			i /= 10;
		}
	}

}
