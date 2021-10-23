import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TrappingRain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 4, 2, 0, 6, 2, 3, 5 };

		List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());

		int aLen = a.length;
		int maxLeft = a[0];
		int maxRight = a[aLen - 1];
		int left = 1;
		int right = aLen - 2;
		int totalRain = 0;

		while (left <= right) {
			if (maxLeft <= maxRight) {

				if (list.get(left) > maxLeft) {
					maxLeft = list.get(left);
				}
				totalRain += (maxLeft - list.get(left));

				left += 1;
			} else {
				if (list.get(right) > maxRight) {
					maxRight = list.get(right);
				}
				totalRain += (maxRight - list.get(right));

				right -= 1;

			}

		}

		System.out.println(totalRain);

	}

}
