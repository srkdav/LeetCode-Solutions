package leetQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q90SubSets2 {

	public static void subsetsHelper(List<List<Integer>> ans, List<Integer> list, int a[], int idx) {
		ans.add(new ArrayList<>(list));

		for (int i = idx; i < a.length; i++) {
			if (i > idx && a[i] == a[i - 1]) {
				continue;
			}
			list.add(a[i]);
			subsetsHelper(ans, new ArrayList<Integer>(list), a, i + 1);
			list.remove(list.size() - 1);

		}

	}

	public static void subsets(int[] a) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		Arrays.sort(a);
		subsetsHelper(ans, list, a, 0);
		System.out.println(ans);
	}

	public static void main(String[] args) {

		int a[] = new int[] { 1, 2, 2 };
		subsets(a);
	}

}
