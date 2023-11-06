package ch06.sec00.overloading;

public class MyMathApp {

	public static void main(String[] args) {
		// MyMath 형식으로 myMath 객체를 메모리에 만듦
		MyMath myMath = new MyMath();
		System.out.println(
			"10 * 10 = " + myMath.square(10));
		System.out.println(
			"10.0 * 10.0 = " + myMath.square(10.0));
		
		
		// MyMath 형식의 myMath1 객체를 메모리에 만듦
		MyMath myMath1 = new MyMath();
		System.out.println(
			"10 * 10 = " + myMath1.square(10));
		System.out.println(
			"10.0 * 10.0 = " + myMath1.square(10.0));
		
		if(myMath == myMath1) {
			System.out.println("myMath 와 myMath1 객체는 서로 다른객체입니다");
		} 
	}

}
