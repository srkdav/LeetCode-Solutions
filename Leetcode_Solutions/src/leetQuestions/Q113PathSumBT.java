package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q113PathSumBT {

	Node root;

	Q113PathSumBT() {
		root = null;
	}

	Q113PathSumBT(int key) {
		root = new Node(key);
	}

	public void findPathSum(Node temp, int target, int sum, List<Integer> list, List<List<Integer>> ans) {
		if (temp == null) {
			return;
		}
		if (temp.left == null && temp.right == null) {
			if (target == sum + temp.key) {
				list.add(temp.key);
				ans.add(new ArrayList<>(list));
				list.remove(list.size()-1);
			}
		} else {
			list.add(temp.key);
			findPathSum(temp.left, target, sum + temp.key, list, ans);
			findPathSum(temp.right, target, sum + temp.key, list, ans);
			list.remove(list.size() - 1);
		}
	}

	public static void main(String[] args) {
		Q113PathSumBT tree1 = new Q113PathSumBT();
		tree1.root = new Node(5);

		tree1.root.left = new Node(4);
		tree1.root.left.left = new Node(11);
		tree1.root.left.left.left = new Node(7);
		tree1.root.left.left.right = new Node(2);

		tree1.root.right = new Node(8);
		tree1.root.right.left = new Node(13);
		tree1.root.right.right = new Node(4);
		tree1.root.right.right.left = new Node(5);
		tree1.root.right.right.right = new Node(1);
		List<Integer> list = new ArrayList<Integer>();
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		tree1.findPathSum(tree1.root, 22, 0, list, ans);
		System.out.println(ans);
	}

}
