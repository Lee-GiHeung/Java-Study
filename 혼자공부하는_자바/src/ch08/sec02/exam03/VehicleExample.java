package ch08.sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); {
			
		vehicle.run();
		
		Bus bus = (Bus)vehicle; // 부모클래스를 버스 타입으로 강제 형변환
		
		// 지금부터 bus변수는 Bus타입
		bus.run();
		bus.checkFare();
		
		}
	}
}