package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q1035Lines {

	static int count = 0;

	public static int maxUncrossedLines(int a[], int b[], int m, int n, int low, int high) {
		if (m < 0 || n < 0) {
			return 0;
		}
		if (a[m] == b[n]) {
			System.out.println(m + " " + n);
			return 1 + maxUncrossedLines(a, b, m - 1, n - 1, low, high);
		} else {
			return Math.max(maxUncrossedLines(a, b, m - 1, n, low, high), maxUncrossedLines(a, b, m, n - 1, low, high));
		}
	}

	static int t[][];

	public static void setarray(int a[], int b[]) {
		t = new int[a.length][b.length];
		for (int row = 0; row < t.length; row++) {
			for (int col = 0; col < t[row].length; col++) {
				t[row][col] = -1;
			}
		}
	}

	public static int maxUncrossedLines1(int a[], int b[], int m, int n, int low, int high) {
		if (m < 0 || n < 0) {
			return 0;
		}
		if (t[m][n] != -1) {
			return t[m][n];
		}else {
			if (a[m] == b[n]) {
				return t[m][n] = 1 + maxUncrossedLines1(a, b, m - 1, n - 1, low, high);
			} else {
				return t[m][n] = Math.max(maxUncrossedLines1(a, b, m, n - 1, low, high),
						maxUncrossedLines1(a, b, m - 1, n, low, high));
			}
		}
	}

	public static void main(String[] args) {

		int a[] = new int[] { 2, 5, 1, 2, 5 };
		int b[] = new int[] { 10, 5, 2, 1, 5, 2 };
		setarray(a,b);
		System.out.println(maxUncrossedLines1(a, b, a.length - 1, b.length - 1, 0, 0));
	}

}
