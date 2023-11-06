package ch02.sec03.exam05;

public class OperationPromotionExample {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		double result = x / y;
		System.out.println("x / y = " + result);

		// x, y를 강제로 더블형으로 변환해보자
		result = (double) x / y;
		System.out.println("(double)x / y = " + result);
	
	}

}
