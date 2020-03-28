package leetQuestions;

import java.util.Arrays;
import java.util.Stack;

public class Q1022Tree {

	Node root;

	Q1022Tree() {
		root = null;
	}

	Q1022Tree(int key) {
		root = new Node(key);
	}

	Stack<Node> st = new Stack<Node>();
	int sum = 0;
	public void sumroottoleafpath(Stack<Node> st) {
		Stack<Node> st1 = new Stack<Node>();
		int i=0;
		int y=0;
		while (!st.isEmpty()) {
			Node t = st.pop();
			int p = (int)(Math.pow(2, i));
			y=p*t.key+y;
			i++;
			st1.push(t);
		}
		sum=sum+y;
		y=0;
		while (!st1.isEmpty()) {
			Node t = st1.pop();
			st.push(t);
		}
	}

	public void roottoleafpath(Node temp) {
		if (temp == null) {
			return;
		}
		st.push(temp);
		if (temp.left == null && temp.right == null) {
			sumroottoleafpath(st);
			Node t = st.peek();
			while (t == temp && st.size() > 0) {
				t = st.pop();
				t = st.peek();
			}
		}
		roottoleafpath(temp.left);
		roottoleafpath(temp.right);
		if (!st.isEmpty()) {
			if (temp == st.peek()) {
				st.pop();
			}
		}
	}

	public void printFinalSum(Node temp) {
		roottoleafpath(temp);
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Q1022Tree tree = new Q1022Tree();
		tree.root = new Node(1);
		tree.root.left = new Node(0);
		tree.root.right = new Node(1);
		tree.root.left.left = new Node(0);
		tree.root.left.right = new Node(1);
		tree.root.right.left = new Node(0);
		tree.root.right.right = new Node(1);
		tree.printFinalSum(tree.root);
//		tree.roottoleafpath(tree.root);
//		System.out.println("fin is" + tree.sum);

	}
}
