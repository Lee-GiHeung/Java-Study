package ch12.sec01;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex12_10 {
// 중복된 값은 저장되지 않는 HashSet의 성질을 이용해 로또 번호 만드는 예제
	public static void main(String[] args) {
		Set set = new HashSet();
		
		for(int i=0; set.size() < 6; i++) {
			int num = (int)(Math.random() * 45) + 1;
			set.add(new Integer(num));
		}
		
		List list = new LinkedList(set); // LinkedList(Collection c)
		Collections.sort(list); // Collections.sort(List list)
		System.out.println(list);
		
	}

}
