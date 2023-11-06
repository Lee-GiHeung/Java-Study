package ch09.sec01.exam01.instance;

public class Main {
	public static void main(String[] args) {
		A a = new A(); // A객체를 생성

		// 인스턴스 멤버 클래스 객체 생성
		// A.B : A 클래스의 B 사용자 정의 타입
		// A.B b : A.B 타입의 참조변수 b 선언
		// a.new B(); 
		// a참조 변수가 가르키는
		// A 타입의 객체안에
		// 중첩 클래스 B의 새로운 서브방을 만들어라
		
		A.B b = a.new B();
		b.field = 3;
		b.method1();
		
		// 정적 멤버 클래스 객체 생성
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		// 로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
		
	}
}
