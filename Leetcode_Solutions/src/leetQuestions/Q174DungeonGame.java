package leetQuestions;

public class Q174DungeonGame {

	public static void findMinimum(int[][] a) {
		int[][]dp = new int[a.length][a[0].length];
		int row=dp.length;
		int col=dp[0].length;
		if(a[row-1][col-1]<=0) {
			dp[row-1][col-1]=1-a[row-1][col-1];
		}else {
			dp[row-1][col-1]=1;
		}
		for(int r=row-2;r>=0;r--) {
			dp[r][col-1]=Math.max(dp[r+1][col-1]-a[r][col-1], 1);
		}
		for(int c=col-2;c>=0;c--) {
			dp[row-1][c]=Math.max(dp[row-1][c+1]-a[row-1][c], 1);
		}
		for(int r=row-2;r>=0;r--) {
			for(int c=col-2;c>=0;c--) {
				int right = Math.max(dp[r][c+1]-a[r][c], 1);
				int down = Math.max(dp[r+1][c]-a[r][c], 1);
				dp[r][c]=Math.min(right, down);
			}
		}
		System.out.println(dp[0][0]);
		
	}
	public static void main(String[] args) {

		int [][]a = new int[][] {{-2,-3,3},{-5,-10,1},{10,30,-5}};
		findMinimum(a);
	}

}
