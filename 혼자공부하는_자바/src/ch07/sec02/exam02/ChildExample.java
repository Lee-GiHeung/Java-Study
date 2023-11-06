package ch07.sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		// 부모 타입으로 자식 객체 가르킴
		Parent parent = child;
		
		// 이 참조변수로 각 메소드를 부르면 ? 
		parent.method1(); // 부모 객체만 가지고 있으므로
						  // 부모 객체의 메소드가 불린다
		parent.method2(); // 자식 객체에서 새로 재정의 
						  // 되었으므로 자식 객체의 메소드가 실행  
		
		
//		parent.method3(); 부모 객체에서는 없는 내용
						// 이므로 예외발생
							
	}

}
