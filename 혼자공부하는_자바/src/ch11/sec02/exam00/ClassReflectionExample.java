package ch11.sec02.exam00;

public class ClassReflectionExample {

	public static void main(String[] args) throws ClassNotFoundException {
		// 1. 바이트코드(자바 기계어 실행파일)를 분석을 위해 
		// 클래스(바이트코드 파일) 파일을 읽어오는 방법
		Class clazz = Car.class;
		// 방법1로 불러온 바이트코드 정보 출력
		System.out.println(
			"### clazz 클래스 정보 얻기 ###");
		System.out.println(
			"clazz 참조 클래스의 이름 : " + clazz.getName());
		System.out.println(
			"clazz의 클래스의 이름 : " + clazz.getSimpleName());
		System.out.println("clazz의 패키지이름 : " + clazz.getPackage().getName());
		
		// 2. 클래스(바이트코드) 파일을 읽어오는 방법2
		Class clazz2 = Class.forName("ch11.sec02.exam00.Car");
		// 방법2로 불러온 바이트코드 정보 출력
		System.out.println(
			"### clazz2 클래스 정보 얻기 ###");
		System.out.println(
			"clazz2 참조 클래스의 이름 : " + clazz2.getName());
		System.out.println(
			"clazz2의 클래스의 이름 : " + clazz2.getSimpleName());
		System.out.println("clazz2의 패키지이름 : " + clazz2.getPackage().getName());
		
		// 3. 클래스(바이트코드) 파일을 읽어오는 방법3
		Car car = new Car();
		Class clazz3 = car.getClass();
		// 방법2로 불러온 바이트코드 정보 출력
		System.out.println(
			"### clazz3 클래스 정보 얻기 ###");
		System.out.println(
			"clazz3 참조 클래스의 이름 : " + clazz3.getName());
		System.out.println(
			"clazz3의 클래스의 이름 : " + clazz3.getSimpleName());
		System.out.println("clazz3의 패키지이름 : " + clazz3.getPackage().getName());
	}

}
