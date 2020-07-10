package leetQuestions;

public class Q695MaxArea {

	static int area = 0;
	 static boolean[][] dp = new boolean[3][3];

	public static int findMaxArea(int[][] a, int row, int col, int sum) {
		if (row < 0 || row >= a.length || col < 0 || col >= a[row].length || a[row][col] == 0) {
			return 0;
		}
		if (dp[row][col] == true || a[row][col]==0) {
			return 0;
		} else {
			dp[row][col] = true;
			int p=findMaxArea(a, row + 1, col, sum);
			int q=findMaxArea(a, row - 1, col, sum);
			int l=findMaxArea(a, row, col + 1, sum);
			int r=findMaxArea(a, row, col - 1, sum);
			return p+q+l+r+1;
		}
	}

	public static void main(String[] args) {
		int[][] a = new int[][] { { 1, 0, 0 }, { 1, 1, 0}, { 1, 0, 0 } };
		int max=0;
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				if (a[row][col] == 1) {
					max=Math.max(max,findMaxArea(a, row, col, 0));
				}
			}
		}
		System.out.println(max);
	}

}


//if (col<a[0].length-1 && a[row][col + 1] == 1 && dp[row][col + 1] == true) {
//	return;
//}
//if (col>0 && a[row][col - 1] == 1 && dp[row][col - 1] == true) {
//	return;
//}
//if (row>0 && a[row - 1][col] == 1 && dp[row - 1][col] == true) {
//	return;
//}
//if (row<a.length && a[row + 1][col] == 1 && dp[row + 1][col] == true) {
//	return;
//}