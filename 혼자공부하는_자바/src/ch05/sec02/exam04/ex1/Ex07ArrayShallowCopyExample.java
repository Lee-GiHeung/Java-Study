package ch05.sec02.exam04.ex1;

// Shallow Copy얕은 복사
public class Ex07ArrayShallowCopyExample {
	public static void main(String[] args) {
		int[] list = {10, 20, 30, 40, 50};  
		// 얕은복사 (Shallow Copy)를 이용한 배열요소 복사하기
		int[] numbers = list;
		
		// 원본 배열 출력
		for(int number : list) {
			System.out.println(number);
		}
		
		System.out.println("----------------------------");
		// 복사된 배열 출력
		for (int number : numbers) {
			System.out.println(number);
		}
		
		System.out.println("----------------------------");
		// numbers와 list가 서로 같은가 참조 비교
		if(list == numbers) {
			System.out.println("list 배열과 numbers 배열이 같음.");
		} else {
			System.out.println("list 배열과 numbers 배열이 다름.");
		}
		
		// 내용을 비교하는 equals()메소드 확인
		if(list.equals(numbers)) {
			System.out.println("list배열과  numbers이 같음");
		} else { 
			System.out.println("list배열과  numbers이 다름");
		}
	
		// numbers와 list의 개별 배열요소를 비교
		for(int i = 0 ; i < list.length; i++) {
			if(list[i] == numbers[i]) {
				System.out.println("list와 numbers의 개별요소가 같음");
			} else {
				System.out.println("list와 numbers의 개별요소가 다름.");
			}
			
		}
 		System.out.println("=================================");
		// 데이터객체의 정보를 특징을 해쉬값으로 출력하라 
		System.out.println(list.toString());
		System.out.println(numbers.toString());
//		list = null;
//		System.out.println(list.toString());
//		System.out.println(numbers.toString());
				
		// 복사본 numbers의 데이터값을 데이터요소 * 10을 해서 내용을 바꿈
		// list 원본에 영향이 있을지 살펴보기
		
		// numbers 배열의 내용이 바뀌었는지 확인
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers[i] * 10;					
			
		}
		
		System.out.println("----------numbers와 list가 바뀌었는가----------------");
		
		// 원본 list 배열의 내용이 바뀌었는지 확인
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);					
			
		}
		// 참조복사 또는 얕은 복사는
		// 같은 메모리를 가르킨다
		// 같은 내용물을 가르킨다
		// list == numbers
	
	}
	
}
