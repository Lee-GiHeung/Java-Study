package extra.sec01.exam04;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGameExample {

	public static void main(String[] args) {
		int GAME_ROCK = 1; // 주먹을 1이라고 설정
		int GAME_PAPER = 3; // 보를 3이라고 설정
		int GAME_SCISSORS = 2; // 가위를 2이라고 설정
		Scanner sc = new Scanner(System.in);
		System.out.println("## 가위 바위 보 게임 ##");
		System.out.println("( 1.주먹 2.가위  3.보)");
		System.out.print("숫자을 입력하세요 😊");
		int com = 0;
		int user = sc.nextInt();
		Random r = new Random();
		int comWinCount = 0;
		int userWinCount = 0;

		com = r.nextInt(3) + 1;
        // r.nextInt(3)은 0 ~ 2 에 숫자 중 램덤하게 나오기 때문에 +1 을 해서 1~3에 수가 나올수있게함  
        
		System.out.println("유저 " + user);
		System.out.println("컴퓨터" + com);

		if (user == GAME_ROCK) {
			if (com == GAME_SCISSORS) {
				System.out.println("유저 승리");
				userWinCount++;
				comWinCount--;
			} else if (com == GAME_PAPER) {
				System.out.println("유저 패배");
				userWinCount--;
				comWinCount++;
			} else {
				System.out.println("무승부");
			}
		} else if (user == GAME_SCISSORS) {
			if (com == GAME_SCISSORS) {
				System.out.println("무승부");
			} else if (com == GAME_PAPER) {
				System.out.println("유저 승리");
				userWinCount++;
				comWinCount--;				
				
			} else {
				System.out.println("유저 패배");
				userWinCount--;
				comWinCount++;				
			}
		} else if (user == GAME_PAPER) {
			if (com == GAME_SCISSORS) {
				System.out.println("유저 패배");
				userWinCount++;
				comWinCount--;					
			} else if (com == GAME_PAPER) {
				System.out.println("무승부");
			} else {
				System.out.println("유저 승리");
				userWinCount++;
				comWinCount--;	
			}
		} else {
			System.out.println("다시 입력 해주세요!!");
		}

		sc.close();		
		
		
//		int GAME_ROCK = 1; // 주먹을 1이라고 설정
//		int GAME_PAPER = 3; // 보를 3이라고 설정
//		int GAME_SCISSORS = 2; //가위를 2라고 설정
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("##가위바위보##");
//		System.out.println("1. 주먹 2.가위 3.보");
//		System.out.print("숫자를 입력하세요 : ");
//
//		int com = 0;
//		int user = sc.nextInt();
//
//		Random r = new Random();
//		int countWinCount = 0;
//		countWinCount = sc.nextInt();
//		
//		com = r.nextInt(3) + 1;
//		
//		if(user == GAME_ROCK) {
//			if (com == GAME_SCISSORS) {
//				System.out.println("승리");
//			}
//			else if (com == GAME_PAPER) {
//				System.out.println("패배");
//			}
//			else  {
//				System.out.println("무승부");
//			}
//		} else if (user == GAME_SCISSORS) {
//			System.out.println("");
//		} else {
//			System.out.println("");
//		}
	}
}
