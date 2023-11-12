package ch12.sec01;

import java.util.TreeSet;
// headSet메서드와 tailSet 메서드를 이용하면, TreeSet에 저장된 객체 중 지정된 기준 값보다 
// 큰 값의 객체들과 작은 값의 객체들을 얻을 수 있다
public class Ex11_15 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};		
		
		for(int i=0; i < score.length; i++) 
			set.add(new Integer(score[i])); //set.add(score[i]); 도 가능
			
		System.out.println("50보다 작은 값 : " + set.headSet(new Integer(50)));	
		System.out.println("50보다 큰 값 : " + set.tailSet(new Integer(50)));

	}
}
