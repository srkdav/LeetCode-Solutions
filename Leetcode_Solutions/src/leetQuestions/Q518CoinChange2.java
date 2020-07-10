package leetQuestions;

public class Q518CoinChange2 {

	static int dp[][]=new int[4][6];
	public static void findChange(int a[],int amount,int idx) {

		for(int row=1;row<dp.length;row++) {
			dp[row][0]=1;
		}
		for(int row=1;row<dp.length;row++) {
			for(int col=1;col<dp[row].length;col++) {
				if(a[row-1]<=col) {
					dp[row][col]=dp[row-1][col]+dp[row][col-a[row-1]];
				}else {
					dp[row][col]=dp[row-1][col];
				}
			}
		}
		System.out.println(dp[3][5]);
	}
	public static void main(String[] args) {
		int a[]=new int[] {1,2,5};
		findChange(a,5, 0);
		
	}

}
