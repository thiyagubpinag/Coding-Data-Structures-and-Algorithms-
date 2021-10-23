import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class KadanaAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 4, -3, -2, 2, 3, 1, -2, -3, 4, 2, -6, -3, -1, 3, 1, 2 };

		List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());

		int maxSoFar = 0;
		int maxEndHere = 0;
		int start = 0;
		int end = 0;
		int s = 0;

		for (int i = 0; i < list.size(); i++) {

			maxEndHere += list.get(i);

			if (maxSoFar < maxEndHere) {
				maxSoFar = maxEndHere;
				start = s;
				end = i;
			}
			if (maxEndHere < 0) {
				maxEndHere = 0;
				s = i + 1;
			}

		}

		System.out.println(maxSoFar);
		System.out.println(start);
		System.out.println(end);

	}

}
