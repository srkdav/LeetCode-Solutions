package leetQuestions;

import java.util.Stack;

public class Q394DecodeString {
//23[abc]
	public static void decodeString(String str) {
		int idx = 0;
		Stack<Integer> num = new Stack<Integer>();
		Stack<String> ch = new Stack<>();
		String res="";
		while (idx < str.length()) {
			if (Character.isDigit(str.charAt(idx))) {
				int repeat = 0;
				while (Character.isDigit(str.charAt(idx))) {
					int c = Integer.parseInt(String.valueOf(str.charAt(idx)));
					repeat = repeat * 10 + c;
					idx++;
				}
				num.push(repeat);
			}
			else if(str.charAt(idx)=='[') {
				ch.push(res);
				res="";
				idx++;
			}else if(str.charAt(idx)==']') {
				int repeat= num.pop();
				StringBuilder ans = new StringBuilder(ch.pop());
				for(int i=0;i<repeat;i++) {
					ans=ans.append(res);
				}
				res=ans.toString();
				idx++;
			}else {
				res=res+str.charAt(idx);
				idx++;
			}

		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		decodeString("3[a2[c]]");

	}

}
