package ch06.sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person(
				"12345-123456","황진이");
		
		System.out.println("nation : " + p1.nation);
		System.out.println("ssn : " + p1.ssn);
		System.out.println("name : " + p1.name);

		
		////////////////////////////////////////
		Person p2 = new Person(
				"USA","12345-123456","JANE");
		
		System.out.println("nation : " + p2.nation);
		System.out.println("ssn : " + p2.ssn);
		System.out.println("name : " + p2.name);
		
	}

}
