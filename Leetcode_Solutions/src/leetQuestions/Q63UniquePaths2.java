package leetQuestions;

public class Q63UniquePaths2 {

	public static void uniqPath(int a[][]) {
		int[][] dp = new int[a.length][a[0].length];
		for (int row = 0; row < a.length; row++) {
			if(a[row][0]==0) {
				dp[row][0]=1;
			}
			else if(a[row][0]==1) {
				while(row<a.length) {
					dp[row][0]=-1;
					row++;
				}
			}
		}
		for (int col = 0; col < a[0].length; col++) {
			if(a[0][col]==0) {
				dp[0][col]=1;
			}
			else if(a[0][col]==1) {
				while(col<a[0].length) {
					dp[0][col]=-1;
					col++;
				}
			}
		}
		for (int row = 1; row < a.length; row++) {
			for (int col = 1; col < a[0].length; col++) {
				if (a[row][col] == 1) {
					dp[row][col]=-1;
				} else {
					if (dp[row - 1][col] != -1 && dp[row][col - 1] != -1) {
						dp[row][col] = dp[row - 1][col] + dp[row][col - 1];
					} else {
						if (dp[row - 1][col] == -1) {
							dp[row][col] = dp[row][col - 1];
						} else if (dp[row][col - 1] == -1) {
							dp[row][col] = dp[row - 1][col];
						}
					}
				}
			}
		}
		System.out.println(dp[a.length - 1][a[0].length - 1]);

	}

	public static void main(String[] args) {

		int a[][] = new int[][] { { 0,0},{1,1},{0,0}};
		uniqPath(a);
	}

}
