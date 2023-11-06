package ch01.sec02.exam04;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		
		if (v1 > 10) {
			int v2; //초기화 안했고, 변수 선언 위치 잘못됨
			v2 = v1 - 10;
		}
//		int v3 = v1 + v2 + 5;
//		System.out.println(v3);
	}

}
