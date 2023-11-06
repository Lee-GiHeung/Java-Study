package ch05.sec01.exam01;

import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("각 학생의 총점과 평균을 구하세요");

		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
		System.out.println("이름 입력1 : ");
		String name1 = sc.nextLine();
		System.out.println("이름 입력2 : ");
		String name2 = sc.nextLine();
		
		System.out.println("국어 : ");
		int kor = sc.nextInt();
		System.out.println("영어 : ");
		int eng = sc.nextInt();
		System.out.println("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = (double)sum / 3;
		
		System.out.println("총점 = " + sum );
		System.out.println("평균 = " + (kor + eng + math ) / 3);
		
	}

}
