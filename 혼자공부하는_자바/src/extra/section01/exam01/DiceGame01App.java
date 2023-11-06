package extra.section01.exam01;

public class DiceGame01App {
	public static void main(String[] args) {
		//주사위 눈금을 얻으려면 난수를 이용합니다.
		//Math.random() 이용 : 0 <= 눈금 < 1 작은 실수 
		// (int) 강제로 정수로 바꿔주세요
		int num = (int) (Math.random() * 6) + 1;
		
		System.out.println("주사위 눈금 : " + num);
	}
}
