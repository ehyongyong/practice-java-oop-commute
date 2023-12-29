package step03commuting;

public class Student {
	private String name;
	private int balance;

	public Student(String name, int deposit) {
		this.name = name;
		this.balance = deposit;
	}

	public void recharge(int price) {
		balance += price;
		System.out.println(name + "학생 " + price + "원 충전");
	}

	public boolean isPayable(int price) {
		return balance - price >= 0;
	}

	public void pay(int price) {
		balance -= price;
	}

	public void displayInfo() {
		System.out.println(name + "학생의 잔액은 " + balance + " 원");
	}

	public String getName() {
		return name;
	}
}
