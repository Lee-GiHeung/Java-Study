package ch03.sec02.exam11;

import java.util.Scanner;

public class Practiceex09 {

	public static void main(String[] args) {	
		// 키보드 입력 받을것이므로 Scanner 클래스 필요
		Scanner sc = new Scanner(System.in);
			
		String strNum = sc.nextLine();
		String strNum2 = sc.nextLine();
		
		// 두 수를 입력받을 것이므로 변수 두개가 필요
		double num1 = Double.parseDouble(strNum);
		double num2 = Double.parseDouble(strNum2);
		
		// 첫번째 수를 두번째수로 나눈다.
	 	
		
//		에러가 발생했을 경우
//		1. 나누는 수 num2가 0또는 0.0으로 나누었을때 처리
//		2. 어떤 상황이 일어나면 그 처리를 해라(조건문 필요)
		System.out.println("첫 번째 수 : " + num1);
		System.out.println("두 번째 수 : " + num2);

//		if ( (num2 == 0.0) ||
//			 (num2 == 0)) {
//			System.out.println("결과:무한대");
//		} else {
//			double result = num1 / num2 ;
//			System.out.println("결과:"+ result);
//		}		
		
		// 실제 프로그램은 정상적으로 동작하고 
		// 혹시나 예외(에러가)나면 예외처리가 동작하도록
		// 하는 것이 좋은 구조입니다.
		
		if (num2 != 0.0) {
			double result = num1 / num2 ;
			System.out.println("결과:"+ result);
		} else {
			// 0으로 나눈 경우 
			System.out.println("결과:무한대");
		}
		
	}
}