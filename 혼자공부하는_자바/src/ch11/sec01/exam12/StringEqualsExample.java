package ch11.sec01.exam12;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVal1 = new String("신민철");
		String strVal2 = "신민철";
		
		if(strVal1 == strVal2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		
		if(strVal1.equals(strVal2)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
		
		// 깊은비교 : 참조변수가 가르키는 힙의 해당 데이터까지 비교 
	}

}
