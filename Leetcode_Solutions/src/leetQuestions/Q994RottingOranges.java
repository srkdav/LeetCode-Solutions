package leetQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class Q994RottingOranges {

	static int count = 0;

	public static void orangeTime(int[][] a, int row, int col) {
		if (row < a.length - 1 && a[row + 1][col] == 1 || col < a[0].length - 1 && a[row][col + 1] == 1
				|| col > 0 && a[row][col - 1] == 1 || row > 0 && a[row - 1][col] == 1) {
			count++;

		}

		if (col < a[0].length - 1 && a[row][col + 1] == 1) {
			a[row][col + 1] = 2;
		}
		if (row < a.length - 1 && a[row + 1][col] == 1) {
			a[row + 1][col] = 2;
		}
		if (col > 0 && a[row][col - 1] == 1) {
			a[row][col - 1] = 2;
		}
		if (row > 0 && a[row - 1][col] == 1) {
			a[row - 1][col] = 2;
		}
		return;
	}

	public static int orangeTime2(int[][] a) {
		Queue<int[]> q = new LinkedList<int[]>();
		int fresh = 0;
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				if (a[row][col] == 2) {
					q.add(new int[] { row, col });
				}
				if (a[row][col] == 1) {
					fresh++;
				}
			}
		}
		int d = 0;
		while (!q.isEmpty()) {
			int size = q.size();
			d++;
			for (int i = 0; i < size; i++) {
				int c[] = new int[2];
				c=q.poll();
				if (c[1] < a[0].length - 1 && a[c[0]][c[1] + 1] == 1) {
					a[c[0]][c[1] + 1] = 2;
					fresh--;
					q.add(new int[] { c[0], c[1] + 1 });
				}
				if (c[0] < a.length - 1 && a[c[0] + 1][c[1]] == 1) {
					a[c[0] + 1][c[1]] = 2;
					fresh--;
					q.add(new int[] { c[0] + 1, c[1] });
				}
				if (c[1] > 0 && a[c[0]][c[1] - 1] == 1) {
					a[c[0]][c[1] - 1] = 2;
					fresh--;
					q.add(new int[] { c[0], c[1] - 1 });
				}
				if (c[0] > 0 && a[c[0] - 1][c[1]] == 1) {
					a[c[0] - 1][c[1]] = 2;
					fresh--;
					q.add(new int[] { c[0] - 1, c[1] });
				}
			}
		}
		if (fresh > 0) {
			return -1;
		} else {
			return d-1;
		}
	}

	public static void main(String[] args) {

		int[][] a = new int[][] { { 0,2 } };
		int c=orangeTime2(a);
		System.out.println(c);
	}

}
