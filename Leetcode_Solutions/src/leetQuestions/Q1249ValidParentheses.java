package leetQuestions;

import java.util.Stack;

public class Q1249ValidParentheses {

	public static void findValidString(String s) {
		Stack<Integer> st = new Stack<Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == ')') {
				if (s.charAt(i) == '(') {
					st.push(i);
				} else { // )
					if (!st.isEmpty()) {
						if (s.charAt(st.peek()) == '(') {
							st.pop();
						}else{
							st.push(i);
						}
					} else {
						st.push(i);
					}
				}
			}
		}
		StringBuilder str = new StringBuilder(s);
		while (!st.isEmpty()) {
			str.deleteCharAt(st.peek());
			st.pop();
		}
		System.out.println(str);
	}

	public static void main(String[] args) {

		String s = "a)b(c)d";
		findValidString(s);

	}

}
