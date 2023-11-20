package ch13.sec01;
/*
 * 은행계좌(account)에서 잔고(balance)를 확인하고 임의의 금액을 출금(withdraw)하는 예제
 * 실행 결과를보면 잔고가 음수가 되는 것을 볼 수 있는데, 
 * 그 이유는 한 쓰레드가 if문의 조건식을 통과하고 출금하기 바로 직전에 
 * 다른 쓰레드가 끼어들면서 출금을 먼저 했기 때문
 */
public class Ex13_12 {

	public static void main(String[] args) {
		Runnable r = new RunnableEx12();
		new Thread(r).start(); // ThreadGroup에 의해 참조 대상이므로 gc대상 아님
		new Thread(r).start(); // ThreadGroup에 의해 참조 대상이므로 gc대상 아님	
	}
}

class Account {
	private int balance = 1000;
	
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int money) {
		if(balance >= money) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			balance -= money;
		}
	}	
}

class RunnableEx12 implements Runnable {
	Account acc = new Account();
	
	public void run() {
		while(acc.getBalance() > 0) {
			// 100, 200, 300중의 한 값을 임의로 선택해서 출금 
			int moeny = (int)(Math.random() * 3 + 1) * 100;
			acc.withdraw(moeny);
			System.out.println("balance : " + acc.getBalance());
		}
 	}
	
}