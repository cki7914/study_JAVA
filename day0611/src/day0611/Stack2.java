package day0611;

import java.util.EmptyStackException;
import java.util.Stack;

public class Stack2 {
	public static void main(String[] args) {
		Stack st = new Stack();
		String expression = "((2*3)+(1+2))";
		
		System.out.println("expression : " + expression);
		try {
			for(int i = 0 ; i < expression.length() ; i++) {
				if(expression.charAt(i) == '(') st.add('(');
				if(expression.charAt(i) == ')') st.pop();
			}
		} catch(EmptyStackException e) {
			System.out.println("여는 괄호가 맞지 않습니다.");
		} finally {
			if(st.empty()) System.out.println("괄호가 일치합니다.");
			else System.out.println("닫는 괄호가 맞지 않습니다.");
		}
	}
}
