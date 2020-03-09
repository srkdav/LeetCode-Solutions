package leetQuestions;

import java.util.Stack;

public class Q122SBuySellStockII {

	public static void main(String[] args) {
		int a[] = new int[] { 7, 1, 5, 3, 6, 4 };
		Stack<Integer> st = new Stack<Integer>();
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			if (st.isEmpty()) {
				st.push(a[i]);
			} else {
				if (st.peek() > a[i]) {
					st.clear();
					st.push(a[i]);
				}else {
					sum=sum+Math.abs(st.peek()-a[i]);
					st.push(a[i]);
				}
			}
		}
	
	}
}

//Working Solution but needs massive improvement. 
//Stack<Integer> st = new Stack<Integer>();
//int sum=0;
//for (int i = 0; i < a.length; i++) {
//	if (st.isEmpty()) {
//		st.push(a[i]);
//	} else {
//		if (st.peek() > a[i]) {
//			st.clear();
//			st.push(a[i]);
//		}else {
//			sum=sum+Math.abs(st.peek()-a[i]);
//			st.push(a[i]);
//		}
//	}
//}