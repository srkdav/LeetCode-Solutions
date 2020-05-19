package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q64MinPathSum {
	static List<Integer> list = new ArrayList<Integer>();

	public static void printMatrix(int[][] a, int i, int j, int m, int n) {
		if (i == m && j == n) {
			return;
		}
		if (i == m && j != n) {
			j++;
			if (j == n) {
				return;
			}
		}
		if (j == n && i != m) {
			i++;
			if (i == m) {
				return;
			}
		}
		// System.out.print(a[i][j]);
		if (i != m) {
			printMatrix(a, i + 1, j, m, n);
		}
		if (j != n) {
			printMatrix(a, i, j + 1, m, n);
		}
	}

	static int min = Integer.MAX_VALUE;

	public static void findPath(int[][] a, int row, int col, int sum) {
		if (row < 0 || row >= a.length || col < 0 || col >= a[row].length) {
			return;
		}
		if (row == a.length - 1 && col == a[0].length - 1) {
			if (sum + a[row][col] < min) {
				min = sum + a[row][col];
			}
			return;
		} else {
			sum = sum + a[row][col];

			findPath(a, row + 1, col, sum);
			findPath(a, row, col + 1, sum);
			sum = sum - a[row][col];

		}
	}


	public static void findPath2(int[][] a,int [][]dp) {
		int sum = 0;
		for (int col = 1; col < dp[0].length; col++) {
			sum = sum + a[0][col - 1];
			dp[1][col] = sum + dp[1][col];
		}

		sum = 0;
		for (int row = 1; row < dp.length; row++) {
			sum = sum + a[row - 1][0];
			dp[row][1] = sum + dp[row][1];
		}

		for (int row = 2; row < dp.length; row++) {
			for (int col = 2; col < dp[row].length; col++) {
				dp[row][col]=Math.min(dp[row-1][col], dp[row][col-1])+a[row-1][col-1];
			}
		}
		for (int row = 0; row < dp.length; row++) {
			for (int col = 0; col < dp[row].length; col++) {
				System.out.print(dp[row][col]+" ");
			}
			System.out.println();
		}
		System.out.println(dp[dp.length-1][dp[0].length-1]);
		
	}

	public static void main(String[] args) {
//		int[][] a = new int[][] { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		int[][]a = new int[][]{{1,2},{5,6},{1,1}};
		int m = 2;
		int n = 2;
		int[][] dp = new int[a.length+1][a[0].length+1];
		findPath2(a,dp);
	}

}
