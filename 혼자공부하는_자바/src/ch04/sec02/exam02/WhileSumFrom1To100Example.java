package ch04.sec02.exam02;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0; // 합계 저장 변수
		int i = 1; // 루프 카운터 변수
		
		while (i <= 1000) {
			sum += i;
			i++;
		}
		System.out.println("1 - 1000 합 = " + sum);
		
	}

}
