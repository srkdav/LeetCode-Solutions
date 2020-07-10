package leetQuestions;

import java.util.Stack;

public class Q735asteroidCollision {

	public static void asteroidCollision(int[] a) {
		Stack<Integer> st = new Stack<>();
		st.push(a[0]);
		for (int i = 1; i < a.length; i++) {
			while(!st.isEmpty() && st.peek()>0) {
				if(a[i]<0 && Math.abs(a[i])>=st.peek()) {
					st.pop();
				}
				else if(a[i]>0) {
					st.push(a[i]);
					break;
				}
				else if(a[i]<0 && Math.abs(a[i])<st.peek()) {
					break;
				}
			}
			st.push(a[i]);
		}
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}

	}

	public static void main(String[] args) {

		int a[]=new int[] {-2, -1, 1, 2};
		asteroidCollision(a);
	}

}
