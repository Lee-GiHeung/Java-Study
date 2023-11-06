package ch06.sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		// Car 객체 생성
		Car myCar = new Car();
		
		// 필드 읽기
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);

		// myCar 객체의 필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도 : " + myCar.speed);
		
		
		////////////////////////////////////////////////////
		Car myCar1 = new Car();
		
		// 필드 읽기
		System.out.println("제작회사 : " + myCar1.company);
		System.out.println("모델명 : " + myCar1.model);
		System.out.println("색깔 : " + myCar1.color);
		System.out.println("최고속도 : " + myCar1.maxSpeed);
		System.out.println("현재속도 : " + myCar1.speed);

		// myCar1 객체의 필드값 변경
		myCar1.company = "벤츠";
		myCar1.maxSpeed = 350;
		myCar1.speed = 100;
		
		System.out.println("수정된 속도 : " + myCar1.company);
		System.out.println("수정된 속도 : " + myCar1.maxSpeed);
		System.out.println("수정된 속도 : " + myCar1.speed);
		
	}

}
