package ch03.sec02.exam07;

public class CompareOperatorExample1 {

	public static void main(String[] args) {
		char char1 = 'A';
		char char2 = 'B' + 1;
		int i = 100;
		
		boolean result4 = (char1 < char2);
		boolean result5 = (char1 < i);
		
		System.out.println("result4 : " + result4);	
		System.out.println("result5 : " + result5);
		
	}

}
