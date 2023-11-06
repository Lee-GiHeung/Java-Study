package ch02.sec02.exam04;

public class CharExample {

	public static void main(String[] args) {
		char c1 = 'A'; 		// 문자를 직접 저장
		char c2 = 65; 		// 10진수로 저장
		char c3 = '\u0041'; // 16진수로 저장
		
		char c4 = '가';		// 문자를 직접 저장
		char c5 = 44032;	// 10진수로 저장
		char c6 = '\uac00'; // 16진수로 저장
		
		double d1 = 1_000_00.123_456;
		//이스케이프 시퀀스(ESCAPE SEQUENCE) "문자의 문자)
		// \" : " 문자 출력
		// \' : ' 문자 출력
		// \n : 새 행으로 커서 이동
		// \r : 현재 라인의 제일 첫 열로 이동
		// \v : 수직 탭 
		// \t : 여러칸을 출력 
		String greeting = "안녕하세요\n = 'Hello\'\t\t\"Hi!\"";		
		System.out.println(greeting);
		
		String str = "나는 \" 자바\"를 좋아합니다.";
		System.out.println(str);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);

	}

}
