package ch07.sec02.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car(); // car 객체 생성
		
		for(int i = 0 ; i <= 5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
				case 1 :
					System.out.println("앞왼쪽 HankookTire로 교체");
					car.frontLeftTure = new Tire("앞왼쪽", 15);	
					break;
					
				case 2 :
					System.out.println("앞오른쪽 HankookTire로 교체");
					car.frontRightTire = new Tire("앞오른쪽", 13);	
					break;
					
				case 3 :
					System.out.println("뒤왼쪽 HankookTire로 교체");
					car.backLeftTire = new Tire("뒤왼쪽", 14);	
					break;
					
				case 4 :
					System.out.println("뒤오른쪽 HankookTire로 교체");
					car.backRightTire = new Tire("뒤오른쪽", 17);
					break;
					
				default : // problemLocation == 0 정상 주행			
					break;
					
			}
			System.out.println("-------------------");
		}

	}

}