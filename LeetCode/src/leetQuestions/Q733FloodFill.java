package leetQuestions;

public class Q733FloodFill {

	public static void colorFill(int a[][], int row, int col, int k, int nc) {
		if (row < 0 || row >= a.length || col < 0 || col >= a[row].length || a[row][col] != k) {
			return;
		} else {
			if (a[row][col] == k) {
				a[row][col] = nc;
			}
			colorFill(a, row + 1, col, k, nc);
			colorFill(a, row - 1, col, k, nc);
			colorFill(a, row, col + 1, k, nc);
			colorFill(a, row, col - 1, k, nc);
		}

	}

	public static void main(String[] args) {

		int[][] a = new int[][] { { 0, 0, 0 }, { 0, 1, 1 } };
		int sr = 1;
		int sc = 1;
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				if (row == sr && col == sc) {
					if(a[row][col]==1){
						
					}
					colorFill(a, row, col, 1, 1);
				}
			}
		}
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				System.out.print(a[row][col] + " ");
			}
			System.out.println();
		}
	}

}
