package leetQuestions;

import java.util.HashMap;

public class Q525ContigArray {

	public static void main(String[] args) {
	
		int a [] = new int[] {0,0,0,1,1,1,0};
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		hm.put(0, -1);
		int zero=0;
		int one = 0;
		int len=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==1) {
				one++;
			}else {
				zero++;
			}
			if(hm.containsKey(zero-one)) {
				len = Math.max(len, i-hm.get(zero-one));
			}else {
				hm.put(zero-one, i);
			}
		}
		System.out.println(len);
		
		
	}

}
