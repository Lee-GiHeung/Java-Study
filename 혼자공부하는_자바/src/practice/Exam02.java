package practice;

import java.util.Calendar;

public class Exam02 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH);
		int date = today.get(Calendar.DATE);
				
		int dayOfWeek = today.get(Calendar.DAY_OF_WEEK);
		int hour = today.get(Calendar.HOUR);
		int second = today.get(Calendar.SECOND);
		
		
		System.out.println(
			year + "년 " + month + "월 " + date + "일 " + hour + "시 " + second + "분" + dayOfWeek);
	}

}
