package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q662MaxWidthBT {

	Node root;

	Q662MaxWidthBT() {
		root = null;
	}

	Q662MaxWidthBT(int key) {
		root = new Node(key);
	}

	public int dfs(Node root, int level, int idx, List<Integer> start, List<Integer> end) {
		if (root == null) {
			return 0;
		}
		if (start.size() == level) {
			start.add(idx);
			end.add(idx);
		} else {
			end.set(level, idx);
		}
		int current = end.get(level)-start.get(level)+ 1;
		int left = dfs(root.left, level + 1, 2 * idx, start, end);
		int right = dfs(root.right, level + 1, 2 * idx + 1, start, end);
		return Math.max(current, Math.max(left, right));
	}

	public static void main(String[] args) {
		Q662MaxWidthBT tree2 = new Q662MaxWidthBT();
		tree2.root = new Node(1);
		tree2.root.left = new Node(3);
		tree2.root.right = new Node(2);
		tree2.root.left.left = new Node(5);
		tree2.root.left.right = new Node(3);
		tree2.root.right.right = new Node(9);
		List<Integer> start = new ArrayList<>();
		List<Integer> end = new ArrayList<>();
		
		System.out.println(tree2.dfs(tree2.root, 0, 1, start, end));
	}

}
