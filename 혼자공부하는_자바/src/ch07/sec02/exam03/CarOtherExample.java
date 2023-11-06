package ch07.sec02.exam03;

public class CarOtherExample {
	public static void main(String[] args) {
		// car 객체 생성
		Car car = new Car();
		
		for(int i = 1; i < 5; i++) {
			// 차를 달립니다. 
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1 :
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTure = new HankookTire("앞왼쪽", 15);	
				break;
				
			case 2 :
				System.out.println("앞오른쪽 kumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 13);	
				break;
				
			case 3 :
				System.out.println("뒤왼쪽 kumhoTire로 교체");
				car.backLeftTire = new KumhoTire("뒤왼쪽", 14);	
				break;
				
			case 4 :
				System.out.println("뒤오른쪽 HankookTire로 교체");
				car.backRightTire = new HankookTire("뒤오른쪽", 17);
				break;
				
			default : // problemLocation == 0 정상 주행			
				break;
							
			}
			System.out.println("-----------------------------");
			
		}
		
	}
}