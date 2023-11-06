package ch04.sec01.exam03;

import java.util.Scanner;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("점수를 입력하세요");

		int score = sc.nextInt();
	
		char grade = '\u0000';		
		
		if (score>=90) {
			grade = 'A';
		} else if (score>=80) {
			grade = 'B';
		} else if (score>=70) {
			grade = 'C';
		}  else {
			System.out.println("불합격");
		}
		
		System.out.println("점수는 " + score);
		System.out.println("등급은 " + grade);
		
	}

}
