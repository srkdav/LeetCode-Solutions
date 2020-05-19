package leetQuestions;

public class Q79WordSearch {

	// static boolean dp[][] = new boolean[3][5];
	static boolean ans = false;
	static int row1 = 0, col1 = 0;

	public static boolean findWord(char a[][], int row, int col, String s, int i, boolean[][] dp) {
		if (i == s.length()) {
			return true;
		}
		if (row < 0 || row >= a.length || col < 0 || col >= a[row].length || dp[row][col] == true) {
			return false;
		}
		if (a[row][col] != s.charAt(i)) {
			return false;
		}

		dp[row][col] = true;
		boolean p = findWord(a, row + 1, col, s, i+1, dp);
		boolean q = findWord(a, row, col + 1, s, i+1, dp);
		boolean m = findWord(a, row - 1, col, s, i+1, dp);
		boolean n = findWord(a, row, col - 1, s, i+1, dp);
		if (p || q || m || n) {
			ans = true;
			row = row1;
			col = col1;
		} else {
			dp[row][col] = false;
			ans = false;
		}

		return ans;
	}

	public static void main(String[] args) {
		char a[][] = new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'E', 'S' }, { 'A', 'D', 'E', 'E' } };
		String s = "ABCESEEEFS";
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				boolean dp[][] = new boolean[a.length][a[0].length];
				if (s.charAt(0) == a[row][col]) {
					System.out.println(findWord(a, row, col, s, 0, dp));
					// break;
				}
			}
		}
	}

}
