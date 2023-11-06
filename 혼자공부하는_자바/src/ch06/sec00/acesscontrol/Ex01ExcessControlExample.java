package ch06.sec00.acesscontrol;

public class Ex01ExcessControlExample {

	public static void main(String[] args) {
		A objA = new A(); // 객체생성
//		objA.a = 10;
		objA.b = 20; // 디폴트 접근 가능
 		objA.c = 30; // 공용 접근 가능

	}

}

class A {
	private int a; // a 전용 접근제어
	int b; // b 디폴트(패키지 레벨) 접근제어
	public int c; // 공용
	
}