package ch11.sec02.exam02;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		// 현재 달력을 만들자
		// Calendar 클래스는 추상클래스를 직접 객체를 생성못함
		// 대신에 static 메소드로 getInstance()함수를 이용
		// 운영체제 시간을 얻어옴
		Calendar now = Calendar.getInstance();
		
		// 연도 구하기
		int year = now.get(Calendar.YEAR);
		// 달 구하기
		int month = now.get(Calendar.MONTH + 1);
		// 일 구하기
		int day = now.get(Calendar.DAY_OF_MONTH);
		// 요일 구하기 (숫자를 리턴하므로) 한글로 표기하려면
		// swtich 블록을 만들어야 함
		int week = now.get(Calendar.DAY_OF_WEEK);
		
		String strWeek = null;
		
		switch(week) {
			case Calendar.MONDAY:
				strWeek = "월";
		
			case Calendar.TUESDAY:
				strWeek = "화";
		
			case Calendar.WEDNESDAY:
				strWeek = "수";
			
			case Calendar.THURSDAY:
				strWeek = "목";
			
			case Calendar.FRIDAY:
				strWeek = "금";
			
			case Calendar.SATURDAY:
				strWeek = "토";
			
			default :
				strWeek = "일";
			}
		
			int amPm = now.get(Calendar.AM_PM);
			String strAmPm = null;
			if(amPm == Calendar.AM) {
				strAmPm = "오전";
			} else {
				strAmPm = "오후";
			}
			
			int hour = now.get(Calendar.HOUR);
			int minute = now.get(Calendar.MINUTE);
			int second = now.get(Calendar.SECOND);
			
			System.out.println(year + "년 ");
			System.out.println(month + "월 ");
			System.out.println(day + "일 ");
	}

}
