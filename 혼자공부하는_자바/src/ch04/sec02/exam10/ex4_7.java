package ch04.sec02.exam10;

import java.util.Scanner;

public class ex4_7 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;	
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3. 잔고 | 4.종료");
			System.out.println("-------------------------------");
			System.out.println("선택>");
						
			int menuNum = sc.nextInt();
			int money = sc.nextInt();
				
			switch (menuNum) {
				case 1 :
					System.out.println("선택>" + menuNum);
					System.out.println("예금액>" + money );
					break;
				case 2 : 
					System.out.println("선택>" + menuNum);
					System.out.println("예금액>" + money);
					break;
				case 3 : 
					System.out.println("선택>" + menuNum);
					System.out.println("예금액>" + money);
					break;
				case 4 :
					run = false;
					break;
			}
		}

	}

}
