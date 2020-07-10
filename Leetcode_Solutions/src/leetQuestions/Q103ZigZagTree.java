package leetQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q103ZigZagTree {

	Node root;

	Q103ZigZagTree() {
		root = null;
	}

	Q103ZigZagTree(int key) {
		root = new Node(key);
	}

	public static void bstTaversal(Node temp) {
		Queue<Node> q = new LinkedList<Node>();
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		q.add(temp);
		q.add(null);
		List<Integer> list1 = new ArrayList<Integer>();
		int count = 0;
		while (!q.isEmpty() || temp != null) {
			if (q.peek() != null) {
				Node curr = q.poll();
				list1.add(curr.key);
				if (curr.left != null) {
					q.add(curr.left);
				}
				if (curr.right != null) {
					q.add(curr.right);
				}
			} else {
				if (count % 2 == 1) {
					Collections.reverse(list1);
				}
				list.add(list1);
				count++;
				list1 = new ArrayList<Integer>();
				q.poll();
				q.add(null);
			}
			if (q.size() == 1 && q.peek() == null) {
				if (count % 2 == 1) {
					Collections.reverse(list1);
				}
				list.add(list1);
				break;
			}
		}
		System.out.println(list);
	}

	public static void main(String[] args) {

		Q103ZigZagTree tree1 = new Q103ZigZagTree();
		tree1.root = new Node(1);
		tree1.root.left = new Node(2);
		tree1.root.right = new Node(3);
//		tree1.root.left.left = new Node(4);
//		tree1.root.left.right = new Node(5);
//		tree1.root.right.left = new Node(6);
//		tree1.root.right.right = new Node(7);
		bstTaversal(tree1.root);
	}

}
