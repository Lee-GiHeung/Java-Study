package ch14.sec01;

import java.util.function.Predicate;

/*
 * &&(and), ||(or), !(not)로 연결해서 하나의 식을 구성할 수 있는 것처럼,
 * 여러 Predicate를 and(),or(),negate()로 연결해서 하나의 새로운 Predicate로 연결 가능
 */
public class Ex14_3 {

	public static void main(String[] args) {
		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i%2 == 0;
		Predicate<Integer> notP = p.negate();

		Predicate<Integer> all = notP.and(q.or(r));
		System.out.println(all.test(150));
		
		String str1 = "abc";
		String str2 = "abc";
		
		// str1과 str2가 같은지 비교한 결과를 반환
		Predicate<String> p2 = Predicate.isEqual(str1);
		boolean result = p2.test(str2);
		System.out.println(result);
		
	}

}
