package ch08.extra.interfaceex;

public class SuperCarExample {

	public static void main(String[] args) {
		// 객체 생성
		SuperCar sc = new SuperCar();
		
		// SuperCar 객체의 기능들을 테스트
		sc.startEngine(); // 엔진에 시동, Vehicle 인터페이스 기능 
		sc.run(); // 도로를 달립니다, Car 인터페이스
		sc.fly(); // 상공을 가로지름 , Plain 인터페이스
		sc.ship(); // 바다위를 둥둥 떠 다님, Ship 인터페이스
		sc.stopEngine(); 
		
		System.out.println("객체를 통한 메소드 호출 -fin-");
		
		// 부모 클래스 타입으로 참조변수를 만들어 SuperCar 객체를 참조하게 되는 경우
		Vehicle ve = sc; // 인터페이스형 Vehicle타입만 보임
		ve.startEngine(); // Vehicle타입이 가진 메소드만 보임
		ve.stopEngine();
	
		Ship sh = sc;
		sh.ship();
		
		Plain plain = sc;
		plain.fly();
		
		Car car = sc;
		car.run();
		
		//////////////////////////////////
		
		System.out.println("인터페이스 형식의 부모 참조변수로 반환 -fin-");
	
		// 위의 부모타입으로부터 다시 자식객체로 만드는 경우
		// 강제형변환(다운캐스팅)을 이용
		SuperCar superCar = (SuperCar) ve;
		superCar.startEngine();
		superCar.stopEngine();
		superCar.run();
		superCar.ship();
		superCar.fly();
		
		System.out.println("Vehicle 인터페이스 형식을 다시 SuperCar 참조변수로");
		System.out.println("가르키도록(참조) 하는 경우 -fin-");
	}

}
