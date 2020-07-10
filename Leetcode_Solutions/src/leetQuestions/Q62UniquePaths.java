package leetQuestions;

public class Q62UniquePaths {

	public static void findPath(int a[][]) {
		int[][] dp = new int[a.length][a[0].length];
		for(int col=0;col<dp[0].length;col++){
			dp[0][col]=1;
		}
		for(int row=0;row<dp.length;row++){
			dp[row][0]=1;
		}
		for(int row=1;row<dp.length;row++){
			for(int col=1;col<dp[row].length;col++){
				dp[row][col]=dp[row-1][col]+dp[row][col-1];
			}
		}
		for(int row=0;row<dp.length;row++){
			for(int col=0;col<dp[row].length;col++){
				System.out.print(dp[row][col]+" ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {

		int a[][] = new int[3][2];
		findPath(a);
	}

}
