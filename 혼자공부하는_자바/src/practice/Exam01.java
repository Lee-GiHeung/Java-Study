package practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exam01 {
	public static void main(String[] args) {
		Date date = new Date();
				
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일 화요일 hh시 mm분");
		String strDate = sdf.format(date);
		System.out.println(strDate);	
	}
}
