package leetQuestions;

public class Q1277CountSubMatrix {

	static void findCountOfSubMatrix(int a[][], int row, int col, int row1, int col1) {

	}

	public static void findSquareCount(int a[][]) {
		int[][] dp = new int[a.length][a[0].length];
		int fsum = 0;
		int sum = 0;
		for (int col = 0; col < a[0].length; col++) {
			if (a[0][col] == 1) {
				sum++;
			}
			dp[0][col] = a[0][col];
		}
		for (int row = 1; row < a.length; row++) {
			if (a[row][0] == 1) {
				sum++;
			}
			dp[row][0] = a[row][0];
		}
		fsum = sum;
		for (int row = 1; row < a.length; row++) {
			sum = 0;
			for (int col = 1; col < a[row].length; col++) {
				if (a[row][col] == 1) {
					int x = Math.min(dp[row - 1][col - 1], Math.min(dp[row][col - 1], dp[row - 1][col]));
					dp[row][col] = x + 1;
					sum = sum + dp[row][col];
				}
			}
			fsum = fsum + sum;
		}
		System.out.println(fsum);
	}

	public static void main(String[] args) {

		int[][] a = new int[][] { { 0, 1, 1, 1 }, { 1, 1, 1, 1 }, { 0, 1, 1, 1 } };
		findSquareCount(a);

	}

}
