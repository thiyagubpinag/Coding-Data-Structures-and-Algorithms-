import java.util.ArrayList;
import java.util.HashMap;

public class Testing {

	static int a = 4;

	void display() {
		System.out.println(a);

	}

	public static void main(String[] a) {

		int countPrimary = 0;

		HashMap<String, String> primaryDeviceCheck = new HashMap<String, String>();
		primaryDeviceCheck.put("alesDeskphone", "mainalesdeskphonedirnumber");
		primaryDeviceCheck.put("alesSoftphone", "mainalesmobilephonedirnumber");

		for (String key : primaryDeviceCheck.keySet()) {
			System.out.println(key + "," + primaryDeviceCheck.get(key));
		}

		int b[] = { -1,11,2, 3, 7, 7, 8, 8 };
		int sum = 10;
		HashMap<Integer, Integer> value = new HashMap();

		for (int i = 0; i < b.length; i++) {
			value.put(b[i], (value.getOrDefault(b[i], 0)) + 1);
		}

		System.out.println(value);
		ArrayList<String> result = new ArrayList();
		int count;
		for (int i = 0; i < b.length; i++) {
			if (value.containsKey(sum - b[i])) {
				count = value.get(sum - b[i]);
				/*
				 * while (count > 0) { result.add(b[i] + "," + (sum - b[i]));
				 * count--; }
				 */

				result.add(b[i] + "," + (sum - b[i]));
				value.remove(b[i]);
			}
		}

		System.out.println(result);

	}
}
