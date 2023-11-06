package ch06.sec04.exam05;

public class Car {
	// 필드
	int speed;
	
	// 생성자
	
	// 메소드
	
	int getSpeed() {
		return speed;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// 시동키를 작동시키는 메소드
	void keyTurnOn() {
		System.out.println("키를 돌립니다");
	}
	
	// 자동차를 특정 속력까지 가속한다
	void run() {
		for(int i = 0; i <= 50; i += 10) {
			speed = i;
			System.out.println("달립니다.(시속 : " + speed + "km/h)");
		}
	}
}
