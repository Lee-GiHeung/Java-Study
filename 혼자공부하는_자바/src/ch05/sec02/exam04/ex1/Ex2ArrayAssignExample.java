package ch05.sec02.exam04.ex1;

public class Ex2ArrayAssignExample {
	public static void main(String[] args) {
		// 1. 크기가 10인 정수형 배열을 생성 - model
		int[] num = new int[10];
		
		// 2. 각 배열에는 0부터 9까지의 값으로 채움
		//	  실제 데이터를 처리하는 비즈니스로직 
		//	  Business Logic - Controller라고 부름		
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i] = i);
		}
		
		// 3. 배열의 내용을 출력
		//	  Model과 Controller를 이용해서 화면에
		// 	  출력할 내용을 보여줌 - View
		
		//   이런 방식으로 프로그램을 설계해서 작성 
		//   MVC(MODEL - VIEW - CONTROLLER) 디자인패턴 이라고 합니다
		int count = 0;
		while (count < num.length) {
			System.out.print(num[count] + ", ");
			// 루프를 빠져나가려면 count변수가 변해서 조건식보다 커야함
			count++;
		
		}
		// 배열의 인덱스는 배열의 크기보다 -1작다
		// 그런데 배열에 크기값과 같은 인덱스를 사용하려 하면
		// 인덱스 예외가 발생한다.
		
//		num[num.length] = 10;
//		System.out.println("num[" + num.length + "] = " + num[num.length]);
		
	}
}
