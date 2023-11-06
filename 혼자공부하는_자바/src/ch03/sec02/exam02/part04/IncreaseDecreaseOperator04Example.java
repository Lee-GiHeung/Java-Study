package ch03.sec02.exam02.part04;

public class IncreaseDecreaseOperator04Example {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z = 0;
		
		System.out.println("---------복합 증감 연산-----------");
		System.out.println("복합증감연산 전 기본값 z : " + z);
		System.out.println("복합증감연산 전 기본값 x : " + x);
		System.out.println("복합증감연산 전 기본값 y : " + y);
		
		System.out.println("z = ++x y++ 연산후 ==> ");
		z = ++x + y++;
		// 위의 연삭식은 내부적으로 이렇게 됨
		// z = ++x + y;
		// y = y + 1;
		// 실행순서	
		// 먼저 =(대입연산자)는 하나의 연산식에서
		// 연산의 흐름에서 마지막 실행(하나의 연산식)
		// ++x 하나로 보고 항상 먼저 게산
		// y++ y포함 연산후에 마지막에 y = y + 1 
		// y++ y관련연산식 y = y+1;으로
		
		System.out.println("연산후 z : " + z);
		System.out.println("연산후 x : " + x);
		System.out.println("연산후 y : " + y);
		
	}

}
