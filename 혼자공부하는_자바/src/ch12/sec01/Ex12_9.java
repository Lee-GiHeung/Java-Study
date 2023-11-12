package ch12.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// 중복된 값은 저장되지 않음
// add 메서드는 객체를 추가할 때 HashSet에 이미 같은 객체가 있으면
// 중복으로 간주하고 저장하지 않음
// Set은 순서를 유지하지 않기 때문에 저장한 순서와 다를 수 있음
public class Ex12_9 {
	public static void main(String[] args) {
		Object[] objArr = 
			{"1", new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet();
		
		for(int i=0; i<objArr.length; i++) {
			set.add(objArr[i]);	// HashSet에 objArr의 요소들을 저장
		}
		// HashSet에 저장된 요소들을 출력
		System.out.println(set);
		
		// HashSet에 저장된 요소들을 출력 (Iterator 이용)
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}