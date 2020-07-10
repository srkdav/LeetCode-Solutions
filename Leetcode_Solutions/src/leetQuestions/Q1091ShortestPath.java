package leetQuestions;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q1091ShortestPath {

	static Deque<Integer> rq;
	static Deque<Integer> cq;
	static boolean[][] visited;
	static int ans = 0;

	public static void explore(int r, int c, int a[][]) {
		int[] r1 = new int[] { -1, -1, -1, 0, 1, 1, 1, 0 };
		int[] c1 = new int[] { -1, 0, 1, 1, 1, 0, -1, -1 };
		for (int i = 0; i < 8; i++) {
			int row = r + r1[i];
			int col = c + c1[i];
			if (row >= 0 && col >= 0 && row < a.length && col < a[0].length) {
				if (visited[row][col] == false && a[row][col] == 0) {
					visited[row][col] = true;
					rq.add(row);
					cq.add(col);
				}
			}
		}

	}

	public static int findMinPath(int a[][]) {
		rq = new ArrayDeque<Integer>();
		cq = new ArrayDeque<Integer>();
		int row = 0, col = 0;
		rq.add(row);
		cq.add(col);
		visited = new boolean[a.length][a[0].length];
		while (!rq.isEmpty()) {
			int size = rq.size();
			for (int j = 0; j < size; j++) {
				int r = rq.poll();
				int c = cq.poll();
				if (r == a.length - 1 && c == a[0].length - 1) {
					return ans + 1;
				}
				visited[r][c] = true;
				explore(r, c, a);
			}
			ans++;
		}
		return -1;
	}

	public static void main(String[] args) {

		int[][] grid = new int[][] { { 0, 0, 0 }, { 1, 0, 0 }, { 1, 1, 0 } };
		System.out.println(findMinPath(grid));
	}

}
