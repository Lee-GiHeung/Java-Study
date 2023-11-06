package ch04.sec02.ifscannerpractice;

import java.util.Scanner;

public class MaxValueFindExample {

	public static void main(String[] args) {
		/*
		 * 1. 3개의 정수값을 입력 받아 가장 큰수를 구하시오
		 *	  정수입력은 Scanner클래스를 이용하여 키보드로부터 입력 받는다
		 *
		 *[출력]
		 *새 정수의 최대값을 구합니다.
		 *i의 값 :) 100
		 *j의 값 :) 200
		 *k의 값 :) 300
		 *최대값은 300입니다.
		 * */
		
		//step1
		Scanner sc = new Scanner(System.in);
		
		// 정수를 입력하세요 sc.nextInt();
		System.out.println("세정수의 최대값을 구합니다.");
	
		System.out.println("첫번째 정수를 입력: ");		
		int i = sc.nextInt();
		System.out.println("두번째 정수를 입력: ");	
		int j = sc.nextInt();
		System.out.println("세번째 정수를 입력: ");	
		int k = sc.nextInt();
		
		//step2
		// 두 개의 정수를 비교하여 큰 정수를 max변수에 대입
		// 원본데이터 변수는 손상되면 안됨
		
		int max = 0; // 현재 비교한 최대값이 없음을 뜻함
		// 데이터 정수 벼눗 두개 선언
		int m = 100;
		int n = 200;
		
		// m > n 을 비교해서 큰 값을 변수 max변수에 대입해주세요
		// 크다는 비교연산자 사용
		if(m > n ) {
			max = m; // m이 n보다 크다
		} else if ( m == n) {
			max = m; // m과 n이 같다
		} else { // n이 m보다 크다
			max = n;
		}
		
		System.out.print(
				"m = " + m + ", n = " + n + 
				" => max = " + max + "\n");

		//step3
//		int max = 0;
//		int i = 100;
//		int j = 200;
//		int k = 300;
//		
//		// 먼저 i > j를 비교하고 큰 값을 max에 대입
//		if (i > j) {
//			max = i;
//		} else if (i == j) { 
//			max = i;
//		} else if (i < j) {
//			max = j;
//		}
//		
//		// max와 k를 비교 큰 값을 max에 대입
//		// 이렇게 하면 실제 데이터는 보존된다
//		if (max > k) {
//		} else if (max == k) { 
//		} else if (max < k) {
//			max = k;
//		}
//		
//		System.out.println(i + "," + j + "," +k + "," + 
//						"i,j,k 중 max 값은 : " + max);
	
	}
}