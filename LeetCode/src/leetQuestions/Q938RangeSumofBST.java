package leetQuestions;

import java.util.Stack;

public class Q938RangeSumofBST {
	Node root;
	static int sum = 0;

	public Q938RangeSumofBST() {
		root = null;
	}

	public Q938RangeSumofBST(int key) {
		root = new Node(key);
	}

	void traverse() {
		if (root == null) {
			return;
		}
		Stack<Node> st = new Stack<Node>();
		Node temp = root;
		while (temp != null || st.size() > 0) {
			while (temp != null) {
				st.push(temp);
				if (temp.left == null) {
					break;
				} else
					temp = temp.left;
			}
		}
		temp = st.pop();
		System.out.println(temp.key);
		temp = temp.right;

	}

	public static void main(String[] args) {
		Q938RangeSumofBST tree = new Q938RangeSumofBST();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.left.right = new Node(10);
		tree.root.left.right = new Node(5);
		tree.traverse();
	}

}
