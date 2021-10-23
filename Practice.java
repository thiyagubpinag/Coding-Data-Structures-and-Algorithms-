import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Practice {

	static class Point {
		int x;
		int y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Point> input = new ArrayList();

		Point a = new Point(0, 0);

		Point b = new Point(4, 9);
		
		Point c = new Point(3, 9);

		input.add(a);
		input.add(b);
		input.add(c);

		Collections.sort(input, new Comparator<Point>() {

			@Override
			public int compare(Point o1, Point o2) {
				return o1.x > o2.x ? -1 : 1;
			}

		});
		
		
		input.forEach(i->{
			System.out.println(i.x+","+i.y);
		});

	}

}
