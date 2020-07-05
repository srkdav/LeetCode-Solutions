package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q986ListIntersection {

	public static void findIntersection(int[][] a, int[][] b) {
		List<int[]> list = new ArrayList<>();
		int i = 0;
		int j = 0;
		while (i < a.length && j < b.length) {
			int low = Math.max(a[i][0], b[j][0]);
			int high = Math.min(a[i][1], b[j][1]);
			if (a[i][1] < b[j][1]) {
				if (low <= high) {
					list.add(new int[] { low, high });
				}
				i++;
			} else {
				if (low <= high) {
					list.add(new int[] { low, high });
				}
				j++;
			}
		}
		int[][] list2 = new int[list.size()][2];
		list2 = list.toArray(list2);
		System.out.println(list2);
	}

	public static void main(String[] args) {
		int[][] a = new int[][] { { 0, 2 }, { 5, 10 }, { 13, 23 }, { 24, 25 } };
		int[][] b = new int[][] { { 1, 5 }, { 8, 12 }, { 15, 24 }, { 25, 26 } };
		findIntersection(a, b);
//		List<Integer> list = new ArrayList<Integer>();
//		List<List<Integer>> list1 = new ArrayList<List<Integer>>();
//		for (int rowb = 0; rowb < b.length; rowb++) {
//			int left = b[rowb][0];
//			for (int rowa = 0; rowa < a.length; rowa++) {
//				list = new ArrayList<Integer>();
//				while (left < a[rowa][0]) {
//					left++;
//				}
//				while (left >= a[rowa][0] && left <= a[rowa][1]) {
//					if (left >= b[rowb][0] && left <= b[rowb][1]) {
//						list.add(left);
//						left++;
//					} else {
//						list1.add(list);
//						break;
//					}
//				}
//			}
//		}
//		for (List<Integer> l : list1) {
//			System.out.print(l + " ");
//		}
	}

}
