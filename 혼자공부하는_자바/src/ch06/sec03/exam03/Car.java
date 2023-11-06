package ch06.sec03.exam03;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	Car() {
//		this.model = "영업용";
//		this.color = "white";
//		this.maxSpeed = 200;
//		=>
		this("영업용", "흰색", 200);
	}	
	// 매개변수 1개
	Car(String model) {
//		this.model = model;
//		this.color = "green";
//		this.maxSpeed = 250;
//		=>
		this(model, "green", 50);
	}
	
	// 매개변수 2개
//	Car(String model, String color) {
//		this.model = model;
//		this.color = color;
//	}
	
	// this 키워드를 사용한 생성자 정의
	Car (String model, String color) {
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = 250;
		this(model, color ,250);
	}
	
	
	// 완전한 형태를 갖춘 생성자를 정의
	// 매개변수 3개
	Car (String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
