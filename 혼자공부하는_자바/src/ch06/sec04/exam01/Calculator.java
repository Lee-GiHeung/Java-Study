package ch06.sec04.exam01;

public class Calculator {
	// 명령 메소드 = 반환값 필요 없음
	// 전원을 킴
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	// 더하기
	int plus(int x, int y) {
		return x + y;
	}
	// 곱하기
	int mul(int x, int y) {
		return x * y;
	}
	// 나눗셈(오버로딩) : 메소드의 시그니쳐가 다른경우
	// 메소드 시그니쳐에는 메소드 선언 중 반환 값 안들어감
	int divide(int x, int y) {
		return x / y;
	}
	
	
	// 나머지
	int mod(int x, int y) {
		return x % y;
		
	}
	
	
	

}
