package ch06.sec04.exam02;

public class Computer {
	int sum1(int[] values) {
		int sum = 0;
		
		for(int i = 0 ; i < values.length; i++) {
			sum += values[i];
		}
		
		return sum;
	}
	
	// ... 연산자는 내부적으로 배열 
	int sum2(int ... values) {
		int sum = 0;
		
		for(int i = 0 ; i < values.length; i++) {
			sum += values[i];
		}
		
		return sum;
	}
	
}
