package leetQuestions;

public class Q1219MaxGold {

	static int max = 0;
	static int drow = 0;
	static int dcol = 0;

	public void setRowCol(int row, int col) {
		drow = row;
		dcol = col;
	}

	public static int maxSumGold(int[][] a, boolean[][] dp, int row, int col, int sum) {

		if (row >= a.length || col >= a[row].length || col < 0 || row < 0 || dp[row][col] == true || a[row][col] == 0) {
			return 0;
		}
		dp[row][col] = true;
		int p = 0, q = 0, r = 0, s = 0;
		if (row <= a.length && col <= a[row].length) {
			p = maxSumGold(a, dp, row, col + 1, sum);
			q = maxSumGold(a, dp, row + 1, col, sum);
		}
		if (row > 0 && col > 0) {
			r = maxSumGold(a, dp, row - 1, col, sum);
			s = maxSumGold(a, dp, row, col - 1, sum);
		}
		sum = sum + a[row][col];
		if (sum > max) {
			max = sum;
		}
		return p + q + r + s;
	}

	public static void main(String[] args) {

		int a[][] = new int[][] { { 1, 0, 7, 0, 0, 0 }, { 2, 0, 6, 0, 1, 0 }, { 3, 5, 6, 7, 4, 2 },
				{ 4, 3, 1, 0, 2, 0 }, { 3, 0, 5, 0, 20, 0 } };
		// int a[][] = new int[][] { { 0,0,0,0,0,0 }, { 0,0,0,0,0,0 }, {
		// 3,5,6,7,4,0 },{4,3,1,0,2,0},{0,0,5,0,20,0} };

		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				boolean dp[][] = new boolean[a.length][a[0].length];
				maxSumGold(a, dp, row, col, 0);
			}
		}
		System.out.println(max);
	}

}
