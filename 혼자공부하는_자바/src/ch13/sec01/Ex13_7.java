package ch13.sec01;
/*
 	3초마다 autoSave의 값을 확인해서 그 값이 true이면, 
 	autoSave()를 호출하는 일을 무한히 반복되도록 하는 코드
 	만약 데몬쓰레드로 설정하지 않았다면,
 	이 프로그램을 강제종료 하지 않는 한 영원히 종료되지 않음
 */
public class Ex13_7 implements Runnable {
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		Thread t = new Thread(new Ex13_7());
		t.setDaemon(true); // 이 부분이 없으면 종료 되지 않음
		t.start();
		
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			System.out.println(i);
			
			if( i==5) {
				autoSave = true;
			}
		}
		System.out.println("프로그램을 종료합니다");
	}
	public void run() {
		while(true) {
			try {
				Thread.sleep(3 * 1000); // 3초마다
			} catch(InterruptedException e) {
				
			}
			// autoSave의 값이 true이면 autoSave()를 호출
			if(autoSave) {
				autoSave();
			}
		}
	}
	public void autoSave() {
		System.out.println("작업파일이 자동 저장 되었습니다.");
		
	}
}
