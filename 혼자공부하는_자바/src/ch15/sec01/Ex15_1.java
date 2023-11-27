package ch15.sec01;

import java.util.ArrayList;

/*
 * 지네릭 클래스의 객체를 생성할 때, 참조변수에 지정해준 지네릭 타입과 생성자에 
 * 지정해준 지네릭 타입은 일치해야함
 * 클래스 Tv와 Product가 서로 상속관계에 있어도 일치해야한다
 */
class Product {}
class Tv extends Product {}
class Audio extends Product {}

public class Ex15_1 {

	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<>();
		ArrayList<Tv> tvList = new ArrayList<>();
		// ArrayList<Product> tvList = new ArrayList<Tv>(); 타입에러
		// List<Tv> tvList = new ArrayList<Tv>(); OK. 다형성 
		
		productList.add(new Tv());
		productList.add(new Audio());
		
		tvList.add(new Tv());
		tvList.add(new Tv());
		
		printAll(productList);
		// printAll(tvList); 컴파일에러
	}

	public static void printAll(ArrayList<Product> list) {
		for(Product p : list) {
			System.out.println(p);
		}
		
	}

}
