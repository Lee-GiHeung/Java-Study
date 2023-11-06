package ch11.sec02.exam01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// 현재시간 날짜 객체를 만드세요
		Date now = new Date(); // java.util.Date 클래스가 필요
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		// 날짜를 한국 형식으로 표현
		// 날짜를 화면에 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");

		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
	}

}