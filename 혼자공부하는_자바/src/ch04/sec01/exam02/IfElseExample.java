package ch04.sec01.exam02;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");

		int score = sc.nextInt();	
		// 등급 변수 선언
		char grade = '\u0000';
				
		// 점수를 판정한다
		// score >= 90이면 'A'학점
		// 아니면 'B'학점
		// 점수를 출력
		
		if(score >= 90) {
			grade = 'A';
		} else {
			grade = 'B';			
		}
				
		System.out.println("점수는 " + score + "점 입니다.");
		System.out.println("등급은 "+ grade +"입니다");
	}

}
