package leetQuestions;

public class Q59SpiralMat2 {

	public static int[][] generateMatrix(int n) {
		int a[][] = new int[n][n];
		boolean seen[][] = new boolean[n][n];
		int count = n * n;
		int row = 0, col = 0;
		int k = 1;
		while (count > 1) {
			while (col< a.length-1 && seen[row][col+1] == false) {
				a[row][col] = (k);
				seen[row][col] = true;
				k++;
				col++;
				count--;
			}
			while (row< a.length-1 && seen[row+1][col] == false) {
				a[row][col] = (k);
				seen[row][col] = true;
				k++;
				row++;
				count--;
			}
			while (col > 0 && seen[row][col-1] == false) {
				a[row][col] = (k);
				seen[row][col] = true;
				k++;
				col--;
				count--;
			}
			while (row > 0 && seen[row-1][col] == false) {
				a[row][col] = (k);
				seen[row][col] = true;
				k++;
				row--;
				count--;
			}
		}
		a[row][col]=k;
		return a;
	}

	public static void main(String[] args) {
		int[][] a=generateMatrix(4);
		System.out.println(a);
	}

}
