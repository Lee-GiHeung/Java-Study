package ch12.sec01;

import java.util.TreeSet;
// subSet()을 이용해서 범위검색을 할 때 시작범위는 포함되지만 끝 범위는 포함되지 않으므로
// result1에는 c로 시작하는 단어까지만 검색결과에 포함되어 있다
// 끝 범위인 d로 시작하는 단어를 포함시키고자 한다면, 
// 아래와 같이 끝 범위에 'zzz'와 같은 문자열을 붙이면 됨
public class Ex12_14 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();

		String from = "b";
		String to = "d";
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		
		System.out.println(set);
		System.out.println("reange search : from " + from + " to " + to);
		System.out.println("result1 : " + set.subSet(from, to));
		System.out.println("result2 : " + set.subSet(from, to + "zzz"));
		
	}

}
