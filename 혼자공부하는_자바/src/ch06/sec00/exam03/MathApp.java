package ch06.sec00.exam03;

public class MathApp {

	public static void main(String[] args) {
		// Math객체를 생성하고 작업
		// 덧셈객체
		Math mathObj = new Math();
		int addResult = mathObj.add(2, 3);
		System.out.println(
				"2와 3의 합은 " + addResult + "입니다.");

		// 뺄셈객체		
		int subResult = mathObj.sub(100, 50);
		System.out.println(
				"100 - 50 =  " + subResult + " 입니다");
		
		// 곱셈객체
		int mulResult = mathObj.mul(10,10);
		System.out.println(
				"10 곱하기 10 = " + mulResult + "입니다.");
		
		// 나눗셈객체
		int divResult = mathObj.div(20,5);
		System.out.println(
				"20 나누기 5 =  " + divResult);
		
		// 나머지 구하기
		int modResult = mathObj.mod(20, 3);
		System.out.println(
				"20 나누기 3의 나머지는 " + modResult + "입니다");
		
	}

}
