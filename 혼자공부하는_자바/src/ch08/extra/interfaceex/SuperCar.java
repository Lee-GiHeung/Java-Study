package ch08.extra.interfaceex;

public class SuperCar implements Car, Plain, Ship {

	@Override
	public void startEngine() {
		System.out.println("엔진 점화");
		
	}

	@Override
	public void stopEngine() {
		System.out.println("엔진 멈춤");
		
	}

	@Override
	public void ship() {
		System.out.println("바다위를 달립니다");
	}

	@Override
	public void fly() {
		System.out.println("푸른 하늘을 빠르게 비행합니다");
	}

	@Override
	public void run() {
		System.out.println("고속도로를 달립니다");
	}
	
}
