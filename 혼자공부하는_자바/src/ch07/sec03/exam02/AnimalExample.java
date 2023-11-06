package ch07.sec03.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-------------------");

		// 변수의 자동 형 변환(업캐스팅)
		Animal animal = null;
		// Dog 객체를 만들어라
		// 만들 Dog객체를 초기화
		// 생성자 Dog()
		// 그 결과 힙에 만들어진 dog객체를 animal변수가 참조
		// 그래서 dog객체가 아니라 Animal 객체를 가르키므로 
		// 업캐스팅(upcasting)
		animal = new Dog();
		// animal이 dog객체를 가르키므로 
		// 메소드재정의에 의해
		// dog객체의 sound()임을 안다
		animal.sound();
		
		// animal참조변수가 객체가 
		// cat객체를 가르키므로 
		// 메소드재정의에 의해
		// cat객체의 sound()를 호출
		animal = new Cat();
		animal.sound();
		System.out.println("==================");
		
		// 메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
		
	}
	
	// main()를 포함하여 클래스는 무대역할을 하므로
	// 어디에서나 호출할 가능성이 크기때문에 public으로 설정
	public static void animalSound(Animal animal) {
		animal.sound();
		
	}

}
