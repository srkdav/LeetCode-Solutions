package leetQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class Q226InvertTree {
	Node root;

	Q226InvertTree() {
		root = null;
	}

	Q226InvertTree(int key) {
		root = new Node(key);
	}

	Queue<Node> q = new LinkedList<Node>();

	public Node invertTree(Node temp) {
		if(temp==null) {
			return null;
		}
		
		Node l = invertTree(temp.left);
		Node r = invertTree(temp.right);
		temp.left=r;
		temp.right=l;
		return temp;

	}

	public static void main(String[] args) {

		Q226InvertTree tree5 = new Q226InvertTree();
		tree5.root = new Node(1);
		tree5.root.left = new Node(2);
		tree5.root.right = new Node(3);
		tree5.root.left.left = new Node(4);
		tree5.root.left.right = new Node(5);
		tree5.invertTree(tree5.root);
	}

}
