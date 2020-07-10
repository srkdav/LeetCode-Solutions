package leetQuestions;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Q145PostOrderTree {

	Node root;

	Q145PostOrderTree() {
		root = null;
	}

	Q145PostOrderTree(int key) {
		root = new Node(key);
	}

	public static void printPostOrder(Node temp) {
		LinkedList<Integer> list = new LinkedList<>();
		Stack<Node> st = new Stack<>();
		st.push(temp);
		while(!st.isEmpty()) {
			temp=st.pop();
			list.addFirst(temp.key);
			System.out.print(temp.key+" ");
			if(temp.left!=null) {
				st.push(temp.left);
			}
			if(temp.right!=null) {
				st.push(temp.right);
			}
		}

	}

	public static void main(String[] args) {
		Q145PostOrderTree tree1 = new Q145PostOrderTree();
		tree1.root = new Node(1);
		tree1.root.left = new Node(2);
		tree1.root.right = new Node(3);
		tree1.root.left.left = new Node(4);
		tree1.root.left.right = new Node(5);
		tree1.root.left.right.left = new Node(6);
		tree1.root.left.right.right = new Node(7);
		printPostOrder(tree1.root);
		
	}

}
