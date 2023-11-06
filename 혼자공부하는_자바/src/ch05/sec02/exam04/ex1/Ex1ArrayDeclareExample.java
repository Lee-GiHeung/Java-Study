package ch05.sec02.exam04.ex1;

public class Ex1ArrayDeclareExample {

	public static void main(String[] args) {
		// 배열 선언하기
		// 10명의 학생 성적 저장하는 배열 선언
		String[] score = new String[10];
		
		// 초기화 아직 안함
		// 초기화 new 타입[] {} 형식
		
		// 기본타입은 초기화를 안하면 0에 가까운
		// 값으로 자동 초기화
		
		// 이 상태에서 배열의 내용을 출력
		for (int i = 0 ; i < score.length; i++) {
			System.out.println(
					"[" + i + "]= " + score[i]);
		}
		
	}

}