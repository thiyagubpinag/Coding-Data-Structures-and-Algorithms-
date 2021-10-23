package FlowServe;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Name:");
		String name = sc.nextLine();

		System.out.println("Age");
		int age = Integer.valueOf(sc.nextLine());

		System.out.println("Sex");
		String sex = sc.nextLine();

		System.out.println("movieName");
		String movieName = sc.nextLine();

		System.out.println("Amount");
		double amount = Double.valueOf(sc.nextLine());

		Person p = new Person(name, age, sex, amount, movieName);

	}

}
