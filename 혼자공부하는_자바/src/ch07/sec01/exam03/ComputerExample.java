package ch07.sec01.exam03;

public class ComputerExample {

	public static void main(String[] args) {
		// 반지름 10
		int r = 10;
		
		// 부모클래스 Calculator 객체 생성
		Calculator calculator = new Calculator();
		System.out.println(
			"Calculator 원 면적 : " + calculator.areaCircle(r));
		//// 위 아래 객체를 비교할 것이기 때문에
		System.out.println(); // 빈 줄을 추가
		
		// Computer클래스 객체 생성
		Computer computer = new Computer();
		System.out.println(
			"Computer 원면적 : " + computer.areaCircle(r));
		
	}

}
