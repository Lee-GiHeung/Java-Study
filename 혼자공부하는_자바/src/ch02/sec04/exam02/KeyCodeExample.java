package ch02.sec04.exam02;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception {
		// 키보드로부터 입력한 키코드 데이터 저장
		int keyCode;
		
		//안내 문자열을 출력
		System.out.print("키보드로부터 한글자를 입력해주세요 :) (엔터키를 눌러주세요)");
		
		// 처리부 + 입력부
		keyCode  = System.in.read();
		
		// 출력부
		System.out.println("keyCode : " + keyCode);

		keyCode  = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		keyCode  = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
	}

}
