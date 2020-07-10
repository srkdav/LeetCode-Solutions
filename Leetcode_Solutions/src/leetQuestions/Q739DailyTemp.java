package leetQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Q739DailyTemp {

	public static void findMaxTempGap(int[] a) {
		Stack<Integer> st = new Stack<Integer>();
		HashMap<Integer, ArrayList<Integer>> hm = new HashMap<Integer, ArrayList<Integer>>();
		for (int i = 0; i < a.length; i++) {
			if (!hm.containsKey(a[i])) {
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(i);
				hm.put(a[i], list);
			} else {
				ArrayList<Integer> list = hm.get(a[i]);
				list.add(i);
				hm.put(a[i], list);
			}
		}
		int[] ans = new int[a.length];
		for (int i = a.length - 1; i >= 0; i--) {
			if (st.isEmpty()) {
				ans[i] = 0;
				st.push(a[i]);
			} else {
				if (st.peek() > a[i]) {
					List<Integer> list = hm.get(st.peek());
					int min1 = Integer.MAX_VALUE;
					for (Integer l : list) {
						if (min1 > l - i) {
							min1 = l - i;
						}
					}
					ans[i] = min1;
					st.push(a[i]);
				} else {
					while (!st.isEmpty() && st.peek() <= a[i]) {
						st.pop();
					}
					if (!st.isEmpty()) {
						List<Integer> list = hm.get(st.peek());
						// int min = Integer.MAX_VALUE;
						// for (Integer l : list) {
						// if (min > l - i) {
						// min = l - i;
						// }
						// }
						// ans[i] = Math.abs(min);
						if (list.size() != 0) {
							ans[i] = Math.abs(list.get(list.size() - 1) - i);
						}else{
							ans[i]=0;
						}
					} else {
						ans[i] = 0;
					}
					st.push(a[i]);
				}
			}
			ArrayList<Integer> list1 = hm.get(a[i]);
			if (list1.size() != 0) {
				list1.remove(list1.size() - 1);
				hm.put(a[i], list1);
			}
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	public static void findMaxTempGap2(int a[]){
		int ans[] = new int[a.length];
		Stack<Integer> st = new Stack<Integer>();
		for(int i=a.length-1;i>=0;i--){
			ans[i]=0;
			if(st.isEmpty()){
				st.push(i);
			}else{
				while(!st.isEmpty() && a[st.peek()]<=a[i]){
					st.pop();
				}
				if(!st.isEmpty()){
					ans[i]=st.peek()-i;
				}
				st.push(i);
			}
		}
		for(int i=0;i<ans.length;i++){
			System.out.print(ans[i]+" ");
		}
	}
	public static void main(String[] args) {

		int[] a = new int[] { 89,62,70,58,47,47,46,76,100,70};
		findMaxTempGap2(a);
	}

}
