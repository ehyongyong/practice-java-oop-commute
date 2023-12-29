package step03commuting;

import step03commuting.Bus;
import step03commuting.Student;
import step03commuting.Subway;

/*
 * 3. Commuting 문제 명시 및 구현 실습

학생이 통학하기 위해 대중교통을 이용하는 애플리케이션

학생은 대중교통을 이용할 수 있음
대중교통을 이용하기 위해서는 요금을 지불해야함

대중교통은 버스와 지하철이 있음
대중교통은 손님으로부터 이용대금을 받을 수 있어야함

버스는 버스 번호와 현재 버스 안에 탑승 중인 승객 수, 손님이 지불한 요금을 모은 매출액(이용대금)을 가지고 있음
지하철은 호선이름과 지하철 안에 탑승 중인 승객 수, 손님이 지불한 요금을 모은 매출액(이용대금)을 가지고 있음

시스템은 학생과 대중교통의 정보를 조회할 수 있음
학생의 정보를 조회할 경우 학생의 이름과 현재 잔액을 확인할 수 있음
대중교통의 정보를 조회할 경우 대중교통의 특성과 매출액을 확인할 수 있음

그 외 구현은 자유
 * 
 * */
public class Main {

	public static void main(String[] args) {
		Bus bus8762 = new Bus("8762번", 800);
		Subway subway = new Subway("2호선", 900);

		Student s1 = new Student("Park", 10000);
		Student s2 = new Student("Lee", 5000);
		Student s3 = new Student("Choi", 0);

		bus8762.ride(s1);
		bus8762.ride(s2);

		System.out.println();
		bus8762.displayInfo();

		s1.displayInfo();
		s2.displayInfo();

		System.out.println();
		s3.displayInfo();
		subway.ride(s3);

		s3.recharge(3000);

		s3.displayInfo();

		subway.ride(s3);
		subway.displayInfo();

	}

}
