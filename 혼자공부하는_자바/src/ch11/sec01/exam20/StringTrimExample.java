package ch11.sec01.exam20;
		
public class StringTrimExample {
			
	public static void main(String[] args) {
		String tel1 = "   02";
		String tel2 = "123   ";
		String tel3 = "   1234   ";
		
		String tel = tel1.trim() + 
					 tel2.trim() + 
					 tel3.trim();
		
		// 공백 제거 전
		System.out.println(tel1 + tel2 + tel3);
		// 공백 제거 후
		System.out.println(tel);
		
		// replace를 이용해서 공백 제거
		// 이 경우는 문자열 중간에 여백이 있는 경우
		// 중간 여백을 제거하고 싶을때 쓰면 좋음
		System.out.println(
			(tel1 + tel2 + tel3).replace(" ", ""));
		
	}

}