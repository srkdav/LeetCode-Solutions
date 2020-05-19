package leetQuestions;

import java.util.Stack;

public class Q402RemoveKDigit {

	public static void removeKDigits(String a, int k) {
		if (k >= a.length()) {

		} else {
			Stack<Character> st = new Stack<>();
			for (int i = 0; i < a.length(); i++) {
				while (k > 0 && !st.isEmpty() && Integer.valueOf(st.peek()) > Integer.valueOf(a.charAt(i))) {
					st.pop();
					k--;
				}
				st.push(a.charAt(i));
			}
			while(k>0){
				st.pop();
				k--;
			}
			StringBuilder ans =new StringBuilder();
			while(!st.isEmpty()){
				ans=ans.append(st.pop());
			}
			ans=ans.reverse();
			while(ans.length()>1 && ans.charAt(0)=='0'){
				ans.deleteCharAt(0);
			}
			
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {

		String num = "1234567890";
		int k = 9;
		removeKDigits(num, k);

	}

}
