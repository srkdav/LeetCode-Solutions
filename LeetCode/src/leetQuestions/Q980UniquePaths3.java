package leetQuestions;

public class Q980UniquePaths3 {

	public static int findPath(int a[][], int zeroes, int row, int col, int final_zeroes) {
		if (row < 0 || row >= a.length || col < 0 || col >= a[row].length || a[row][col] == -1) {
			return 0;
		}
		if (a[row][col] == 2) {
			if (zeroes == final_zeroes) {
				return 1;
			} else {
				return 0;
			}
		}
		a[row][col] = -1;
		int d = findPath(a, zeroes + 1, row + 1, col, final_zeroes);
		int u= findPath(a, zeroes + 1, row - 1, col, final_zeroes);
		int r= findPath(a, zeroes + 1, row, col + 1, final_zeroes);
		int l = findPath(a, zeroes + 1, row, col - 1, final_zeroes);
		a[row][col] = 0;
		return d+u+r+l;
	}

	public static void main(String[] args) {

		int a[][] = new int[][] { { 1, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 2, -1 } };
		int zeroes = 0;
		int start[] = new int[2];
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				if (a[row][col] == 1) {
					start[0] = row;
					start[1] = col;
				} else if (a[row][col] == 0) {
					zeroes++;
				}
			}
		}
		System.out.println(findPath(a, -1, start[0], start[1], zeroes));

	}

}
