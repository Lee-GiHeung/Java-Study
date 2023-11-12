package ch12.sec01;

import java.util.Arrays;
import java.util.Comparator;
// 정렬할 땐 항상 정렬 기준이 필요함
// Arrays.sort()로 정렬할 때 아무런 정렬 기준을 주지 않았는데도 정렬이 되는 이유는
// 배열 arr에 저장된 Integer가 내부에 정렬 기준을 가지고 있기 때문
// 정렬할 때는 정렬 기준을 매개변수로 제공하던가 아니면,
// 저장된 객체가 정렬 기준을 가지고 있어서 한다. 그렇지 않으면 예외 발생
public class Ex12_8 {

	public static void main(String[] args) {
		Integer[] arr = {30, 50, 10, 40, 20};
		
		Arrays.sort(arr); //Integer가 가지고 있는 기본 정렬 기준 compareTo()를 정렬
		System.out.println(Arrays.toString(arr));
		
		// sort(Object[] objArr, Comparator c)
		Arrays.sort(arr, new DescComp());
		System.out.println(Arrays.toString(arr));
		
	}

}

class DescComp implements Comparator {
	public int compare(Object o1, Object o2) {
		if(!(o1 instanceof Integer && o2 instanceof Integer)) 
			return -1; //Integer 아니면, 비교하지 않고 -1 반환
	
		Integer i = (Integer)o1;
		Integer i2 = (Integer)o2;
		// return i2 - i; 또는 return i2.compareTo(i);도 가능
		return i.compareTo(i2) * -1; // 기본 정렬인 compareTo()의 역손으로 정렬
	
	
	}
}
/*
 * [10, 20, 30, 40, 50]
 * [50, 40, 30, 20, 10]	
 */
