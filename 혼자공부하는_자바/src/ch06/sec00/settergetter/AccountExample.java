package ch06.sec00.settergetter;

public class AccountExample {

	public static void main(String[] args) {
		// 톰의 계정
		Account tomAccount = new Account();
		tomAccount.setName("Tom");
		tomAccount.setBalance(100_000);
		System.out.println(
				"이름은 " + tomAccount.getName() + 
				" 통장 잔고는 " + tomAccount.getBalance() +
				" 입니다.");
		
		// Jane의 계정
		Account janeAccount = new Account();
		janeAccount.setName("Jave");
		janeAccount.setBalance(1_000_000);
		System.out.println(
				"이름은 " + janeAccount.getName() + 
				" 통장 잔고는 " + janeAccount.getBalance() +
				" 입니다");
		
		// lili의 계정
		// 매개변수가 하나인 Account 생성자 메소드
		// Account 객체 초기화
		Account liliAccount = new Account(100010001);
		liliAccount.setBalance(-100_000);
		liliAccount.setName("LiLi");
		System.out.println(
				"계좌번호 : " + liliAccount.getRegNumber() + 
				" 이름은 " + liliAccount.getName() + 
				" 통장 잔고는 " + liliAccount.getBalance() +
				" 입니다.");
		
	}

}