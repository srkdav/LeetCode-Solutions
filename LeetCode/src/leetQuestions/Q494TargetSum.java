package leetQuestions;

import java.util.List;

public class Q494TargetSum {

	static int s = 0, d = 0;

	public static int findTarget(int[] a, int idx) {
		if (idx > a.length) {
			return 0;
		}
		for (int i = idx; i < a.length; i++) {
			System.out.println(a[i]);
			s = a[i] + findTarget(a, i + 1);
			d = a[i] - findTarget(a, i + 1);
			System.out.println(a[i]);
		}
		return s + d;
	}

	public static void findSum(int a[], int i, int k, int sum) {
		if (i == a.length ) {
			if (sum == k) {
				s++;
			}
		} else {
			findSum(a, i + 1, k, sum + a[i]);
			findSum(a, i + 1, k, sum - a[i]);
		}

	}

	public static void main(String[] args) {

		int[] a = new int[] { 1,4,5 };
		findSum(a, 0, 8, 0);
		System.out.println(s);
	}

}
