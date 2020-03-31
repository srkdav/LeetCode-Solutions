package leetQuestions;

import java.util.HashMap;

//import javax.swing.tree.Node;

public class Q437Path3tree {

	Node root;

	Q437Path3tree() {
		root = null;
	}

	Q437Path3tree(int key) {
		root = new Node(key);
	}

	public void pathSum(Node root, int sum) {
		HashMap<Integer, Integer> preSum = new HashMap();
		preSum.put(0, 1);
		helper(root, 0, sum, preSum);
		System.out.println(count);
	}

	int count = 0;

	public void helper(Node root, int currSum, int target, HashMap<Integer, Integer> preSum) {
		if (root == null) {
			return;
		}

		currSum += root.key;

		if (preSum.containsKey(currSum - target)) {
			count += preSum.get(currSum - target);
		}

		if (!preSum.containsKey(currSum)) {
			preSum.put(currSum, 1);
		} else {
			preSum.put(currSum, preSum.get(currSum) + 1);
		}

		helper(root.left, currSum, target, preSum);
		helper(root.right, currSum, target, preSum);
		preSum.put(currSum, preSum.get(currSum) - 1);
	}

	public static void main(String[] args) {
		Q437Path3tree tree1 = new Q437Path3tree();
		tree1.root = new Node(1);
		tree1.root.left = new Node(0);
		tree1.root.right = new Node(1);
		tree1.root.left.left = new Node(1);
		tree1.root.left.right = new Node(2);
		tree1.root.right.left = new Node(0);
		tree1.root.right.right = new Node(-1);
		tree1.root.left.left.left = new Node(0);
		tree1.root.left.left.right = new Node(1);
		tree1.root.left.right.left = new Node(-1);
		tree1.root.left.right.right = new Node(0);
		tree1.root.right.left.left = new Node(-1);
		tree1.root.right.left.right = new Node(0);
		tree1.root.right.right.left = new Node(1);
//		tree1.root.right.right.right = new Node(0);	
//	
//		tree1.root = new Node(1);
//		tree1.root.left = new Node(2);
//		tree1.root.right = new Node(3);
//		tree1.root.left.left = new Node(4);
//		tree1.root.left.right = new Node(5);
//		tree1.root.right.left = new Node(6);
//		tree1.root.right.right = new Node(7);
		tree1.pathSum(tree1.root, 2);
	}

}
