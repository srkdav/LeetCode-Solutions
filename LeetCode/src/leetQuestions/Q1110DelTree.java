package leetQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q1110DelTree {

	Node root;

	Q1110DelTree() {
		root = null;
	}

	Q1110DelTree(int key) {
		root = new Node(key);
	}

	List<Node> list = new ArrayList<Node>();

	void deleteNode(Node temp, int a[]) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);
		}
		deleteNodeUtil(temp, hs);
		if (temp == root) {
			list.add(temp);
		}
	}

	Node deleteNodeUtil(Node temp, Set<Integer> hs) {
		if (temp == null) {
			return null;
		}
		deleteNodeUtil(temp.left, hs);
		deleteNodeUtil(temp.right, hs);
		if (hs.contains(temp.key)) {
			if (temp.left != null) {
				Node l = temp.left;
				list.add(l);
			}
			if (temp.right != null) {
				Node r = temp.right;
				list.add(r);
			}
			return null;
		}
		return root;

	}

	static List<Integer> list1 = new ArrayList<Integer>();

	public void inOrder(Node temp, HashSet<Integer> a) {
		if (temp == null) {
			return;
		}
		if (temp.left != null && a.contains(temp.left.key)) {
			if (temp.left.left != null) {
				if (!a.contains(temp.left.left.key)) {
					list1.add(temp.left.left.key);
				}
			}
			if (temp.left.right != null) {
				if (!a.contains(temp.left.right.key)) {
					list1.add(temp.left.right.key);
				}
			}
			inOrder(temp.left, a);
			temp.left = null;
		}
		if (temp.right != null && a.contains(temp.right.key)) {
			if (temp.right.left != null) {
				if (!a.contains(temp.right.left.key))
					list1.add(temp.right.left.key);
			}
			if (temp.right.right != null) {
				if (!a.contains(temp.right.right.key))
					list1.add(temp.right.right.key);
			}
			inOrder(temp.right, a);
			temp.right = null;
		}
		inOrder(temp.left, a);
		inOrder(temp.right, a);
	}

	public Node inOrder2(Node temp, HashSet<Integer> hs) {
		if (temp == null) {
			return null;
		}
		temp.left=inOrder2(temp.left, hs);
		temp.right=inOrder2(temp.right, hs);
		if (hs.contains(temp.key)) {
			if (temp.left != null) {
				list1.add(temp.left.key);
			}
			if (temp.right != null) {
				list1.add(temp.right.key);
			}
			return null;
		}
		return temp;
	}

	public static void main(String[] args) {
		Q1110DelTree tree = new Q1110DelTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		// tree.root.right.right = new Node(4);
		tree.root.right.left = new Node(6);
		// tree.root.left.right.left = new Node(9);
		// tree.root.left.right.right = new Node(10);
		tree.root.right.right = new Node(7);
		int a[] = new int[] { 1, 2 };
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);
		}
		tree.inOrder2(tree.root, hs);
		if(hs.contains(tree.root.key)){
			tree.root=null;
		}
		for (Integer l : list1) {
			System.out.print(l + " ");
		}

	}

}
