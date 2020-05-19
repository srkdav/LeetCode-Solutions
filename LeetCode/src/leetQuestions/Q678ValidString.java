package leetQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q678ValidString {
	public static boolean findValidity(char a[]) {
		Stack<Integer> st = new Stack<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		int i = 0;
		int count = 0;
		st.push(i);
		if (a[i] == '*') {
			count++;
			list.add(i);
		}
		i++;
		boolean flag = false;
		while (i < a.length) {
			if (a[i] == '*') {
				count++;
				list.add(i);
			} else if (a[i] == ')') {
				if (!st.empty() && a[st.peek()] == '(') {
					st.pop();
				} else {
					st.push(i);
				}
			} else {
				st.push(i);
			}
			i++;
		}
		if (count >= st.size()) {
			while (!st.isEmpty() && !list.isEmpty()) {
				char c = a[st.peek()];
				int y = st.pop();
				if (c == ')') {
					int x = list.get(list.size() - 1);
					list.remove(list.size() - 1);
					if (y < x) {
						return false;
					}
				} else {
					// c=(
					int x = list.get(list.size() - 1);
					list.remove(list.size() - 1);
					if (y > x) {
						return false;
					}
				}
				return true;
			}
		} else
			return false;
		return true;
	}

	public static boolean findValidity1(String s) {
		Stack<Integer> br = new Stack<Integer>();
		Stack<Integer> sr = new Stack<Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				br.push(i);
			} else if (s.charAt(i) == '*') {
				sr.push(i);
			} else {
				if(br.isEmpty() && sr.isEmpty()){
					return false;
				}
				if (!br.isEmpty()) {
					br.pop();
				} else {
					sr.pop();
				} 
			}
		}
		while(!br.isEmpty() && !sr.isEmpty()){
			if(br.pop()>sr.pop()){
				return false;
			}
		}
		return br.isEmpty();
	}

	public static void main(String[] args) {
		 String str= "(())((())()()(*)(*()(())())())()()((()())((()))(*";
//		String str = "(())((())()()(*)(*()(())())())()()((()())((()))(*";
//		boolean x = findValidity(str.toCharArray());
//		System.out.println(x);
//		String str = ")";
		System.out.println(findValidity1(str));
	}

}
