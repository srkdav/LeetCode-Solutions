package leetQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Q1329SortMatrix {

	public static void main(String[] args) {
	
		int a[][] = new int[][] {{3,3,1,1},{2,2,1,2},{1,1,1,2}};
		HashMap<Integer,List<Integer>> hm = new HashMap<Integer,List<Integer>>();
			for(int row =0;row<a.length;row++) {
				for(int col=0;col<a[row].length;col++) {
					int i = row-col;
						if(hm.containsKey(i)) {
							List<Integer> list1 = hm.get(i);
							list1.add(a[row][col]);
							Collections.sort(list1);
						}else {
							List<Integer> list2 = new ArrayList<Integer>();
							list2.add(a[row][col]);
							Collections.sort(list2);
							hm.put(i, list2);
						}
				}
			}		
			for(int row =0;row<a.length;row++) {
				for(int col=0;col<a[row].length;col++) {
						int i = row-col;
						a[row][col] = hm.get(i).get(0);
						hm.get(i).remove(0);
				}
			}

		
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
				System.out.print(a[row][col]+" ");
			}
			System.out.println();
		}
	}

}
