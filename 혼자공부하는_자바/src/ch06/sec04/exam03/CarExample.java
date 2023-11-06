package ch06.sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
		// 1. 자동차 객체
		Car myCar = new Car();
		
		// 2. 기본 가스량 주입
		myCar.setGas(5);
		
		// 3. 현재 자동차 가스상태 검사
		boolean gasState = myCar.isLeftGas();
		// 4. 차를 출발 시킴 (가스 상태가 참이면)
		if(gasState) {
			System.out.println("출발합니다");
			// 시동걸고 출발했으므로 달림
			myCar.run();
		}
		
		// 5. 출발한 차가 가스가 있는 동안 달림
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다");
		} else {
			System.out.println("gas를 주입하세요");
		}
	}

}
