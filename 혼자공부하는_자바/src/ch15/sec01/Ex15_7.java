package ch15.sec01;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
 *	에너테이션을 직접 정의하고, 
 *	에너테이션의 요소의 값을 출력하는 방법을 보여주는 예제
 */

@Deprecated
@SuppressWarnings("1111") // 유효하지 않은 에너테이션은 무시됨
@TestInfo(testedBy="aaa", testDate=@DateTime(yymmdd="230101",hhmmss="155959"))

class Ex15_7 {
	public static void main(String[] args) {
		// Ex15_7의 Class 객체를 얻는다
		Class<Ex15_7> cls = Ex15_7.class;
		
		TestInfo anno = cls.getAnnotation(TestInfo.class);
		System.out.println("anno.testedBy() = " + anno.testedBy());
		System.out.println("anno.testDate().yymmdd() = " 
							+ anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss() = " 
							+ anno.testDate().hhmmss());		
			
		for(String str : anno.testTools()) {
			System.out.println("testTols = " + str);
		}
		System.out.println();
		
		// Ex15_7에 적용된 모든 에너테이션을 가져온다
		Annotation[] annoArr = cls.getAnnotations();
		
		for(Annotation a : annoArr) {
			System.out.println(a);
		}	
	}
}

@Retention(RetentionPolicy.RUNTIME) // 실행 시에 사용가능하도록 지정
@interface TestInfo {
	int 	  count()     default 1;
	String    testedBy();
	String[]  testTools() default "Junit";
	TestType  testType()  default TestType.FIRST;
	DateTime  testDate();
	
}

@Retention(RetentionPolicy.RUNTIME) // 실행 시에 사용가능하도록 지정
@interface DateTime {
	String yymmdd();
	String hhmmss();
	
}

enum TestType {FIRST, FINAL}


