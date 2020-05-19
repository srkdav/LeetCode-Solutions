package leetQuestions;

import java.util.Stack;

public class Q94BinaryTree {

	Node root;

	Q94BinaryTree() {
		root = null;
	}

	Q94BinaryTree(int key) {
		root = new Node(key);
	}

	public void inOrder(Node root) {
		Stack<Node> st = new Stack<Node>();
		st.push(root);
		Node curr = st.peek();
		while (curr != null || !st.empty()) {
			while (curr != null) {
				st.push(curr);
				curr = curr.left;
			}
			curr = st.pop();
			curr = curr.right;

		}
	}

	public void inOrderTraverse(Node temp) {


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q94BinaryTree tree2 = new Q94BinaryTree();
		tree2.root = new Node(1);
		tree2.root.left = new Node(2);
		tree2.root.right = new Node(3);
		tree2.root.left.left = new Node(4);
		tree2.root.left.right = new Node(5);
		tree2.root.right.left = new Node(6);

		tree2.inOrderTraverse(tree2.root);
	}

}
