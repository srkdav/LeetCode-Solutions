package leetQuestions;

public class Q221MaximalSquare {

	public static int findMaxArea(int r, int c, char[][] m) {
		if (r < m.length && c < m[r].length && m[r][c] == 0) {
			return 0;
		}
		if (r >= m.length || c >= m[0].length) {
			return 0;
		}
		int a = findMaxArea(r, c + 1, m);
		int b = findMaxArea(r + 1, c + 1, m);
		int d = findMaxArea(r + 1, c, m);
		int min = Math.min(d, b);
		return 1 + Math.min(a, min);

	}

	static int dp[][];

	public static void maxAreaDP(char a[][]) {
		int max = 0;
		dp = new int[a.length + 1][a[0].length + 1];
		for (int row = 1; row <dp.length; row++) {
			for (int col = 1; col <dp[0].length; col++) {
				if(a[row-1][col-1]==1){
					int l = dp[row-1][col-1];
					int r = dp[row][col-1];
					int c = dp[row-1][col];
					int min= Math.min(l, r);
					dp[row][col]=Math.min(min, c)+1;
					if(dp[row][col]>max){
						max=dp[row][col];
					}
				}
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		char[][] a = new char[][] { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		maxAreaDP(a);
		System.out.println("ab");
		// int max = 0;
		// for (int row = 0; row < a.length; row++) {
		// for (int col = 0; col < a[row].length; col++) {
		// if (a[row][col] == 1) {
		// int v = findMaxArea(row, col, a);
		// if (v > max) {
		// max = v;
		// }
		// }
		// }
		// }
		// System.out.println(max);
	}

}


//if (row <= 2 && col <= 2) {
//	if (a[row - 1][col - 1] == 1) {
//		int r = a[row - 1][col];
//		int d = a[row][col];
//		int b = a[row][col - 1];
//		int min = Math.min(r, d);
//		dp[row][col] = 1 + Math.min(min, b);
//		if (dp[row][col] > max) {
//			max = dp[row][col];
//		}
//	}
//}else{
//	if(a[row-1][col-1]==1){
//		dp[row][col]=1;
//	}
