package leetQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q515MaxValRowTree {

	Node root;

	Q515MaxValRowTree() {
		root = null;
	}

	Q515MaxValRowTree(int key) {
		root = new Node(key);
	}

	Queue<Node> q = new LinkedList<Node>();
	Node leftNode = null;
	List<Integer> list = new ArrayList<Integer>();
	int max = Integer.MIN_VALUE;

	List<Integer> maxOfEachRow(Node temp) {
		if(temp==null) {
			return list;
		}
		  if(temp.left==null && temp.right==null){
			  list.add(root.key);
			  return list;
//	            return new ArrayList<Integer>(root.key);
	        }
		q.add(temp);
		q.add(null);
		while (!q.isEmpty() || temp != null) {
			Node curr = q.peek();
			if (curr != null) {
				curr = q.poll();
				if (curr.left != null) {
					q.add(curr.left);
				}
				if (curr.right != null) {
					q.add(curr.right);
				}
				if (curr.key > max) {
					max = curr.key;
				}
			} else {
				q.poll();
				list.add(max);
				max = Integer.MIN_VALUE;
				q.add(null);
			}
			if (q.size() == 1 && q.peek() == null) {
				list.add(max);
				break;
			}
		}
//		return new ArrayList<Integer>(1);
		return list;
	}

	public static void main(String[] args) {
		Q515MaxValRowTree tree = new Q515MaxValRowTree();
		tree.root = new Node(0);
		tree.root.left = new Node(-1);
//		tree.root.right = new Node(3);
//
//		tree.root.left.left = new Node(4);
//		tree.root.left.right = new Node(51);
//		tree.root.right.left = new Node(6);
//		tree.root.right.right = new Node(7);
		List<Integer> list1 = tree.maxOfEachRow(tree.root);
		for (Integer l : list1) {
			System.out.print(l+" ");
		}
	}

}
