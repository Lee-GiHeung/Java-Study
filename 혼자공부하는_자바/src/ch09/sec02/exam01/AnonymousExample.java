package ch09.sec02.exam01;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		// 익명 객체 필드 사용
		// 익명 객체의 wake()를 호출하면 work()를 실행
		anony.field.wake();
		// 익명 객체 로컬 변수 사용
		anony.method1();
		// 익명 객체 매개값 사용
		anony.method2(
			new Person() {
				void study() {
					System.out.println("공부합니다");
				}
				@Override
				void wake() {
					System.out.println("8시에 일어납니다");
					study();
				}
			}				
		);
		
		// 실제 구현클래스 Student 객체를 참조
		anony.student.wake();
		
	}
}
