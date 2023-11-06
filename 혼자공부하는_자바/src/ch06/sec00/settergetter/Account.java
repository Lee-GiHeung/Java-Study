package ch06.sec00.settergetter;

public class Account {
	private int regNumber; // 계좌번호
	private String name; // 소유자
	private int balance; // 잔고
	
	// 생성자
	Account() {
		
	}
	
	public Account(int regNumber) {
		this.regNumber = regNumber;
	}
	
	// 속성함수 정의
	void setName(String name) {
		this.name = name;
	}
	void setBalance(int balance) {
		// 만약 입금액이 < 0이면 입금액을 0으로 설정
		if(balance < 0) {
			this.balance = 0;
		} else { 
			this.balance = balance;
		}
	}
	
	// 읽기만 가능한 속성함수
	int getRegNumber() {
		return regNumber;
	}
	String getName() {
		return name;
	}
	int getBalance() {
		return balance;
	}
	
}
