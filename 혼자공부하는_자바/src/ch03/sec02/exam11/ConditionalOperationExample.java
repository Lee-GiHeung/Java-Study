package ch03.sec02.exam11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		// 점수 판정 예제
		int score = 85;
		
		// 점수가 90점이 아니므로 거짓부분이 실행됩니다.
		// 거짓 부분에서 다시 삼항연사를 비교하고 있습니다.
		// 그 결과 80점보다 크기 때문에 'B' 값이 선택 됩니다.
		char grade = (score > 90) ? 'A' : 
			((score > 80) ? 'B' : 'C');
		
		System.out.println(score + "점은 "  + grade + "등급입니다.");

	}

}
