package ch06.sec00.overloading;

public class MyMath {
	// 정수값을 제곱하여 리턴하는 메소드
	int square(int i) {
		return i * i;
	}
	
	// double값을 제곱하여 리턴하는 메소드
	double square(double i) {
		return i * i ;
	}
}
