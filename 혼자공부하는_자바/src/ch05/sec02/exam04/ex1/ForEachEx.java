package ch05.sec02.exam04.ex1;

public class ForEachEx {

	public static void main(String[] args) {
		// 5명의 학생 이름을 변수(배열)에 저장
		// 저장된 학생의 이름을 출력
		// for~each 구문을 사용
		// 데이터 : 학생이름은 황진이,영희,홍길동,무지개,가을
		String[] studentName = new String[] {"황진이","영희","홍길동","무지개","가을"};  
		
		for(String name: studentName) {
			System.out.println(name);
		}
	
	}

}
