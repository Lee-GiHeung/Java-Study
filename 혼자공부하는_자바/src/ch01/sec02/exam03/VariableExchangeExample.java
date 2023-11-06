package ch01.sec02.exam03;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		//교환하기 전 각 변수값 출력확인
		System.out.println("x:" + x + ", y:" + y);
				
		
		// 교환하기
		// 교환용 임시변수 준비
		// x값을 temp에 대입
		int temp = x;
		x = y; //x에 y값 대입
		y = temp; // y변수에 x의 값을 알고 있는 temp변수 사용
		System.out.println("x:" + x + ", y:" + y);

	}

}
