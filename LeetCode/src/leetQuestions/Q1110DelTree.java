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
		deleteNodeUtil(temp,hs);
		if (temp == root) {
			list.add(temp);
		}
	}

	Node deleteNodeUtil(Node temp, Set<Integer> hs) {
		if (temp == null) {
			return null ;
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

	public static void main(String[] args) {
		Q1110DelTree tree = new Q1110DelTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);

		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		tree.root.right.left = new Node(6);
		tree.root.right.left.left = new Node(9);
		tree.root.right.left.right = new Node(10);
		tree.root.right.right = new Node(7);
		int a[] = new int[] {3,5,6 };
		tree.deleteNode(tree.root, a);
		System.out.println(tree.list);

	}

}
