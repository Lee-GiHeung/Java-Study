package ch04.sec02.exam02;

public class ForSumFrom1To100Example1 {

	public static void main(String[] args) {
		int sum = 0;
		int sum1 = 0;
		
		for(int i = 1; i <= 100; i++) {
			// 반복될 내용 
			// 홀수의 누적합
			if (i % 2 == 1) {
				sum += i;
			}
			
			if (i % 3 == 0) {
				sum1 += i;
			}
		}
		
		System.out.println("1 ~ 100합 : " + sum);
		System.out.println("1 ~ 100합 (3의 배수) : " + sum1);
	}

}