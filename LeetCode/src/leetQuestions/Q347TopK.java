package leetQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q347TopK {

	public static void findKFreq(int[] a,int k) {
		Map<Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<a.length;i++) {
			hm.put(a[i], hm.getOrDefault(a[i],0)+1);
		}
		Queue<Integer> q = new PriorityQueue<>((x, y) -> Integer.compare(hm.get(y), hm.get(x)));
		for(int n:hm.keySet()) {
			q.add(n);
			
		}
		int ans[]=new int[k];
		for(int i=0;i<ans.length;i++) {
			ans[i]=q.poll();
		}
		
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		int a[]=new int[] {5,2,5,3,5,3,1,1,3};
		findKFreq(a, 2);
	}

}
