package leetQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q107BinaryTree2 {

	Node root;

	Q107BinaryTree2() {
		root = null;
	}

	Q107BinaryTree2(int key) {
		root = new Node(key);
	}

	public Deque<Node> traversalLevel(Node temp) {
		Queue<Node> q1 = new LinkedList<Node>();
		Deque<Node> q2 = new LinkedList<Node>();
		q1.add(temp);
		q1.add(null);
		q2.add(temp);
		q2.add(null);
		while (temp != null || !q1.isEmpty()) {
			Node curr = q1.poll();
			if (curr != null) {
				if (curr.left != null) {
					q1.add(curr.left);
					q2.add(curr.left);
				}
				if (curr.right != null) {
					q1.add(curr.right);
					q2.add(curr.right);
				}
			} else {
//				q1.poll();
				q1.add(null);
				q2.add(null);
			}
			if (q1.size() == 1 && q1.peek() == null) {
				break;
			}
		}
		return q2;
	}

	public void printLevelOrder(Node temp) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		
		Deque<Node> q2 = new LinkedList<Node>();
		q2 = traversalLevel(temp);
		List<Integer> list1 = new ArrayList<Integer>();
		while (!q2.isEmpty()) {
			if (q2.peekLast() == null) {
				if (list1.size() > 0) {
					Collections.reverse(list1);
					list.add(list1);
				}
				list1 = new ArrayList<Integer>();
				q2.removeLast();
			} else {
				Node curr = q2.pollLast();
				list1.add(curr.key);
			}
		}
		list.add(list1);
		for (List<Integer> l : list) {
			System.out.println(l);
		}
	}

	public static void main(String[] args) {
		Q107BinaryTree2 tree2 = new Q107BinaryTree2();
		tree2.root = new Node(3);
//		tree2.root.left = new Node(9);
//		tree2.root.right = new Node(20);
//		tree2.root.right.left = new Node(15);
//		tree2.root.right.right = new Node(7);
		tree2.printLevelOrder(tree2.root);

	}

}
