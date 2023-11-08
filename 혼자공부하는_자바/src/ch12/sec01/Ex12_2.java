package ch12.sec01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
// 스택 LIFO구조, 큐 FIFO구조
public class Ex12_2 {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList(); // Queue인터페이스의 구현체인 LinkedList를 사용
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("=========stack==========");
		while(!st.empty()) {
			System.out.println(st.pop()); // 스택에서 요소 하나를 꺼내 출력
		}
		
		System.out.println("======Queue===========");
		while(!q.isEmpty()) {
			System.out.println(q.poll()); // 큐에서 요소 하나를 꺼내 출력
		}
		
		
	}

}
