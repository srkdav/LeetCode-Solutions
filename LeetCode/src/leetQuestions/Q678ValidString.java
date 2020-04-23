package leetQuestions;

import java.util.Stack;

public class Q678ValidString {

	public static void findValidity(char a[]){
		Stack<Character> st = new Stack<Character>();
		int i=0;
		st.push(a[i]);
		i++;
		int count=0;
		while(i<a.length){
			if(a[i]=='*'){
				count++;
			}
			else if(a[i]==')'){
				if(!st.empty() && st.peek()=='('){
					st.pop();
				}
				else
				{
					st.push(')');
				}
			}
			else{
				st.push('(');
			}
			i++;
		}
		
		System.out.println(count+" "+st.size());
	}
	public static void main(String[] args) {
		String str= "(())((())()()(*)(*()(())())())()()((()())((()))(*";
//		String str = "))";
		findValidity(str.toCharArray());
		

		
	}

}
