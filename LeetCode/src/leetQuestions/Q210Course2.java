package leetQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Q210Course2 {

	public static void findOurder(int num,int[][] pre) {
		ArrayList[] a =new ArrayList[num];
		List<Integer> ans = new ArrayList<>();
		int[] order = new int[num];
		for(int i=0;i<a.length;i++) {
			a[i]=new ArrayList();
		}
		for(int row=0;row<pre.length;row++) {
			a[pre[row][1]].add(pre[row][0]);
			order[pre[row][0]]++;
		}
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<order.length;i++) {
			if(order[i]==0) {
				st.add(i);
			}
		}
		int[] answer = new int[num];
		int j=0;
		while(!st.isEmpty()) {
			int val = st.pop();
			answer[j]=val;
			j++;
			List<Integer> list = a[val];
			for(Integer l:list) {
				order[l]--;
				if(order[l]==0) {
					st.add(l);
				}
			}
		}
		
		
		
	}
	public static void main(String[] args) {
		int num=4;
		int[][] pre=new int[][] {{1,0},{2,0},{3,1},{3,2}};
		findOurder(num, pre);
	}

}
