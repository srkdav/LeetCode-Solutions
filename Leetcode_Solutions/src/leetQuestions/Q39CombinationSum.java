package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q39CombinationSum {


	public static void findComboSum(List<List<Integer>> list1,List<Integer> list, int a[], int t, int sum, int idx) {
		if (sum == t) {
			list1.add(new ArrayList<>(list));
			System.out.println(list);
			return;
		}
		else if (sum>t) {
			return;
		} else {
			for (int i = idx; i < a.length; i++) {
				list.add(a[i]);
				findComboSum(list1,list, a, t, sum+a[i], i);
				list.remove(list.size() - 1);
			}
		}
	}

	public static void main(String[] args) {

		int a[] = new int[] { 2, 3, 6, 7 };
		int t = 7;
		List<Integer> list = new ArrayList<Integer>();
		List<List<Integer>> list1 = new ArrayList<List<Integer>>();
		findComboSum(list1,list, a, t, 0, 0);
		System.out.println(list1);
	}

}
