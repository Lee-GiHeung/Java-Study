package ch13.sec01;
/*
 	쓰레드 th1의 작업이 가장 먼저 종료되었고, 그 다음 th2, main의 순으로 종료됨
 	sleep()는 항상 현재 실행 중인 쓰레드에 대해 작동학 때문에 'th1.sleep(2000)'과
 	같이 호출되었어도 실제로 영향을 받는 것은 main메서드를 실행하는 main쓰레드이기 때문
 */
public class Ex13_8 {

	public static void main(String[] args) {
		ThreadEx8_1 th1 = new ThreadEx8_1();
		ThreadEx8_2 th2 = new ThreadEx8_2();
		th1.start();
		th2.start();
		
		try {
			th1.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("<<main 종료>>");
		}
	}
}
class ThreadEx8_1 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.println("-");
		}
	}
}
class ThreadEx8_2 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.println("|");
			System.out.println("<<th2 종료>>");
		}
	}
}
