package leetQuestions;

import java.util.Stack;

public class Q173BST {

	Node root;

	Q173BST() {
		root = null;
	}

	Q173BST(int key) {
		root = new Node(key);
	}

	Stack<Integer> st = new Stack<>();

	void iterator(Node temp) {
		if (temp == null) {
			return;
		}
		iterator(temp.left);
		st.push(temp.key);
		iterator(temp.right);
	}

	public int next() {
		return st.pop();
	}

	public boolean hasNext() {
		return st.size() > 0 ? true : false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
