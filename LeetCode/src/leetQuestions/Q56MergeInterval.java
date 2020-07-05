package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q56MergeInterval {

	public static void mergeInterval(int a[][]) {
		List<int[]> ans = new ArrayList<>();
		boolean flag = false;
		for (int i = 0; i < a.length - 1; i++) {
			int j = i;
			while (j < a.length && a[i][1] > a[j + 1][1]) {
				j++;
			}
			if (a[i][1] < a[j + 1][0]) {
				if (j == a.length - 1) {
					flag = true;
				}
				ans.add(new int[] { a[i][0], a[i][1] });
				i = j;
			} else {
				ans.add(new int[] { a[i][0], a[j + 1][1] });
				i++;
				if (i == a.length - 1) {
					flag = true;
				}
			}
		}
		if (flag == false) {
			ans.add(new int[] { a[a.length - 1][0], a[a.length - 1][1] });
		}

		for (int[] l : ans) {
			System.out.println(l[0] + " " + l[1]);
		}
	}

	public static void mergeInterval1(int a[][]) {
		List<int[]> ans = new ArrayList<>();
		int i = 1;
		int low = a[0][0];
		int high = a[0][1];
		while (i < a.length) {
			if (high < a[i][0]) {
				ans.add(new int[] { low, high });
				low = a[i][0];
				high = a[i][1];
			} else {
				low = Math.min(low, a[i][0]);
				high = Math.max(high, a[i][1]);
			}
			i++;
		}
		ans.add(new int[] { low, high });
		int[][] ans1= new int[ans.size()][2];
		ans1=ans.toArray(ans1);
		for (int[] l : ans) {
			System.out.println(l[0] + " " + l[1]);
		}
	}

	public static void main(String[] args) {
		int a[][] = new int[][] { { 1, 8 }, { 3, 6 }, { 8, 9 }, { 10, 17}, { 18, 21 } };
		mergeInterval1(a);
	}

}
