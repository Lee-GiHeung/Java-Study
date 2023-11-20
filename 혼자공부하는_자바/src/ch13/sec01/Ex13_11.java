package ch13.sec01;
/*
 * join()을 사용하지 않았으면 main 쓰레드는 바로 종료되었겠지만, 
 * join()으로 쓰레드 th1과 th2의 작업을 마칠 때 까지 main 쓰레드가 기다리도록 했다
 * 그래서 main 쓰레드가 두 쓰레드의 작업에 소요된 시간을 출력할 수 있다
 */
public class Ex13_11 {
	static long startTime = 0;
	
	public static void main(String[] args) {
		ThreadEx11_1 th1 = new ThreadEx11_1();
		ThreadEx11_2 th2 = new ThreadEx11_2();
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();
		
		try {
			th1.join(); // main 쓰레드가 th1의 작업이 끝날 때까지 기다림
			th2.join(); // main 쓰레드가 th2의 작업이 끝날 때까지 기다림
		} catch(InterruptedException e) {}

		System.out.println("소요시간 : " + (System.currentTimeMillis() 
				- Ex13_11.startTime));		
	}	
}
class ThreadEx11_1 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.println(new String("-"));
		}
	}
}

class ThreadEx11_2 extends Thread { 
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.println(new String("|"));
		}
	}
}