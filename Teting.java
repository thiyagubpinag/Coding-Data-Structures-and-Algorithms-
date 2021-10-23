
public class Teting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 1 }, { 2, 2 } };

		changeArray(a);

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

	private static void changeArray(int[][] a) {
		// TODO Auto-generated method stub
		a[0][1] = 3;
	}

}
