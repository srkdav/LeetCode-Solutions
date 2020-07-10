package leetQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q129SumRootLeaf {

	Node root;

	Q129SumRootLeaf() {
		root = null;
	}

	Q129SumRootLeaf(int key) {
		root = new Node(key);
	}


	static StringBuilder sb = new StringBuilder();
	static int ans=0;
	public static void findSumLeaf(Node root) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			sb.append(root.key);
			ans = ans+Integer.parseInt(sb.toString());
			sb.deleteCharAt(sb.length()-1);
		}
		sb.append(root.key);
		findSumLeaf(root.left);
		findSumLeaf(root.right);
		sb.deleteCharAt(sb.length()-1);
	}

	public static void main(String[] args) {

		Q129SumRootLeaf tree1 = new Q129SumRootLeaf();
		tree1.root = new Node(4);
		tree1.root.left = new Node(9);
		tree1.root.right = new Node(0);
		tree1.root.left.left = new Node(5);
		tree1.root.left.right = new Node(1);
//		tree1.root.right.left = new Node(6);
		findSumLeaf(tree1.root);
		System.out.println(ans);
	}

}
