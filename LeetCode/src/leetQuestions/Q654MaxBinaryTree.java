package leetQuestions;

import java.util.ArrayList;
import java.util.HashSet;
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
	HashSet<Integer> hs = new HashSet<Integer>();

	void maxTree() {
		int[] a = new int[] { 3, 2, 1, 6, 0, 5 };
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		Node root = new Node(max);
		hs.add(max);
		insertNodes(root, a);
	}

	void insertNodes(Node temp, int a[]) {
		if (temp != null && temp.left == null) {
			int val = findIndexVal(temp.key, a);
			int maxl = Integer.MIN_VALUE;
			for (int i = 0; i < val; i++) {
				if (a[i] > maxl) {
					maxl = a[i];
				}
			}
			if (maxl == Integer.MIN_VALUE) {
				return;
			}
			temp.left = new Node(maxl);
			hs.add(maxl);
		}

		if (temp != null && temp.right == null) {
			int maxr = Integer.MIN_VALUE;
			int val = findIndexVal(temp.key, a);
			int i = val + 1;
			if (a[i] < a.length) {
				for (; i < a.length; i++) {
					if (!hs.contains(a[i]) && a[i] > maxr) {
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

	public Node maxBT(int a[], int l, int r) {
		if (l == r) {
			return null;
		}
		int maxI = findmaxIndex(a, l, r);
		Node temp = new Node(a[maxI]);
		temp.left = maxBT(a, l, maxI);
		temp.right = maxBT(a, maxI + 1, r);
		return temp;
	}

	public int findmaxIndex(int a[], int l, int r) {
		int max = Integer.MIN_VALUE;
		int maxI = 0;
		for (int i = l; i < r; i++) {
			if (a[i] > max) {
				max = a[i];
				maxI = i;
			}
		}
		return maxI;
	}

	public static void main(String[] args) {
		Q654MaxBinaryTree tree = new Q654MaxBinaryTree();
		int a[] = new int[] { 3, 2, 1, 6, 0, 5 };
		Node temp=tree.maxBT(a, 0, a.length);
		
	}

}

// if (temp != null && temp.left == null) {
// int maxl = Integer.MIN_VALUE;
// int val = findIndexVal(temp.key, a);
// int i = 0;
// if(temp==root) {
// i=0;
// }else {
// i=3;
// }
// for (i = 0; i < val; i++) {
// if (!hs.contains(a[i])&&a[i] > maxl) {
// maxl = a[i];
// }
// }
// if (maxl == Integer.MIN_VALUE) {
// return;
// }
// temp.left = new Node(maxl);
// hs.add(maxl);
// }
//
// if (temp != null && temp.right == null) {
// int maxr = Integer.MIN_VALUE;
// int val = findIndexVal(temp.key, a);
// int i = val + 1;
// if (a[i] < a.length) {
// for (; i < a.length; i++) {
// if (!hs.contains(a[i])&&a[i] > maxr) {
// maxr = a[i];
// }
// }
// }
// if (maxr == Integer.MIN_VALUE) {
// return;
// }
// temp.right = new Node(maxr);
// }