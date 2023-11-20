package ch13.sec01;

import javax.swing.JOptionPane;
/*
 * 한 쓰레드가 sleep(), wait(), join()에 의해 '일시정지 상태(Waiting)'에 있을 때, 
 * 이 쓰레드에 대해 interrupt()를 호출하면 sleep(), wait(), join()에서 
 * Interrupted Exception이 발생하고 이 쓰레드는 '실행대기 상태(Runnable)'로 바뀜
 * 즉, 멈춰있던 쓰레드를 꺠워서 실행 가능한 상태로 만드는 것
 * 이 예제는 interrupt()와 interrupted()를 사용해서 수정한 것으로 카운트 다운 도중에
 * 사용자의 입력이 들어오면 카운트다운을 종료함
 */
public class Ex13_9 {

	public static void main(String[] args) {
		ThreadEx9_1 th1 = new ThreadEx9_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력하신 값은 " + input + "입니다.");
		th1.interrupt(); // interrupt()를 호출하면, interrupt상태가 true가 된다
		System.out.println("isInterrupt() : " + th1.isInterrupted()); // true
		
	}

}
class ThreadEx9_1 extends Thread {
	public void run() {
		int i=0;
		
		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x=0; x<2500000000L; x++); // 시간 지연
		}
		System.out.println("카운트가 종료되었습니다.");
	}
}