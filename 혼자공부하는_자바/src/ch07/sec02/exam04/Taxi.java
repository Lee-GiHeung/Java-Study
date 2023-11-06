package ch07.sec02.exam04;

public class Taxi extends Vehicle {
	// vehicle 클래스의 run()를 재정의
	@Override
	public void run() {
		System.out.println("택시가 달립니다");
	}
}
