package ch05.sec02.exam03;

import java.time.LocalDateTime;

public class MonthGetSeasonFindExample {

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
		
		// 계절을 상수 이름으로 식별하기 쉽게 만든다.
		final int SEASON_SPRING = 0;
		final int SEASON_SUMMER = 1;
		final int SEASON_FALL = 2;
		final int SEASON_WINTER = 3;
		
		// 사계절 이름을 배열로 선언 및 초기화
		// seasons 배열변수 현재 만들어지면서
		// "봄" / "여름" / "가을" / "겨울"의 힙을 
		// 바로 가리키고 있음
		String[] seasons = new String[] {
			"봄", "여름", "가을", "겨울"
		};
		// 이 가르키는 것을 중지시킨다. (GC 작동)
		seasons = null;
		// 영어로 출력 하기를 원해서 새로운 힙 창고에 /
		// 새로운(new) String[4] 크기의 스트링 배열을 만든다
		// 데이터는 "Spring/Summer/Fall/Winter"로 초기화를 한다
		// {}안의 초기화 데이터로 배열의 크기를 알 수 있다.
		seasons = new String[] {
			"Spring", "Summer", "Fall", "Winter"
		};
		
		// 오늘 날짜 구하기 LocalDateTime 이라는 라이브러리가 필요
		// 오늘 날짜는 LocalDateTime.now()메소드로 구할수있음
		LocalDateTime now = LocalDateTime.now();	
		// 이번 달 구하기 LocalDateTime.getMonthValue();
		int monthValue = now.getMonthValue();
		System.out.println(monthValue);
		
		// 자바 17부터 적극적으로 권장하는 문자열 표기법
		// 프론트언어에서는 템플릿 문자열이라고 부르는
		// Multi-Line String
		String msg = """
			%s월은(는) %s 입니다.	
			""";
		
		// 달을 이용하여 계절을 판별
		if(3 <= monthValue && monthValue <= 5  ) {
			// 월에 따라 출력 메세지를 만듦
			msg = msg.formatted(
					monthValue , seasons[SEASON_SPRING]);
							
		} else if (6 <= monthValue && monthValue <= 8) {
			// 6 <= month <= 8 : 여름 = seasons[SUMMER]
			msg = msg.formatted(monthValue, seasons[SEASON_SUMMER]);
						
		} else if (9 <= monthValue && monthValue <= 11) {
			msg = msg.formatted(monthValue, seasons[SEASON_FALL]);
			
		} else if (12 <= monthValue && monthValue <= 2){
			msg = msg.formatted(monthValue, seasons[SEASON_WINTER]);
		}
		
		// msg 출력 문자열을 화면에 출력합니다
		System.out.println(msg);
		
//		switch(monthValue) {
//			case 3, 4, 5 : 
//				System.out.println("현재 월은 봄 입니다");
//			case 6, 7, 8 :
//				System.out.println("현재 월은 여름 입니다");
//			case 9, 10, 11 : 
//				System.out.println("현재 월은 가을 입니다.");
//				break;
//			case 12, 1, 2 :
//				System.out.println("현재 월은 겨울입니다.");
//		}

	}

}
