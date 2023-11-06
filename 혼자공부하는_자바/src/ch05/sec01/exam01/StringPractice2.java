package ch05.sec01.exam01;

import java.util.Scanner;

public class StringPractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
		
		System.out.println("이름1 입력 : ");
		String name1 = sc.nextLine();
		
		System.out.println("이름2 입력 : ");		
		String name2 = sc.nextLine();
		
		System.out.println("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.println("국어1 점수 : ");
		int kor1 = sc.nextInt();
		
		System.out.println("국어2 점수 : ");
		int kor2 = sc.nextInt();
		
		System.out.println("영어 점수 : ");
		int eng = sc.nextInt();
		
		System.out.println("영어1 점수 : ");
		int eng1 = sc.nextInt();
		
		System.out.println("영어2 점수 : ");
		int eng2 = sc.nextInt();
		
		System.out.println("수학 점수 : ");
		int math = sc.nextInt();
		
		System.out.println("수학1 점수 : ");
		int math1 = sc.nextInt();
		
		System.out.println("수학2 점수 : ");
		int math2 = sc.nextInt();
		
		System.out.println(name + "의 총점 : " + kor + eng + math);
		System.out.println(name1 + "의 총점 : " +  kor1 + eng1 + math1);
		System.out.println(name2 + "의 총점 : " +  kor2 + eng2 + math2);
		
		System.out.println(name + "의 평균 : " + (kor + eng + math) / 3);
		System.out.println(name1 + "의 평균 : " + (kor1 + eng1 + math1) / 3);
		System.out.println(name2 + "의 평균 : " + (kor2 + eng2 + math2) / 3);
		
		
		
		
	}
}