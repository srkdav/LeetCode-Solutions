package leetQuestions;

import java.util.ArrayList;

public class Q207Course {

//	public static boolean canFinish(int num, int[][] pre) {
//		ArrayList[] a = new ArrayList[num];
//		for (int i = 0; i < a.length; i++) {
//			a[i] = new ArrayList<Integer>();
//		}
//		for (int row = 0; row < pre.length; row++) {
//			a[pre[row][1]].add(pre[row][0]);
//		}
//		boolean[] visited = new boolean[num];
//		for (int i = 0; i < a.length; i++) {
//			if (!dfs(a, visited, i)) {
//				return false;
//			}
//		}
//		return true;
//	}
//
//	public static boolean dfs(ArrayList[] a, boolean[] visited, int course) {
//		if (visited[course]) {
//			return false;
//		} else {
//			visited[course] = true;
//		}
//		for (int i = 0; i < a[course].size(); i++) {
//			if (!dfs(a, visited, (int) a[course].get(i))) {
//				return false;
//			}
//		}
//		visited[course] = false;
//		return true;
//	}

	public static void canFinish(int num, int[][] pre) {
		ArrayList[] a = new ArrayList[num];
		for (int i = 0; i < a.length; i++) {
			a[i] = new ArrayList<>();
		}
		for (int i = 0; i < pre.length; i++) {
			a[pre[i][1]].add(pre[i][0]);
		}
		boolean[] visited = new boolean[num];
		for(int i=0;i<a.length;i++) {
			if(!dfs(a, visited, i)) {
				return;
			}
		}
		return;
	}

	public static boolean dfs(ArrayList[] a, boolean[] visited, int course) {
		if (visited[course]) {
			return false;
		} else {
			visited[course] = true;
		}
		for (int i = 0; i < a[course].size(); i++) {
			if (!dfs(a, visited,(int) a[course].get(i))) {
				return false;
			}
		}
		visited[course]=false;
		return true;
	}

	public static void main(String[] args) {

		int[][] pre = new int[][] { { 0, 1 }, { 1, 2 }, { 2, 0 } };
//		System.out.println(canFinish(3, pre));
	}

}
