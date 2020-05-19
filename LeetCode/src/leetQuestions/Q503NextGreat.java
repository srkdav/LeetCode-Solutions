package leetQuestions;

import java.util.Stack;

public class Q503NextGreat {

	public static void findGreaterElement(int a[]) {
		int ans[] = new int[a.length];
		Stack<Integer> st = new Stack<Integer>();
		for(int i=a.length-1;i>=0;i--){
			st.push(i);
		}
		for(int i = a.length-1;i>=0;i--){
			ans[i]=-1;
			while(!st.isEmpty() && a[st.peek()]<=a[i]){
				st.pop();
			}
			if(!st.isEmpty()){
				ans[i]=a[st.peek()];
			}
			st.add(i);
		}
	}

	public static void main(String[] args) {

		int a[] = new int[] { 1, 2, 5, 4, 9, 4, 3 };
		findGreaterElement(a);
	}

}
