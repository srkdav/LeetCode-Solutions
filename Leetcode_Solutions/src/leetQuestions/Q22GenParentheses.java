package leetQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class Q22GenParentheses {

	public static void swap(char a[], int i, int j) {
		char x = a[i];
		a[i] = a[j];
		a[j] = x;
	}

	public static void permutation(char a[], int left, int right) {
		if (left >= right) {
			for (int p = 0; p < a.length; p++) {
				System.out.print(a[p]);
			}
			System.out.println();
		} else {
			for (int i = left; i <= right; i++) {
				swap(a, left, i);
				permutation(a, left + 1, right);
				swap(a, left, i);
			}
		}
	}

	public static void permutation2(char a[], List<List<Character>> list, List<Integer> temp) {
		if (temp.size() == a.length) {
			for (Integer l : temp) {
				System.out.print(a[l]);
			}
			System.out.println();
		} else {
			for (int i = 0; i < a.length; i++) {
				if (temp.contains(i)) {
					continue;
				}
				temp.add(i);
				permutation2(a, list, temp);
				temp.remove(temp.size() - 1);
			}
		}
	}

	public static int checkValidParantheses(List<Integer> list, char a[]) {
		Stack<Character> st = new Stack<Character>();
		st.push(a[list.get(0)]);
		for (int i = 1; i < list.size(); i++) {
			if(st.isEmpty()){
				st.push(a[list.get(i)]);
			}
			if (st.peek() == '(') {
				if (a[list.get(i)] == ')') {
					st.pop();
				} else {
					st.push(a[list.get(i)]);
				}
			} else {
				if (st.peek() == ')') {
					st.push(a[list.get(i)]);
				}
			}
		}
		return st.size();
	}

	static HashSet<String> ans = new HashSet<String>();

	private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, char[] a) {
		if (tempList.size() == nums.length) {
			if (checkValidParantheses(tempList, a) == 0) {
				String fans = tempList.toString();
				ans.add(fans);
			}
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (tempList.contains(nums[i]))
					continue; // element already exists, skip
				tempList.add(nums[i]);
				backtrack(list, tempList, nums, a);
				tempList.remove(tempList.size() - 1);
			}
		}
	}

	public static void main(String[] args) {

		char a[] = new char[] { '(', '(', ')', ')', ')', '(' };
		int[] nums = new int[] { 0, 1, 2, 3, 4, 5 };
		List<List<Integer>> list = new ArrayList<>();
		backtrack(list, new ArrayList<>(), nums, a);
		// System.out.println(ans);
		System.out.println(ans.size());
	}

}
