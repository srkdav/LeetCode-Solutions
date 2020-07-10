package leetQuestions;

import java.util.Stack;

public class Q456Pattern {

	public static boolean find132pattern(int[] a) {
//mistake : read question again
		boolean inc = false;
		boolean dec = false;
		for (int i = 0; i < a.length - 2; i++) {
			inc = false;
			dec = false;
			if (a[i] < a[i + 1]) {
				inc = true;
			}
			if (inc) {
				if (a[i + 1] > a[i + 2] && a[i + 2] > a[i]) {
					dec = true;
					return true;
				}
			}
		}
		return false;
	}

	public static boolean findPattern(int a[]) {
		int[] min = new int[a.length];
		int minVal = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < minVal) {
				minVal = a[i];
			}
			min[i] = minVal;
		}
		Stack<Integer> st = new Stack<>();
		st.push(a[a.length-1]);
		for (int i = a.length - 2; i >= 0; i--) {
			if(a[i]==min[i]) {
				continue;
			}
			if(a[i]>min[i]) {
				while(!st.isEmpty() && st.peek()<=min[i]) {
					st.pop();
				}
				if(!st.isEmpty() && st.peek()<a[i]) {
					return true;
				}
				st.push(a[i]);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int a[] = new int[] { 3, 5, 0, 3, 4 };
		System.out.println(findPattern(a));

	}

}
