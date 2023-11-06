package ch08.extra.toy;

import java.util.Random;

public class FourBasicCalcQuiz extends Quiz {
	// 필드
	final int CALC_ADD = 0;
	final int CALC_SUBTRACT = 1;
	final int CALC_MULTIPLY = 2;
	final int CALC_DIVIDE = 3;
	final int CALC_MAX_NUMBER = 100;
	
	String hint;
	
	@Override
	public String getHint() {
		
		return this.hint;
	}
	
	// 생성자
	FourBasicCalcQuiz() {
		createQuestion();
	}

	@Override
	void createQuestion() {
		Random rnd = new Random();
		
		int choice = rnd.nextInt(4);
		
		// 두 수의 난수를 발생 시킴
		// 그 두수와 연산자를 화면에 출력
		// 계산결과를 사용자에게 입력
		// 결과와 사용자의 입력결과 비교
		// 결과가 참이면 참입니다. 출력
		// 결과가 거짓입니다. 출력
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		switch (choice) {
		case CALC_ADD : //덧셈
			num1 = rnd.nextInt(CALC_MAX_NUMBER);
			num2 = rnd.nextInt(CALC_MAX_NUMBER);
			
			result = num1 + num2;
			
			this.question = """
				$num1 + $num2 = $result 연산의 결과는 ???
					"""
				.replace("$num1", "" + num1)
				.replace("$num2", "" + num2)
				.replace("$result", "" + "[ooo]");
			
			this.answer = """
					정답 : $num1 + $num2 = $result 입니다
						"""
					.replace("$num1", "" + num1)
					.replace("$num2", "" + num2)
					.replace("$result", "" + "[ooo]");
			
			this.hint = """
				두 정수의 덧셈에 대한 문제입니다.
					""";			
			break; // case 덧셈 정지
			
		case CALC_SUBTRACT : // 뺄셈
			num1 = rnd.nextInt(CALC_MAX_NUMBER);
			num2 = rnd.nextInt(CALC_MAX_NUMBER);
			
			result = num1 - num2;
			
			this.question = """
				$num1 - $num2 = $result 연산의 결과는??
					"""
				.replace("$num1", "" + num1)
//				.replace("$num2", "", +num2)
				.replace("$result", "" + result);
			
			this.answer = """
				정답 : $num1 - $num2 = $result 입니다
					"""
				.replace("$num1", "" + num1)
				.replace("$num2", "" + num2)
				.replace("$result", "" + result);
					
			break; // case 뺄셈 정지
			
		case 2 : // 곱셈
			break; // case 곱셈 정지

		case 3 : // 나눗셈
			break; // case 나눗셈 정지
			
		}
		
	}

}
