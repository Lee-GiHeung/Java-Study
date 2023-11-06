package ch07.sec01.exam03;

public class Computer extends Calculator {
	
	// 이 규칙은 꼭 지키기
	// 실행주석 (@)은 내부적으로 클래스 입니다.
	// 따라서 @ 다음에 대문자로 시작합니다.
	@Override 			  
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
