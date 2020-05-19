package leetQuestions;

public class Q1254ClosedIslands {

	static int count = 0;
	static boolean ans = false;
	static boolean dp[][] = new boolean[10][10];

	public static boolean countIslands(int a[][], int row, int col) {
		if (row < 0 || row >= a.length || col < 0 || col >= a[row].length || a[row][col] == 1 || dp[row][col] == true) {
			return true;
		} else if (row == a.length - 1 || col == a[row].length - 1 || col==0 || row==0) {
			if (a[row][col] == 0) {
				return false;
			}
		} else {
			dp[row][col] = true;
			boolean p = countIslands(a, row + 1, col);
			boolean r = countIslands(a, row, col + 1);
			boolean q = countIslands(a, row - 1, col);
			boolean s = countIslands(a, row, col - 1);
			if (p && q && r && s) {
				ans = true;
			} else {
				ans = false;
			}
		}
		return ans;
	}

	public static void main(String[] args) {

//		int a[][] = new int[][] { { 1, 1, 1, 1, 1, 1, 1, 0 }, { 1, 0, 0, 0, 0, 1, 1, 0 }, { 1, 0, 1, 0, 1, 1, 1, 0 },
//				{ 1, 0, 0, 0, 0, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1, 1, 0 } };
//		 int a[][] = new int[][]{{1,1,1,1,1,1,1},
//             {1,0,0,0,0,0,1},
//             {1,0,1,1,1,0,1},
//             {1,0,1,0,1,0,1},
//             {1,0,1,1,1,0,1},
//             {1,0,0,0,0,0,1},
//             {1,1,1,1,1,1,1}};
		int a[][] = new int[][]{{0,0,1,1,0,1,0,0,1,0},{1,1,0,1,1,0,1,1,1,0},{1,0,1,1,1,0,0,1,1,0},{0,1,1,0,0,0,0,1,0,1},{0,0,0,0,0,0,1,1,1,0},{0,1,0,1,0,1,0,1,1,1},{1,0,1,0,1,1,0,0,0,1},{1,1,1,1,1,1,0,0,0,0},{1,1,1,0,0,1,0,1,0,1},{1,1,1,0,1,1,0,1,1,0}};
		for (int row = 1; row < a.length - 1; row++) {
			for (int col = 1; col < a[row].length - 1; col++) {
				if (a[row][col] == 0 && dp[row][col] == false) {
					if (countIslands(a, row, col)) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
