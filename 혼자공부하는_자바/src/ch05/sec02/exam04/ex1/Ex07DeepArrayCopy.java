package ch05.sec02.exam04.ex1;

public class Ex07DeepArrayCopy {

	public static void main(String[] args) {
		// 원본배열
		int[] list = {10, 20, 30, 40, 50};
		
		// 복사본배열
		// 깊은 복사는 
		// 1. 공간(주소)을 확보 해야 함
		// 2. 복사할 원본과 크기가 같아야 하므로 
		// 	  new 배열타입[원본의 배열크기]으로 공간확보가 필요
		// 3. 루프를 통하여 원본의 개별요소를 복사본의 개별요소에 저장
		int[] numbers = new int[list.length]; 
				
		// 원본의 갯수만큼 복사
		for(int i = 0 ; i < list.length; i++) {
			numbers[i] = list[i];
			
		}
		
		// 1. 원본과 복사본이 같은가
		
		// 원본 배열의 내용정보를 보여주는 toString() 출력
		System.out.println(list.toString());
		// 복사본 원본 배열의 내용정보를 보여주는 toString() 출력
		System.out.println(numbers.toString());
		// 비교 연산자를 사용하여 정확한 정보를 비교
		if(list == numbers) {
			System.out.println("list == numbers");
		} else {
			System.out.println("list != numbers");
		}
		
		// 3. 두 배열의 내용을 출력
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		
		System.out.println("-------------------------");
		for(int i = 0 ; i < list.length; i++){
			System.out.println(numbers[i]);
		}
		
		// 4. 복사본(numbers)의 배열 요소를 고치면 원본의 변화가 있는지
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = 0;
		}
		
		// 변경된 복사본 내용 
		for(int i = 0 ; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		//원본(list)에 배열요소가 전부 0으로 바뀌었는가
		for(int i = 0 ; i < list.length; i++) {
			System.out.println(list[i]);
		}
 	}

}
