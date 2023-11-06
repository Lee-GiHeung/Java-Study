package ch06.sec00.exam01;

import java.util.Scanner;

public class Ex01MethodDefinitionExample {
	// 자주 반복해서 사용하는 코드
	// 대표이름을 붙여서 그이름으로 
	// 부르기만 하면 그 코드들이 실행 됨
	// => 함수라고 부르고 자바 모든 함수는 클래스에 속해야하므로
	// 그 클래스의 함수라는 의미로 메소드(어떤 역할에 몰입한 배우의 연기를 메소드라고 하므로) 라고 부름
	// 메소드 정의
	static int sum(int a , int b) {
		return a + b;
	}
	
	static int sub(int a1, int b1) {
		return a1 - b1;
	}
	
	static int add(int a2, int b2) {
		return a2 * b2;
	}
	
	static int div(int a3, int b3) {
		return a3 / b3;
	}
		
	// public : 외부 코드블럭에서 불러서 실행 가능
	// private : 가장 강력한 제한 범위 지시어로
	// 			 같은 코드 블럭에서만 실행 가능
		
	public static void main(String[] args) {
		// 메소드 호출하면
		// 메소드는 호출한다 (= 실행한다) 이므로
		// 데이터 값을 리턴합니다. 연산자와 같음 
		int sumResult = sum(1,3);
		
		// 위 결과를 출력
		System.out.println(sumResult);
		System.out.println(sum(1,3));
		
		System.out.println("=============사칙연산 연습=================");
	
		int subResult = sub(3,1);
		System.out.println("subResult : " + subResult);
		
		int addResult = add(4,2);
		System.out.println("addResult : " + addResult);
		
		int divResult = div(12,3);
		System.out.println("divResult : " + divResult);
		
	}

}