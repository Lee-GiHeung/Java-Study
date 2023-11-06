package ch04.sec02.exam04;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		// float를 이용한 반복문
		// 초기값 자리에 float
		// 조건식 float
		// 증감식이 float 다른 차이 없음 
		// 하지만 루프변수로는 안쓰는게 좋다
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}

	}

}