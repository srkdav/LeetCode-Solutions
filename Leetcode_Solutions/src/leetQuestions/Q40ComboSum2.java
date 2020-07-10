package leetQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q40ComboSum2 {

	static List<List<Integer>> ansList = new ArrayList<List<Integer>>();
	public static void findCombination(int a[], int t, int idx, List<Integer> list, int sum) {
		if (sum == t) {
			ansList.add(new ArrayList<>(list));
		}
		if (sum > t) {
			return;
		}
		for (int i = idx; i < a.length; i++) {
			if (i > idx && a[i - 1] == a[i]) {
				continue;
			}
			list.add(a[i]);
			findCombination(a, t, i + 1, list, sum + a[i]);
			list.remove(list.size() - 1);
		}
	}

	public static void main(String[] args) {

		int c[] = new int[] { 2, 5, 2, 1, 2 };
		int t = 5;// 1 2 2 2 5
		Arrays.sort(c);
		List<Integer> list = new ArrayList<Integer>();
		findCombination(c, t, 0, list, 0);
		System.out.println(ansList);
	}

}
