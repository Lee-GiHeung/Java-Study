package ch04.sec02.exam05;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		// 단을 의미하는 변수 m
		// 각 단의 열을 의미하는 n
		// 예) 2 * 1 = 2, 2 * 2 = 4

		for (int m = 2; m <= 9; m++) {
			// 각 단의 열 반복
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + " X " + n + " = " + m * n);
			}
			System.out.println("---------------------------");

		}

	}
}