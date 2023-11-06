package ch09.sec03.exam03;

public class Main {

	public static void main(String[] args) {
		Animal dog = new Animal() {
			public String bark() {
				return "강아지가 짖습니다";
			}
		
			public String run() {
				return "달리기";
			}
		};
		dog.bark();
		
	}
}
