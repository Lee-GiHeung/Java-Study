package ch09.sec01.exam05;

public class Outter {
	// 바깥 클래스 필드
	String field = "Outter-field";
	
	// 바깥 클래스 메소드
	void method() {
		System.out.println("Outter-method");
	}
	
	// 중첩(내부)클래스
	class Nested {
		// 중첩 클래스 필드
		private Object object;
		String field = "Nested-field";
		
		// 중첩 클래스 메소드
		void method() {
			System.out.println("Nested-field");
		}
		
		// 내부클래스와 외부클래스 멤버 출력
		void print() {
			// 중첩 클래스 참조
			System.out.println(this.field);
			this.method();
			
			// 바깥(외부) 클래스 멤버 참조
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}