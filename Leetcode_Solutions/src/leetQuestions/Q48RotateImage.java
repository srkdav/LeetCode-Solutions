package leetQuestions;

public class Q48RotateImage {

	public static void swap(int[][] a, int row1, int col1, int row2, int col2) {
		int x = a[row1][col1];
		a[row1][col1] = a[row2][col2];
		a[row2][col2] = x;
	}

	public static void main(String[] args) {
		 int[][] a = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10,
		 11, 12 }, { 13, 14, 15, 16 } };
		// int [][]a = new int[][]{{1,2},{3,4}};
//		 int[][]a =new int[][]{{1,2,3},{4,5,6},{7,8,9}};
//		int[][] a = new int[][] { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };
		// System.out.println(a.length);
		for (int row = 0; row < a.length-2; row++) {
			for (int col = 0; col < a[0].length-1-row; col++) {
				swap(a, row, col, col, a.length - 1-row);
				swap(a, row, col, a.length - 1, a.length - 1 - col-row);
				swap(a, row, col, a.length - 1 - col-row, 0);
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
