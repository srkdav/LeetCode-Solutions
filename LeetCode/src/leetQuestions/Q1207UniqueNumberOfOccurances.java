package leetQuestions;

import java.util.HashMap;

public class Q1207UniqueNumberOfOccurances {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,2,2,3,3,3,3};
		HashMap<Integer,Integer>hm = new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(hm.containsKey(arr[i])) {
				int val=hm.get(arr[i]);
				val++;
				hm.put(arr[i], val);
			}else
				hm.put(arr[i], 1);
		}
		int[] a = new int[hm.size()];
		int j=0;
		for(Integer key:hm.keySet()) {
			a[j]=hm.get(key);
			j++;
		}
		for(int i=0;i<a.length;i++) {
			for(int k=i+1;k<a.length;k++) {
				if(a[i]==a[k]) {
					System.out.println("false");
					break;
				}
			}
		}
	}

}
