package ch09.sec01.exam02;

import ch07.sec01.exam07.pack1.C;

// 정상적인 보통 클래스 A 
public class A {
	// 인스턴스 필드
	// 내부 클래스 B,C 문제 없음
	B field1 = new B();
	C field2 = new C();
	
	// 인스턴스 메소드
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	// 정적필드
	// 클래스 A의 필드로 정적 필드 선언
//	static B field3 = new B();
	static C field4 = new C();
	
	// 정적 메소드 사용
	static void method2() {
//		B var1 = new B();
		C var2 = new C();
	}	
	
	// 이 클래스는 A에서만 사용
	// 인스턴스 멤버 클래스
	// 클래스 내부 멤버에 static 사용금지
	class B {
		C var2 = new C();
	}
	
	// 정적 멤버 클래스
	// 클래스 내부 멤버에 인스턴스 + static 사용
	static class C {
		
	}
	
}