package ch07.sec01.exam03;
	  
public class Calculator {
	// 생성자를 안만들면 자바가 기본생성자를 자동추가 해줌
	// 기본 생성자 Calculator() {}
	// 원의 면적을 구함
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
}