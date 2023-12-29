package step03commuting;

enum Type {
	BUS("버스"), METRO("지하철");

	private final String name;

	Type(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

public class Transportation {
	private String name;
	private Type type;
	private int fare;
	private int passengers = 0;
	private int income = 0;

	public Transportation(String name, Type type, int fare) {
		this.name = name;
		this.type = type;
		this.fare = fare;
	}

	public void ride(Student student) {
		if (!student.isPayable(fare)) {
			System.out.println(student.getName() + "학생 잔액 부족");

			return;
		}

		student.pay(fare);

		passengers += 1;
		income += fare;

		System.out.println(name + " " + type.getName() + "에 " + student.getName() + " 탑승");
	}

	public void displayInfo() {
		System.out.println("======");
		System.out.println(
				"<" + name + " " + type.getName() + ">\n승객 수: " + passengers + "명\n매출액 " + income + "\n======");
	}
}
