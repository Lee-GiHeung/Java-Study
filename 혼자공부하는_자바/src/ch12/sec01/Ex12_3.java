package ch12.sec01;

import java.util.EmptyStackException;
import java.util.Stack;

// 입력한 수식의 괄호가 올바른지 체크하는 예제 
public class Ex12_3 {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Usage:java Ex11_3 \"EXPRESSION\"");
			System.out.println("Usage:java Ex11_3 \"((2+3)*1)+3\"");
			System.exit(0);
		}

		Stack st = new Stack();
		String expression = args[0];
		
		System.out.println("expression : " + expression);
		
		try {
			for(int i=0; i < expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if(ch == '(') {
					st.push(ch + "");
				} else if (ch == ')') {
					st.pop();
				}				
			}
			
			if(st.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			} else {
				System.out.println("괄호가 일치하지 않습니다.");
			}
			
		} catch(EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다");
		}		
	}

}
