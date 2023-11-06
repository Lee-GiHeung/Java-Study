package ch04.sec02.exam10;

public class ex4_3 {

	public static void main(String[] args) {
		// 초깃값은 안나오는 값을 선언@!~!@
		
		// 0) 프로그램에서 사용할 변수 선언 num1, num2
		// 1) 루프가 필요한가요 ? while ?
		// 2) 난수가 필요? int num = (int) (Math.random() * 6) + 1;
		// 3) System.out.printf("%d,%d", num1, num2 );
		// 4) 게임을 끝내는 조건? (num1 + num2) == 5 => break;
				
		boolean run = true;
	
		//Math.random() 		
		int num1 = (int) (Math.random() * 6) + 1;	
		int num2 = (int) (Math.random() * 6) + 1;
		
		// 2개의 주사위를 던졌을 때
		// 눈의 합이 5가 아니면 계속 주사위를 던지고
		// 눈의 합이 5이면 실행을 멈춤
		while(run) {
			if(num1 + num2 != 5) {
				System.out.println("(" + num1 + "," + num2 + ")");				
			} else {				
				break;
			}
		}
		
	}

}
