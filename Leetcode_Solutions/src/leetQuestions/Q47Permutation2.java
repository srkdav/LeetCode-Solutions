package leetQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q47Permutation2 {

	public static void helper(int a[], List<List<Integer>> ans, List<Integer> list, boolean[] used) {
		if (list.size() == a.length) {
			System.out.println(list);
			ans.add(new ArrayList<>(list));
			return;
		} else {
			for (int i = 0; i < a.length; i++) {
				if (used[i])
					continue;
				if (i > 0 && a[i - 1] == a[i] && !used[i - 1])
					continue;
				used[i] = true;
				list.add(a[i]);
				helper(a, ans, list, used);
				used[i] = false;
				list.remove(list.size() - 1);
			}
		}
	}

	public static void permutation(int a[]) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<>();
		boolean[] used = new boolean[a.length];
		Arrays.sort(a);
		helper(a, ans, list, used);
		System.out.println(ans);
	}

	public static void main(String[] args) {

		int a[] = new int[] { 1, 1, 2 };
		permutation(a);

	}

}
