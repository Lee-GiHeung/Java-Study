package ch13.sec01;
/*
	'-'를 출력하는 작업과 '|'를 출력하는 작업을 
	하나의 쓰레드가 연속적으로 처리하는 시간을 처리하는 예제
	수행시간을 측정하기 쉽게 "-"대신 'new String("-")를 
	사용해서 수행속도를 늦췄다
*/
public class Ex13_2 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i<300; i++) 
			System.out.printf("%s", new String("-"));
		
		System.out.println("소요시간1 : " +(System.currentTimeMillis() - startTime));
		
		for(int i=0; i<300; i++) 
			System.out.printf("%s", new String("|"));
		
		System.out.print("소요시간2 : " +(System.currentTimeMillis() - startTime));
		
	}

}
