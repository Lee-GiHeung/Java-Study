package ch06.sec05.exam04;
		
public class SingletonExample {
		
	public static void main(String[] args) {
		// 객체를 오로지 한번(하나만) 만들어야 한다면 ?
		// 원래라면 아래와 같이 생성해야함
		//Singleton singleton1 = new Singleton();
		//Singleton singleton2 = new Singleton();
				
		// 하지만 유일 객체 생성을 원하므로
		// new Singleton() 대신에
		// Singleton객체.getInstance() 이용
		// 그러면 유일한 객체의 참조 주소를 돌려준다.
		
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		// 진짜 객체 하나만 생성되었는가?
		
		if(singleton1 == singleton2) {
			System.out.println("같은 Singleton 객체 입니다. ");
		} else {
			System.out.println("다름 Singleton 객체 입니다. ");
		}
		
	}   
			
}		