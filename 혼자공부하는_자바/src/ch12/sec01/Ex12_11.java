package ch12.sec01;

import java.util.HashSet;

public class Ex12_11 {
// HashSet은 객체를 저장하기 전에 기존에 같은 객체가 있는지 확인
// 같은 객체가 없으면 저장, 있으면 저장하지 않음
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 10));			
		set.add(new Person("David", 10));	
		
		System.out.println(set);
	}

}
class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name + ": " + age;
	}
}
