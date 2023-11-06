package ch04.sec01.exam05;

public class SwitchExample {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 6) + 1;
		String msg = "번이 나왔습니다.";
		
		// num 변수와 case의 값이 일치하는 것을 찾는다.  
		// 크다 / 작다 비교는 할 수 없습니다.
		// 해당하는 case 문을 실행하고 나면 반드시 break;
		// 실행해서 끝을 나타내 주셔야 합니다.		
		switch(num) {
		case 1 : 
			msg = num + msg;
			break;
			
		case 2 : 
			msg = num + msg;
			break;
			
		case 3 :
			msg = num + msg;
			break;
			
		case 4 : 
			msg = num + msg;
			break;
			
		case 5 : 
			msg = num + msg;
			break;
			
		case 6 :
			msg = num + msg;
			break;
		default : 
			msg = "주사위 눈금이 잘못되었습니다";
			break;
		}
		
		// 뷰 결과 출력
		System.out.println(msg);
	}
}
