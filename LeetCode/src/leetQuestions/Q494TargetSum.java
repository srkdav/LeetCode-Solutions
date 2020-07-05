package leetQuestions;

import java.util.List;

public class Q494TargetSum {

	static int count = 0;

	static int dp[][] = new int[6][13];

	public static void setArray(int a[], int t) {
		for (int row = 0; row < dp.length; row++) {
			for (int col = 0; col < dp[row].length; col++) {
				dp[row][col] = Integer.MIN_VALUE;
			}
		}
	}

	public static int findTarget1(int a[], int t, int idx, int sum) {
		if (idx == a.length) {
			if (sum == t) {
				return 1;
			} else
				return 0;
		}
		if(dp[idx][sum]!=Integer.MIN_VALUE) {
			return dp[idx][sum];
		}
		int left = findTarget1(a, t, idx + 1, sum + a[idx]);
		int right = findTarget1(a, t, idx + 1, sum - a[idx]);
		dp[idx][sum] = left + right;
		return dp[idx][sum];

	}

	public static int findTarget(int a[], int t, int idx, int sum) {
		if (idx == a.length) {
			if (sum == t) {
				count++;
			}
			return 0;
		} else {
			int add = findTarget(a, t, idx + 1, sum + a[idx]);

			int sub = findTarget(a, t, idx + 1, sum - a[idx]);
			return add + sub;
		}
	}

	public static void main(String[] args) {

		int[] a = new int[] { 1, 1, 1, 1, 1, };
		setArray(a, 3);
		System.out.println(findTarget1(a, 8, 0, 5));
	}

}
