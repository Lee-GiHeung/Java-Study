package ch06.sec00.string;

public class stringExample1 {

	public static void main(String[] args) {
		// 문자열 선언					  
		String proverb = "A Barking dog"; // new 연산자 생략
		String s1; // 문자열 결합 저장 변수
		String s2; // 문자 교환
		String s3; // 부분 문자열 구하기
		String s4; // 대문자로 교환
		
		s1 = proverb.concat(" never Bites!");
		// == proverb + " never Butes!"
		s2 = proverb.replace('B', 'b'); // B를 b로 바꿈
		s3 = proverb.substring(2, 5); // 인덱스 2부터 5까지의 부분 문자열을 가져와라
		s4 = proverb.toUpperCase(); // 대문자로 바꾸시오
	
		// 변환 결과 출력
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
	}

}
