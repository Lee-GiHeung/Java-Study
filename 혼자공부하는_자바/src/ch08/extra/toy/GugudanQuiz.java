package ch08.extra.toy;

import java.util.Random;

public class GugudanQuiz extends Quiz{

	// 필드
	
	// 생성자
	GugudanQuiz() {
		createQuestion();
	}
	
	// 메소드
	@Override
	void createQuestion() {
	/**
	 * 구구단 퀴즈 알고리즘
	 1. 난수로 몇단인가를 생성
	조금 더 확장 사용자 입력 받아도 됨
	2. 출제된 구구단 계산결과에서 사용자에게
	보여주지 않을 위치 번호 생성 
	예) 난수 3단을생성 3열을 안보여주려고 함
	 위치 :        1|  2|3|  4|  5|  6|  7|  8|  9|
	구구단 값 : 3*1|3*2|0|3*4|3*5|3*6|3*7|3*8|3*9
	3. 구구단 계산결과 화면에 출력
	화면에 보여줄 계산결과와
	화면에 보여주지 않을 사용자가 입력할 계산 결과를 
	합쳐서 문제를 생성하여 문자열을 화면에 입력
	4. 정답 문자열을 생성하여 출력
	5. 힌트 문자열 생성하여 출력
	
	난수 발생
	Math.random() : 사용하기 편한 대신 세세한 설정하려할때 복잡
	Random 클래스 : 객체를 생성해야하고 메소드 학습 해야하지만 응용성이 좋음
	*/
		
		Random rnd = new Random();
		// 2.
		// 몇단인가 난수 생성
		int dan = rnd.nextInt(10); // 0 <= dan < 10인 정수
		// 출제된 문제에서 감춰질 위치번호
		int qId = rnd.nextInt(10);
		final int MAX_QUESTUIN_ID = 9; // 구구단의 마지막 열
		
		// 3. 
		// 화면에 출력할 문자열
		this.question = ""; 
		this.answer = "";
		
		// 구구단 열을 생성하는 루프 1~9까지
		for(int i = 0; i < MAX_QUESTUIN_ID  ; i++) {
			// 구구단 계산 결과를 보여줄 때 
			if (i == (qId - 1)) {
				this.question += "[ㅇ]";
			} else { // 계산결과 보여주지 않을때
				this.question += "[" + dan * (i + 1) + "]"; 
			}
		}
		// 문제 문자열
		this.question += "\n:ㅇ에 들어갈 수는 몇인가요 ?";
		// 정답 문자열
		this.answer = "정답 : " + (dan + qId);
	}

	@Override
	public String getHint() { // 힌트 추가
		return "우선 구구단이 몇 단인지 생각해보세요";
	}
	
}