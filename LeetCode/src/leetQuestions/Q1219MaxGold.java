package leetQuestions;

public class Q1219MaxGold {

	static int max = 0;

	public static void maxSumGold(int[][] a, boolean[][] dp, int row, int col, int sum) {
		if (col < 0 || row < 0 || row >=a.length || col >= a[row].length) {
			return;
		}
		else if (dp[row][col] == true || a[row][col] == 0) {
			return;
		} else {
			dp[row][col] = true;
			sum = sum + a[row][col];
			if (sum > max) {
				max = sum;
			}
			maxSumGold(a, dp, row + 1, col, sum);
			maxSumGold(a, dp, row, col + 1, sum);
			maxSumGold(a, dp, row - 1, col, sum);
			maxSumGold(a, dp, row, col - 1, sum);
			dp[row][col]=false;
		}
	}

	public static void main(String[] args) {

		 int a[][] = new int[][] { { 1, 0, 7, 0, 0, 0 }, { 2, 0, 6, 0, 1, 0 },
		 { 3, 5, 6, 7, 4, 2 },
		 { 4, 3, 1, 0, 2, 0 }, { 3, 0, 5, 0, 20, 0 } };
		// int a[][] = new int[][] { { 0,0,0,0,0,0 }, { 0,0,0,0,0,0 }, {
		// 3,5,6,7,4,0 },{4,3,1,0,2,0},{0,0,5,0,20,0} };
//		int a[][] = new int[][] { { 0, 6, 0 }, { 5, 8, 7 }, { 0, 9, 0 } };
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				boolean dp[][] = new boolean[a.length][a[0].length];
				maxSumGold(a, dp, row, col, 0);
				System.out.println(dp[0][0]);
			}
		}
		System.out.println(max);
	}

}
