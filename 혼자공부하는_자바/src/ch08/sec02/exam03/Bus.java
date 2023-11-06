package ch08.sec02.exam03;

public class Bus implements Vehicle {
	
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	// 버스 클래스 공유 메소드
	public void checkFare() {
		System.out.println("요금을 확인합니다.");
	}
	
}
