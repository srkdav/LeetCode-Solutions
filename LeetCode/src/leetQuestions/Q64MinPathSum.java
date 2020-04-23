package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q64MinPathSum {
	static List<Integer> list = new ArrayList<Integer>();
	public static void printMatrix(int[][] a, int i, int j, int m, int n) {
		if (i == m && j == n) {
			return;
		}
		if (i == m && j != n) {
			j++;
			if(j==n){
				return;
			}
		}
		if (j == n && i != m) {
			i++;
			if(i==m){
			return;
			}
		}
		// System.out.print(a[i][j]);
		if (i != m) {
			printMatrix(a, i + 1, j, m, n);
		}
		if (j != n) {
			printMatrix(a, i, j + 1, m, n);
		}
	}

	public static void main(String[] args) {
		int[][] a = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int m = 2;
		int n = 2;
		printMatrix(a, 0, 0, m, n);

	}

}
