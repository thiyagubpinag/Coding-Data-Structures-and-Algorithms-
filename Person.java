package FlowServe;

public class Person {

	String name;
	int age;
	String sex;
	double amount;
	String movieName;

	public Person(String name, int age, String sex, double amount, String movieName) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.amount = amount;
		this.movieName = movieName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

}
