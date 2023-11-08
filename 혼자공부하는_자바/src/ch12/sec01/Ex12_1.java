package ch12.sec01;

import java.util.ArrayList;
import java.util.Collections;
// ArrayList의 기본적인 메서드를 이용해서 객체를 다루는 방법을 보여주는 예제
// 저장된 순서 유지, sort 메서드 이용하여 지정된 객체 정렬
public class Ex12_1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1,list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2) : "
				+ list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); // 인덱스가 3인 곳에 "A"를 추가
		print(list1,list2);
		
		list2.set(3, "AA"); // 인덱스가 3인 곳을 "AA"로 변경
		print(list1, list2);
		
		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제
		System.out.println("list1.retainsAll(list2) : "
				+ list1.retainAll(list2));
		
		print(list1, list2);
		
		// list2에서 list1에 포함된 객체들을 삭제
		for(int i = list2.size()-1 ; i>=0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
		
	}

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
	}

}

/*
    list1: [5, 4, 2, 0, 1, 3]
	list2: [4, 2, 0]

	list1: [0, 1, 2, 3, 4, 5] -> Collections.sort(List 1)를 이용해서 정렬
	list2: [0, 2, 4]
	
	list1.containsAll(list2) -> list1이 list2의 모든 요소를 포함하고 있을 때 true
	list1: [0, 1, 2, 3, 4, 5]
	list2: [0, 2, 4, A, B, C] -> true - add(Object obj)를 이용해서 새로운 객체 저장
	
	list1: [0, 1, 2, 3, 4, 5]
	list2: [0, 2, 4, AA, B, C] -> set(int index, Object obj)를 이용해서 다른 객체로 변경
	
	list1.retainsAll(list2) : true -> retainAll에 의해 list1에 변화가 있었으므로 true 반환
	list1: [0, 2, 4] -> list2와의 공통요소 이외에는 모두 삭제됨
	list2: [0, 2, 4, AA, B, C]
	
	list1: [0, 2, 4]
	list2: [AA, B, C]

 * */

