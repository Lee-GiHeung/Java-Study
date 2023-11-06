package ch02.sec04.exam04;

public class QStopExample {

	public static void main(String[] args) throws Exception {
			// 1.키코드를 저장한 변수
			int keyCode;
			// 1.5 키코드 읽기 무한 반복
			boolean isRunning = true;
	
			while (isRunning) {			
			// 2. 키보드로부터 키코드값을 읽어옵니다
			keyCode = System.in.read();			
			// 3. 화면에 출력
			System.out.println("keyCode : " + keyCode);
			
			// 3.5 만약 입력한 키코드가 'q'이면			
			//     반복 중지
			if(keyCode == 113) { //코드번호 113
				isRunning = false; // 조건식에 의해 자연스럽게 종료
//				break; 20,21번줄 같은뜻 (반복문 강제 종료)
			}			
		}		
		System.out.println("종료");
	}

}
