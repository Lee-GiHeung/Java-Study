package ch04.sec02.exam10;

import java.time.LocalDate;

public class ex3 {

	public static void main(String[] args) {
		/*
		 * 연습문제 3. 다중 if ~ else if 또는 switch 이해하고 있을까요 ? >_< 
		 * 1) 오늘 날짜를 얻어서 현재 월을 구하시요.
		 * 2) 현재 월이 3월, 4월, 5월인 경우 현재 월 + "은 봄입니다." 6월, 7월, 8월인 경우 현재 월 + "은 여름입니다." 
		 * 9월,10월, 11월인 경우 현재 월 + "은 가을입니다." 
		 * 12월, 1월, 2월인 경우 현재 월 + "은 겨울입니다." 출력하세요 
		 * 3) 현재날짜는 LocalDateTime클래스를 참조하세요. import java.util.LocalDateTime; ... 
		 * 현재 날짜는 다음으로 LocalDateTime now = LocalDateTime.now (); 
		 * 현재월은 다음 메소드로 구합니다. int month = now.getMonthValue();
		 * 
		 */

		LocalDate now = LocalDate.now();	
		int monthValue = now.getMonthValue();
		System.out.println(monthValue);
		
		switch(monthValue) {
			case 3, 4, 5 : 
				System.out.println("현재 월은 봄 입니다");
			case 6, 7, 8 :
				System.out.println("현재 월은 여름 입니다");
			case 9, 10, 11 : 
				System.out.println("현재 월은 가을 입니다.");
				break;
			case 12, 1, 2 :
				System.out.println("현재 월은 겨울입니다.");
		}
		
	}

}
