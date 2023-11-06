package ch07.sec03.exam02;

public class Dog extends Animal {
	// 부모클래스 Animal의 필드
	// kind를 초기화 
	// 사용자 정의 기본 생성자
	// 함수명() {...} 형식을 
	// 기본 생성자라고 하고 
	// 개발자가 직접 정의 했으므로
	// 디폴트 기본 생성자가 아니라 사용자 기본 생성자임
	
	public Dog() {
		this.kind = "포유류";
	}

	@Override
	// 추상메소드 sound()의 본체 코드 블럭을 재정의한다
	public void sound() {
		System.out.println("멍멍");
		
	}
}
