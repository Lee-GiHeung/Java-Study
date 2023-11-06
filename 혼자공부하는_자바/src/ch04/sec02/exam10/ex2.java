package ch04.sec02.exam10;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		/*
		 * 연습문제 2. 
		 * 반복문을 이해하고 있을까요. >_< 키보드로부터 암호를 입력합니다. 
		 * ㄱ) 암호를 비교하여 같으면 "암호 OK!" 출력
		 * L) 암호가 틀리면 "암호가 틀립니다!. 올바른 암호를 입력해주세요" 출력 
		 * ㄷ) 암호를 5번 틀리면
		 * "암호를 확인해주세요. 관리자에게 확인해 주세요." 출력 더이상 암호를 입력할 수 없도록 합니다.
		 * 
		 */
			
		Scanner sc =  new Scanner(System.in);		
		boolean running = true;
		String myPw = "12345";
		String pw = sc.nextLine();
		
		System.out.println("암호를 입력하세요 : ");

		while (running) {
			if (pw == myPw) {
				System.out.println("암호 ok");
			} else if (pw != myPw) {
				System.out.println("암호가 틀립니다!. 올바른 암호를 입력해주세요");
			} else {
				System.out.println("암호를 확인해주세요. 관리자에게 확인해 주세요");
				sc.close();
			}
		}
		
		
//		if(pw ==) {
//			System.out.println("암호 OK");
//		} else if (pw != ) {
//			System.out.println("암호가 틀립니다!. 올바른 암호를 입력해주세요");
//		} else {
//			System.out.println("암호를 확인해주세요. 관리자에게 확인해 주세요");
//			sc.close();
//		}
//		
	}

}
