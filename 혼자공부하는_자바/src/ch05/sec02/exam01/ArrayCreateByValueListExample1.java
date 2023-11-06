package ch05.sec02.exam01;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		// 정수 배열 선언
		// 변수를 선언할 때 값을 대입하는 것
		// = 초기화 (Initialize)
		int[] scores = {83, 90 ,87}; 
		
		// scores 배열의 첫 번쨰 요소 index번호 0
		System.out.println("scores[0] : " + scores[0]);
		// scores 배열의 첫 번쨰 요소 index번호 1
		System.out.println("scores[1] : " + scores[1]);
		// scores 배열의 첫 번쨰 요소 index번호 2
		System.out.println("scores[2] : " + scores[2]);
		
		
		//scores 배열의 크기(=갯수) 구하는 변수 선언
		int scoresLength = 0;
		int sum = 0; // 현재 합계낸적이 없음 따라서 초깃값은 0이 좋음
		for (int i = 0 ; i < 3; i ++) {
			scoresLength++; // 현재 사용중인 배열의 수
			sum += scores[i];
		}
		System.out.println("scores 배열의 총합은 : " + sum);	
		// 평균구하기
		double avg = (double) sum / scoresLength;
		System.out.println("scores 배열의 평균은 : " + avg);
		
	}

}
