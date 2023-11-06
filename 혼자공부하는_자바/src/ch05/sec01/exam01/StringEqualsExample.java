package ch05.sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";

		// 두 스트링 비교하기
		// 저장공간의 위치와 내용물이 같다
		// 스트링형의 기본자료형과 같이 다루기
		// 관용표현으로 값만 다룬다.
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		// 그럼 진짜 값의 내용민 비교하는 경우 
		// 저장된 메모리의 위치를 참조하지 않고 
		// 내용물만 비교하는 경우 문자열.equals() 이용
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		// String 객체를 완전히 new String(...) 생성자를 이용해 생성하기
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
	
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		
		///////////////////////
		// strVar1(""로 객체생성)과 strVar3(new로 객체 생성)이 같은가?
		if(strVar1 == strVar3) {
			System.out.println("strVar1과 strVar3는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar3는 참조가 다름");
		}
		
		//문자열 안의 내용물은 같은가
		if(strVar1.equals(strVar3)) {
			System.out.println("strVar1과 strVar3는 문자열이 같음");
		} else {
			System.out.println("strVar1과 strVar3는 참조가 다름");
		}
			
	}

}