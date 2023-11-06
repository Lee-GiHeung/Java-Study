package ch09.sec03.exam01;

public class Main {
	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println(d.bark());
		
		// 부모 클래스 참조변수 a는 Dog객체를 가르킴
		// 업캐스팅으로 부모 객체의 구조만 보임
		Animal a = new Dog();
		System.out.println(d.bark());
		
		Animal c = new Cat();
		System.out.println(c.bark());
		
	}
}
