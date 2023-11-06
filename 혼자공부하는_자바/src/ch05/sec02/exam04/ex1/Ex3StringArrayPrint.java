package ch05.sec02.exam04.ex1;

public class Ex3StringArrayPrint {

	public static void main(String[] args) {
		// 1. 피자토핑을 저장한느 변수를 선언
		// 2. 초기화를 이용하여 피자토핑값을 변수에 대입
		String[] toppings = new String[] {"Pepperoni", "Mushrooms","Onions","Sausage","Bacon"};
		
//		toppings = new String[] {"Pepperoni", "Mushrooms","Onions","Sausage","Bacon"};
		
		
		// 3. 피자토핑변수의 내용을 화면에 출력
		// 	  단 루프를 사용하여 출력
		for(int i = 0 ; i < toppings.length; i++) {
			System.out.print(toppings[i] + ", ");
		}
	}

}
