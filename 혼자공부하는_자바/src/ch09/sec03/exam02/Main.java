package ch09.sec03.exam02;

public class Main {
	public static void main(String[] args) {
		// 익명 클래스 : 클래스 정의 + 객체 생성 . 일회성
		Animal dog = new Animal() {
			@Override
			public String bark() {
				return "왈왈";
			}
		}; // 주의할 점은 익명클래스는 객체를 생성하므로 반드시 세미콜론 필요
		
		// 지금까지는 객체를 생성 하였으므로
		// 실제로 사용해 보아야 한다.
		
		System.out.println(dog.bark());
	}
}
