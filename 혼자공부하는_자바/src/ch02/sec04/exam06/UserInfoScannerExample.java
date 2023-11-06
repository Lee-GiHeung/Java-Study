package ch02.sec04.exam06;

import java.util.Scanner;

public class UserInfoScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String name;
		String ssnNum;
		String phone;
				
		// 사용자 정보 입력화면
		System.out.println("[필수 정보 입력]");
				
		System.out.println("1. 이름:");
		name = sc.nextLine();
		System.out.println("2. 주민번호 앞 6자리:");
		ssnNum = sc.nextLine();
		System.out.println("3. 전화번호:");
		phone = sc.nextLine();
			
		//입력 내용 출력화면
		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(ssnNum);
		System.out.println(phone);
		
	}

}