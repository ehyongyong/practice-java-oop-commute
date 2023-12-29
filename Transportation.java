package step03commuting;

import step03commuting.Student;

public class Transportation {
	private String name;
	private int fare;
	private int passengers = 0;
	private int income = 0;

	public Transportation(String name, int fare) {
		this.name = name;
		this.fare = fare;
	}

	public void ride(Student student) {
		student.pay(fare);

		passengers += 1;
		income += fare;
	}

	public void displayInfo(String type) {
		System.out.println("======");
		System.out.println("<" + name + " " + type + ">\n승객 수: " + passengers + "명\n매출액 " + income + "\n======");
	}

	public String getName() {
		return name;
	}

	public int getFare() {
		return fare;
	}
}
