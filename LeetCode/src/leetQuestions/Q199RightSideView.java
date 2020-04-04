package leetQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q199RightSideView {
	Node root;

	Q199RightSideView() {
		root = null;
	}

	Q199RightSideView(int key) {
		root = new Node(key);
	}

	Queue<Node> q = new LinkedList<Node>();
//	List<List<Integer>> list = new ArrayList<List<Integer>>();

	public void levelOrderTraversal(Node temp) {
		List<Integer> list1 = new ArrayList<Integer>();
		q.add(temp);
		q.add(null);
		while (!q.isEmpty() || temp != null) {
			Node curr = q.peek();
			if (curr != null) {
				curr = q.peek();
				q.poll();
				if (q.peek() == null) {
					list1.add(curr.key);
				}
				if (curr.left != null) {
					q.add(curr.left);
				}
				if (curr.right != null) {
					q.add(curr.right);
				}
			} else {
//				list.add(list1);
				q.poll();
				q.add(null);
//				list1 = new ArrayList<Integer>();

			}
			if (q.size() == 1 && q.peek() == null) {
//				list.add(list1);
				break;
			}
		}
		for(Integer l:list1) {
			System.out.println(l);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q199RightSideView tree1 = new Q199RightSideView();
		tree1.root = new Node(1);
		tree1.root.left = new Node(2);
		tree1.root.left.left = new Node(4);
		tree1.root.left.right = new Node(5);
		tree1.root.left.right.left = new Node(15);
		tree1.root.left.right.right = new Node(25);
		tree1.root.right = new Node(3);
		tree1.levelOrderTraversal(tree1.root);

	}

}
