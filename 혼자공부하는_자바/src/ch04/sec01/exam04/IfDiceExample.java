package ch04.sec01.exam04;

public class IfDiceExample {

	public static void main(String[] args) {
		// 1에서 6까지 임의의 주사위 눈금 생성
		int num = (int)(Math.random()*6) + 1;

		String msg = "번이 나왔습니다";
		
		// 각 주사위 눈금에 대한 메세지 작성
		if (num == 1) {
			msg = num + msg;
		} else if (num == 2) {
			msg = num + msg;
		} else if (num == 3) {
			msg = num + msg;
		} else if (num == 4) {
			msg = num + msg;
		} else if (num == 5) {
			msg = num + msg;
		} else if (num == 6){
			msg = num + msg;
		} else {
			msg = "주사위 번호가 잘못되었습니다";
		}
		
		// 결과 화면 출력
		System.out.println(msg);
		
	}

}
