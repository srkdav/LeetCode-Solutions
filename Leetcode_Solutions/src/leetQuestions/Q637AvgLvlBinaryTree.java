package leetQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q637AvgLvlBinaryTree {
	Node root;

	Q637AvgLvlBinaryTree() {
		root = null;
	}

	Q637AvgLvlBinaryTree(int key) {
		root = new Node(key);
	}

//	Solution1 - Needs improvement. 
	Queue<Node> q = new LinkedList<Node>();
	List<Double> list = new ArrayList<Double>();
	double sum = 0;
	double n = 0;
	double avg = 0;
	public void getLevelOrderOfTree(Node temp) {
		q.add(temp);
		q.add(null);
		while (q.size() > 0 || temp != null) {
			Node curr = q.peek();
			if (curr != null) {
				sum = sum + curr.key;
				n++;
				System.out.print(curr.key + " ");
				curr = q.poll();
				if (curr.left != null) {
					q.add(curr.left);
				}
				if (curr.right != null) {
					q.add(curr.right);
				}
			} else {                      
				if (n != 0) {
					avg = sum / n;
					list.add(avg);
					System.out.println(avg);
				}
				if (curr == null && q.size() == 1) {
					break;
				} else {
					q.add(null);
				}
				avg = 0;
				sum = 0;
				n = 0;
				curr = q.poll();
				System.out.println();
			}
			if (q.size() == 0) {
				break;
			}
		}

	}

	public static void main(String[] args) {
		Q637AvgLvlBinaryTree tree5 = new Q637AvgLvlBinaryTree();
		tree5.root = new Node(3);
		tree5.root.left = new Node(1);
		tree5.root.right = new Node(5);
		tree5.root.left.left = new Node(0);
		tree5.root.left.right = new Node(2);
		tree5.root.right.left = new Node(4);
		tree5.root.right.right = new Node(6);

//		tree5.getLevelOrderOfTree(tree5.root);

	}

}
