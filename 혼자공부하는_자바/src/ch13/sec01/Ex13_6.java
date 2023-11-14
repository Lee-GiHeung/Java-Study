package ch13.sec01;
/* 
	th1과 th2 모두 main 메서드에서 생성하였기 때문에 main메서드를 실행하는 쓰레드의 
	우선순위인 5를 상속 받고
	th2.setPriority(7)로 th2의 우선순위를 7로 변경한 다음에 
	start()를 호출해서 쓰레드를 실행시킴
	★ 스레드를 실행하기 전에만 우선순위를 변경할 수 있음
*/ 
public class Ex13_6 {

	public static void main(String[] args) {
		ThreadEx6_1 th1 = new ThreadEx6_1();
		ThreadEx6_2 th2 = new ThreadEx6_2();

		th2.setPriority(7);
		
		System.out.println("Priority of th1(-) : " + th1.getPriority());
		System.out.println("Priority of th1(|) : " + th2.getPriority());
		th1.start();
		th2.start();
	}

}
class ThreadEx6_1 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.println("-");
			for(int x=0; x<10000000; x++);
		}
	}
}
class ThreadEx6_2 extends Thread {
	public void run() {	
		for(int i=0; i<300; i++) {
			System.out.println("-");
			for(int x=0; x<10000000; x++);
		}
	}
}