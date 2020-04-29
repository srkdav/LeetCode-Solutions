package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q986ListIntersection {

	public static void main(String[] args) {
		int[][] a = new int[][] { { 0, 2 }, { 5, 10 }, { 13, 23 }, { 24, 25 } };
		int[][] b = new int[][] { { 1, 5 }, { 8, 12 }, { 15, 24 }, { 25, 26 } };
		List<Integer> list = new ArrayList<Integer>();
		List<List<Integer>> list1 = new ArrayList<List<Integer>>();
		for (int rowb = 0; rowb < b.length; rowb++) {
			int left = b[rowb][0];
			for (int rowa = 0; rowa < a.length; rowa++) {
				list = new ArrayList<Integer>();
				while (left < a[rowa][0]) {
					left++;
				}
				while (left >= a[rowa][0] && left <= a[rowa][1]) {
					if (left >= b[rowb][0] && left <= b[rowb][1]) {
						list.add(left);
						left++;
					}else{
						list1.add(list);
						break;
					}
				}
			}
		}
		for (List<Integer> l : list1) {
			System.out.print(l+" ");
		}
	}

}
