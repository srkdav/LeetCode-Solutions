package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q46Permutations {

	public static void swap(int a[], int i, int j) {
		int x = a[i];
		a[i] = a[j];
		a[j] = x;
	}

	static List<List<Integer>> list = new ArrayList<List<Integer>>();

	public static void findPermutations(int a[], int left, int right) {
		if (left >= right) {
			List<Integer> list1 = new ArrayList<Integer>();
			for (int p = 0; p < a.length; p++) {
				list1.add(a[p]);
				System.out.print(a[p] + " ");
			}
			list.add(list1);
			System.out.println();
		} else {
			for (int i = left; i < a.length; i++) {
				swap(a, left, i);
				findPermutations(a, left + 1, right);
				swap(a, left, i);
			}
		}
	}

	private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums) {
		if (tempList.size() == nums.length) {
			System.out.println(tempList);
			list.add(new ArrayList<>(tempList));
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (tempList.contains(nums[i]))
					continue; // element already exists, skip
				tempList.add(nums[i]);
				backtrack(list, tempList, nums);
				tempList.remove(tempList.size() - 1);
			}
		}
	}

	public static void main(String[] args) {

		int[] a = new int[] { 1, 2, 3 };
		List<List<Integer>> list = new ArrayList<>();
		// Arrays.sort(nums); // not necessary
		backtrack(list, new ArrayList<>(), a);

	}

}
