package ch11.sec02.exam00;
import java.lang.reflect.Field;

public class ReflectByFieldExample {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		// 분석할 클래스 가져오기
		Class class1 = Class.forName("ch11.sec02.exam00.Child"); 
        
		// 불러온 바이트코드로부터 
		// 검색할 대상이 이번엔 필드
		// reflection으로 불러온 Child 클래스의 멤버필드
		// Class.getDeclaredField("필드명");
		Field field = class1.getDeclaredField("cstr1");
		// cstr1 필드의 시그니쳐 (=선언)
		System.out.println(
			"멤버 필드 cstr1의 형식 가져오기 : " + field);
		
		// 2. 모든 필드 정보를 다 가져와라
		//    Class.getDeclaredField()
		Class class2 = Class.forName("ch11.sec02.exam00.Parent");
		Field[] fields2 = class2.getDeclaredFields();
		// fields2 배열의 내용을 화면에 출력
		// 배열을 출력할 때는 for ~ each 루프가 적격
		for(Field fieldItem : fields2 ) {
			System.out.println(
				"Parent 클래스의 모든 필드변수 정보 출력 : " 
				+ fieldItem);
		}
		
		// 3. public 필드만 가져와라
		//    class.getField()
		Class class3 = Class.forName("ch11.sec02.exam00.Child");
		
		Field[] fields3 = class3.getFields(); 
		// field3의 정보 출력
		for(Field field3 : fields3) {
			System.out.println(
				"Child 클래스의 모든 public 필드변수 정보 : " + field3);
		}
		
	}

}
