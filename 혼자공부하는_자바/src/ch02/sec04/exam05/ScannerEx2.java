package ch02.sec04.exam05;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		
		
		System.out.println("첫번째 수");
		String strNum1 = sc.nextLine();
		
		System.out.println("두번째 수");
		String strNum2 = sc.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈결과 : " + result);
		
	}

}
