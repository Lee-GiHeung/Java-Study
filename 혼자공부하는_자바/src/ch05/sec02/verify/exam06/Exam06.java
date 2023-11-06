package ch05.sec02.verify.exam06;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// 기호상수
		// 이 부분의 내용은 나중에 Enum 클래스로 발전하게 됨
		final int MENU_STUDENT_NUMBER = 1;
		final int MENU_SCORE_INPUT = 2;
		final int MENU_SCORE_LIST = 3;
		final int MENU_SCORE_ANALYST = 4;
		final int MENU_APP_EXIT = 5;
		
		boolean run = true;
		int studentNum = 0;
		// 학생들 점수를 관리할 변수 (배열이용)
		int[] scores = null; // 참조타입의 0에 가까운 값은 null로 본다
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			// 1. 관리 메뉴 출력
			System.out.println("----------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3.점수리스트 | 4. 분석 | 5.종료" );
			System.out.println("----------------------------");
			System.out.println("선택> ");
			
			// 메뉴선택
			int selectNo = Integer.parseInt(sc.nextLine());			
			
			// 선택한 메뉴처리
			// if (selectNo == 1)
			switch(selectNo) {
				// 학생수 메뉴와 일치
				case 1 : 
					// '학생수>'라는 프롬프트 출력
					System.out.print("학생수");
					// 학생 수 입력
					studentNum = sc.nextInt();
					// scores 배열 초기화
					scores = new int[studentNum];
					break; // switch에서는 프로그램 흐름 제어 중요
				// 점수입력 메뉴와 일치
				case 2 :
					for(int i = 0 ; i < scores.length; i++) {
						System.out.println("scoress[" + i + "]>");
						scores[i] = sc.nextInt();
					}
					break;

				// 점수 리스트 메뉴와 일치
				case 3 :
					// 배열이므로 루프로 순차적으로 인덱스를 증가 시킴
					// 배열의 내용 출력
					for(int i = 0 ; i < scores.length; i++) {
						System.out.println("scores["+ i +"]:" + scores[i]);
					}
					break;
				// 점수 분석
				case 4 : 
					int max = 0; // 최고점수
					int total = 0; // 총점
					double avg = 0; // 평균
					
					for(int i = 0; i < scores.length; i++) {
						max = (max < scores[i]) ? scores[i] : max;
						total = total + scores[i];			 
					}
					
					avg = (double) total / scores.length;
					
					// 총점,평균,최고점수 출력
					System.out.println("최고점수 : " + max);
					System.out.println("총점 : " + total);
					System.out.println("평균 : " + avg);
					
					break;
					
				// 프로그램 종료
				case 5 :
					run = false;
					
					break;
					
				// 메뉴에 없는 선택
				default : 
					System.out.println("메뉴선택이 잘못되었습니다.");
			}
			
//			if(selectNo == 1) {
//				studentNum = Integer.parseInt(sc.nextLine());
//				System.out.println("학생수> " + studentNum);
//				
//			} else if (selectNo == 2) {
//				scores = new int[] {88, 95, 79};			
//				for(int i = 0 ; i < scores.length; i++) {
//					System.out.println(scores[i]);				
//				}
//				
//			} else if (selectNo == 3) {
//				scores = new int[] {88, 95, 79};
//				for(int i = 0 ; i < scores.length; i++) {
//					System.out.println(scores[i]);
//				}
//				
//			} else if (selectNo == 4) {
//				int max = 0;
//				max = sc.nextInt();
//				
//				for(int i = 0 ; i < scores.length; i++) {
//					if(max > scores[i]) {
//						max = scores[i];
//						System.out.println("최고 점수 : " + max);
//					}
//				}
//				
//			} else if (selectNo == 5) {
//				run = false;
//			}			
//		}
// 	
//		System.out.println("프로그램 종료");
//		
		}

	}
}
