package ch06.sec04.exam05;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		// 차에 시동걸기
		myCar.keyTurnOn();
		myCar.run();
		
		// 현재 자동차의 속도를 얻습니다
		int speed = myCar.getSpeed();
		System.out.println("현재속도 : " + speed + "km/h");

	}

}