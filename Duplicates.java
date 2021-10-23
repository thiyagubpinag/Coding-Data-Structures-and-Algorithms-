import java.util.LinkedList;
import java.util.PriorityQueue;

public class Duplicates {

	static class A1 {

		int x;
		int y;

		public A1(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		A1 a = new A1(1, 2);

		A1 b = new A1(3, 6);
		
		A1 b1 = new A1(3, 1);
		
		

		PriorityQueue<A1> pq = new PriorityQueue<A1>((x, y) -> y.y - x.y);

		pq.add(a);
		pq.add(b);
		pq.add(b1);

		System.out.println(pq);

		while (!pq.isEmpty()) {
			A1 c = pq.peek();
			System.out.println(c.x + "," + c.y);
			pq.poll();
		}

	}

}
