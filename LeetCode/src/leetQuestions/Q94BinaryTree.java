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
			while (curr!= null) {
				st.push(curr);
				curr = curr.left;
			}
			curr=st.pop();
			curr=curr.right;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q94BinaryTree tree2 = new Q94BinaryTree();
		tree2.root = new Node(1);
		tree2.root.right = new Node(3);
		tree2.root.right.right = new Node(0);
		tree2.inOrder(tree2.root);
	}

}
