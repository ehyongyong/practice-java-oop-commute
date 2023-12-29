package step03commuting;

import step03commuting.Student;

public class Bus extends Transportation {
	private static final String TYPE = "버스";

	public Bus(String name, int fare) {
		super(name, fare);
	}

	public void ride(Student student) {
		if (!student.isPayable(super.getFare())) {
			System.out.println(student.getName() + "학생 잔액 부족으로 버스 탑승 불가");
			return;
		}

		super.ride(student);

		System.out.println(super.getName() + " " + "번 버스에 " + student.getName() + " 탑승");
	}

	public void displayInfo() {
		super.displayInfo(TYPE);
	}
}
