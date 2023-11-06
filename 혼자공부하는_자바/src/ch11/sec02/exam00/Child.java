package ch11.sec02.exam00;

public class Child extends Parent {
	// 자손클래스의 필드
	public  String cstr1 = "1";
	private String cstr2 = "2";
	
	// 자손클래스의 생성자
	public Child() {
		
	}
	
	private Child(String str) {
		this.cstr1 = cstr1;
	}
	
	// 메소드 매개변수가 없는 경우
	public int method4() {
		System.out.println("method4 :  매개변수 없음");
		return 0;
	}
	
	// 메소드 매개변수가 있는 경우
	public int method4(int n) {
		System.out.println("method4 : " + n);
		return n;
	}
	
	private int method5(int n) {
		System.out.println("method5 : " + n);
		return n;
	}
	
	
}
