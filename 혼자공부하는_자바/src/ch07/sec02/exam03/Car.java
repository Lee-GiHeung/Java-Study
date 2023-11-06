package ch07.sec02.exam03;

public class Car {
	final int CAR_TIRE_PROBLEM_FRONT_LEFT = 1;
	final int CAR_TIRE_PROBLEM_FRONT_RIGHT = 2;
	final int CAR_TIRE_PROBLEM_BACK_LEFT = 3;
	final int CAR_TIRE_PROBLEM_BACK_RIGHT = 4;
	
	// 필드
	Tire frontLeftTure = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	// 생성자
	// 메소드
	int run() {
		System.out.println("[자동차가 달립니다]");
		
		// frontLeftTure가 펑크 났다면
		// 자동차가 달렸으므로
		// 모든 타이어의 회전을 1회 추가하고 결과
		// 펑크(false)를 리턴하면 타이어의 번호를 리턴
		if(frontLeftTure.roll() == false) {
			stop();
			return CAR_TIRE_PROBLEM_FRONT_LEFT;
		}
		if(frontRightTire.roll() == false) {
			stop();
			return CAR_TIRE_PROBLEM_FRONT_RIGHT;
		}
		if(backLeftTire.roll() == false) {
			stop();
			return CAR_TIRE_PROBLEM_BACK_LEFT;
		}
		if(backRightTire.roll() == false) {
			stop();
			return CAR_TIRE_PROBLEM_BACK_RIGHT;
		}
		
		// 타이어가 펑크 나지 않았다면 0을 리턴
		return 0;
	}   
		// 펑크 났을때 실행
		void stop() {
			System.out.println("[자동차가 멈춥니다.]");
		}	
}