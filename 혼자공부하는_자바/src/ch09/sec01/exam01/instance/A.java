package ch09.sec01.exam01.instance;

public class A {
	A() {
		System.out.println("A 객체가 생성됨");
	}
	
	// 인스턴스 멤버 클래스
	class B {
		B() {
			System.out.println("B 객체가 생성됨");
		}
		// 중첩클래스 B 필드
		int field;
		// 중첩클래스 B 정적필드
		static int field2;
		// 중첩 클래스 B용 메소드
		void method1() { 
			System.out.println("중첩 객체 B의 method1() 실행");
		}
		// static void method2() {};
	}
	
	// 정적 멤버 클래스
	static class C {
		C() {
			System.out.println("C 객체가 생성됨");
		}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {
			System.out.println("중첩 객체 B의 method2() 실행");
		}
		
	}
	void method() {
		// 로컬 클래스
		class D {
			D() {
				System.out.println("D객체가 실행됨");
			}
			int field1;
//			static int field2;
			void method1() {}
//			static void method2() {}
		}
		
	}
	
}
