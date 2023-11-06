package extra.sec01.exam03;

import java.util.Random;

import java.text.SimpleDateFormat;
import java.util.Date; // 패키지의 대문자단어는 이 패키지에는 Date클래스
					   // 데이트 날짜 데이터 타입이 있음
public class SimpleFortuneGame {

	public static void main(String[] args) {
		// .오늘의 날짜를 얻어야 함 
		// .java.util.date 라이브러리 패키지에 있음
		// .import java.util.Date 라는 라이브러리를 가져와야 함
		// .오늘의 운세를 램덤정수로 판별 할 것임
		// .Random 라이브러리 필요
		// .java.util.Random 라이브러리 패키지를 사용
		// .날짜는 각 나라마다 출력형식이 다름
		// .따라서 출력형식을 지정할 필요가 있음
		// .날짜 출력형식 지정 클래스는 java.text.SimpleDateFormat안에 있음
		
		Date d = new Date();
		System.out.println(d);
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String strNowDate = sdf.format(d);
		System.out.println("바뀐 날짜 형식 : " + strNowDate);
	
		///표춘게임 드는 방법
		/// 1. 오늘 날짜를 얻습니다. today = new Date()l
		Date today = new Date(); //오늘 날짜를 가지고 있는 Date객체 생성
	
		/// 2.날짜 객체를 현재 국가에 따라 다르게 표시가 됨
		/// 따라서 이 부분을 한국 형식으로 바꾸어 출력합니다.
		/// SimpleDateFormat("yyyy년 MM월 dd일")
		/// 이 객체는 문자열을 리턴합니다.
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		/// 3. 위의 오늘의 날짜를 어떻게 한국식으로 출력 할 것 인가?
		/// 위 dateFormat 객체의 format(날짜객체)를 실행하면
		/// 지정한 형식의 현재 날짜 문자열을 반환합니다.
		/// System.out.print(); : 출력하고 커서가 마지막 칸에 머뭄
		/// System.out.println(); : 출력하고 커서가 다음줄로 이동
		
		System.out.println(dateFormat.format(today));
		
		/// 4. 오늘의 운세를 얻어야 함
		/// 오늘의 운세는 단순하게 해서 난수를 0~100 사이의 숫자를 구해서
		/// 이 숫자가 운세 백분율을 의미함
		/// 실제라면 운세 판단 공식이 필요함 
		/// 랜덤 객체를 만든다 new Random()
		Random rnd = new Random();
		
		/// 5. 만들어진 랜덤객체로부터 지정한 범위까지의 정수를 얻는다
		/// random.nextInt() % 100 : 임의의 수를 100으로 나눈 나머지를 구함 (0 ~ 99)
		/// random 객체는 음수도 발생시킴 따라서 무조건 양수로 변환 필요
		/// Math.abs(변환숫자) : 변환숫자를 무조건 양수로 반환
		/// random.nextInt() : 호출할 때 마다 난수를 발생
		
		int randomNum = Math.abs(rnd.nextInt() % 100) + 1; // +1 하면 100%도 가능
		
		/// 100으로 나눈 나머지의 양수에 +1 해주면 100% 행운 표시 가능
		/// 6.행운의 내용을 출력 
		System.out.println("금전운(100%) : " + randomNum + " %");
			
	}

}
