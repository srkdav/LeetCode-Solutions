package leetQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1200MinimumAbsoluteDifference {

	public static void main(String[] args) {
	
		int [] a = new int[] {1,3,6,10,15};
		Arrays.sort(a);
		int min= Integer.MAX_VALUE;
//		for(int i=0;i<a.length-1;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				int diff = a[j]-a[i];
//				if(diff<min) {
//					min=diff;
//				}
//			}
//		}
		for(int i=0;i<a.length-1;i++) {
			int diff= a[i+1]-a[i];
			if(diff<min) {
				min=diff;
			}
		}
		List<List<Integer>> list1 = new ArrayList<List<Integer>>();
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				int diff = a[j]-a[i];
				if(diff==min) {
					List<Integer> list2 = new ArrayList<Integer>();
						list2.add(a[i]);
						list2.add(a[j]);
						list1.add(list2);
						break;
				}
				if(diff>min) {
					break;
				}
			}
		}
		for(List<Integer> l : list1) {
			System.out.println(l);
		}
	}

}
