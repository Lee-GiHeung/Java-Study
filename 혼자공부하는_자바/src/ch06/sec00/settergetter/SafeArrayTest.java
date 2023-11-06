package ch06.sec00.settergetter;

public class SafeArrayTest {

	public static void main(String[] args) {
		// 테스트 할 SafeArray 객체 생성
		SafeArray array = new SafeArray(3);
		
		for(int i = 0; i < array.length ; i++) {
			array.put(i, i * 10);
		}
		
		// 입력한 SafeArray값 출력
		for(int i = 0 ;i < array.length; i++) {
			System.out.println(
					"" + i + " = " + array.get(i));
		}
		
	}

}