package leetQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q958CompleteTree {

	Node root;

	Q958CompleteTree() {
		root = null;
	}

	Q958CompleteTree(int key) {
		root = new Node(key);
	}

	boolean ans = false;
	Queue<Node> q = new LinkedList<Node>();
	boolean checkCBT(Node temp) {
		q.add(temp);
		while (!q.isEmpty()) {
			Node curr = q.poll();
			if(curr==null) {
				ans=true;
			}else {
				if(ans==true) {
					return false;
				}
				q.add(curr.left);
				q.add(curr.right);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q958CompleteTree tree1 = new Q958CompleteTree();
		tree1.root = new Node(1);
		tree1.root.left = new Node(2);
		tree1.root.left.left = new Node(5);
		tree1.root.left.right = new Node(6);
		tree1.root.right = new Node(3);
		tree1.root.right.left = new Node(7);
//		tree1.root.right.right = new Node(8);
		System.out.println(tree1.checkCBT(tree1.root));
	}

}





//if (curr.left != null || curr.right != null) {
//	if (q.size() > 0 && q.peek() == null) {
//		if (curr.left == null && curr.right != null) {
//			ans = false;
//		}
//	} else {
//		if (curr.left != null && curr.right == null) {
//			ans = false;
//		}
//		if (curr.left == null && curr.right == null) {
//			ans = false;
//		}
//	}
//}
