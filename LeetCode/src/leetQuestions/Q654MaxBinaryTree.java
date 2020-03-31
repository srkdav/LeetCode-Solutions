package leetQuestions;

import java.util.ArrayList;
import java.util.List;

//to do. 
public class Q654MaxBinaryTree {

	Node root;

	Q654MaxBinaryTree() {
		root = null;
	}

	Q654MaxBinaryTree(int key) {
		root = new Node(key);
	}

	List<Integer> list = new ArrayList<Integer>();

	void maxTree() {
		int[] a = new int[] { 3, 2, 1, 6, 0, 5 };
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		Node root = new Node(max);
		list.add(max);
		insertNodes(root, a);
	}

	void insertNodes(Node temp, int a[]) {
		if (temp != null && temp.left == null) {
			int maxl = Integer.MIN_VALUE;
			int val = findIndexVal(temp.key, a);
			int i = 0;
			for (i = 0; i < val; i++) {
				if (!list.contains(a[i])&&a[i] > maxl) {
					maxl = a[i];
				}
			}
			if (maxl == Integer.MIN_VALUE) {
				return;
			}
			temp.left = new Node(maxl);
			list.add(maxl);
		}

		if (temp != null && temp.right == null) {
			int maxr = Integer.MIN_VALUE;
			int val = findIndexVal(temp.key, a);
			int i = val + 1;
			if (a[i] < a.length) {
				for (; i < a.length; i++) {
					if (!list.contains(a[i])&&a[i] > maxr) {
						maxr = a[i];
					}
				}
			}
			if (maxr == Integer.MIN_VALUE) {
				return;
			}
			temp.right = new Node(maxr);
		}
		insertNodes(temp.left, a);
		insertNodes(temp.right, a);
	}

	private int findIndexVal(int key, int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Q654MaxBinaryTree tree = new Q654MaxBinaryTree();
		tree.maxTree();

	}

}
