package leetQuestions;

import java.util.Arrays;

public class Q300LIS {

	public static void findMaxCount(int a[]) {
		int maxCount = 1;
		int[] ans = new int[a.length];
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (a[j] < a[i]) {
					ans[i]++;
				}
			}
		}
		System.out.println(maxCount);
	}

	static int max = 0;
	static int[][] t;

	public static void setArray(int a[]) {
		t = new int[a.length][a.length];
//		for (int row = 0; row < t.length; row++) {
//			for (int col = 0; col < t[row].length; col++) {
//				t[row][col] = -1;
//			}
//		}
	}

	public static int lengthOfList1(int a[], int idx, int prev, int count) {
		max = Math.max(count, max);
		if (idx < 0) {
			return 0;
		}
		if (t[idx][idx] != 0) {
			return t[idx][idx];
		}
		int x = 0, y = 0;
		if (a[idx] < prev) {
			x = lengthOfList1(a, idx - 1, a[idx], count + 1);
		}
		y = lengthOfList1(a, idx - 1, prev, count);
		return t[idx][idx] = Math.max(x, y);
	}

	public static void findMaxCount1(int a[]) {
		int[] dp = new int[a.length];
		dp[0] = 1;
		int fMax = 0;
		for (int i = 1; i < a.length; i++) {
			int max = 1;
			for (int j = 0; j < i; j++) {
				if (a[j] < a[i]) {
					max = Math.max(max, dp[j] + 1);
				}
			}
			dp[i] = max;
			fMax = Math.max(fMax, max);
		}
		System.out.println(fMax);
	}

	public static int lengthOfLIS(int[] nums) {
		int[] dp = new int[nums.length];
		int len = 0;
		for (int num : nums) {
			int i = Arrays.binarySearch(dp, 0, len, num);
			if (i < 0) {
				i = -(i + 1);
			}
			dp[i] = num;
			if (i == len) {
				len++;
			}
		}
		return len;
	}

	public static void main(String[] args) {

		int a[] = new int[] { 10, 9, 2, 5, 3, 7, 101, 18 };
//		setArray(a);
//		lengthOfList1(a, a.length - 1, Integer.MAX_VALUE, 0);
//		System.out.println(max);
//		findMaxCount1(a);
		lengthOfLIS(a);
	}

}
