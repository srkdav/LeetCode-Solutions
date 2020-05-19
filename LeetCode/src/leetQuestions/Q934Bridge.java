package leetQuestions;

public class Q934Bridge {

	public static void markIslands(int a[][], int row, int col) {
		if (row < 0 || col < 0 || row > a.length || col > a[row].length || a[row][col] == 0) {
			return;
		} else {
			if (a[row][col] == 1) {
				a[row][col] = 2;
			}
			markIslands(a, row + 1, col);
			markIslands(a, row, col + 1);
			markIslands(a, row - 1, col);
			markIslands(a, row, col - 1);
		}
	}

	public static void main(String[] args) {

		int a[][] = new int[][] { { 1, 1, 0 }, { 0, 0, 0 }, { 0, 1, 1 } };
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				if (a[row][col] == 1) {
					markIslands(a, row, col);
				}
				
			}
		}
	}

}
