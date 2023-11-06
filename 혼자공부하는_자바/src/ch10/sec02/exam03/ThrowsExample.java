package ch10.sec02.exam03;

public class ThrowsExample {

	public static void main(String[] args) {
 		try {
 			// findClass() 메소드를 사용
		 	findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
		
		// 실행할 함수를 정의
		// 발생한 예외처리를 외부로 부탁하는 경우
		// throws 예외종류, ... 구문을 사용
		// 반드시 외부에서 try ~ catch ~ finally로 처리해야함
		public static void findClass() throws ClassNotFoundException {
			Class clazz = Class.forName("java.lang.String2");
		}

}
