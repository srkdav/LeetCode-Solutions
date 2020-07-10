package leetQuestions;

public class Q124BTMaxSum {
	Node root;

	Q124BTMaxSum() {
		root = null;
	}

	Q124BTMaxSum(int key) {
		root = new Node(key);
	}

	int max = Integer.MIN_VALUE;
	public int maxSumAtNode(Node temp) {
		if (temp == null) {
			return 0;
		}
//		if (temp.left == null && temp.right == null) {
//			return temp.key;
//		}
		int l = Math.max(0,maxSumAtNode(temp.left));
		int r = Math.max(0,maxSumAtNode(temp.right));
		max = Math.max(max, l+r+temp.key);
		return Math.max(l, r)+temp.key;
	}
	public void traverseNodes(Node temp) {
		if (temp == null) {
			return;
		}
		traverseNodes(temp.left);
		traverseNodes(temp.right);
//		max=Math.max(max,maxSumAtNode(temp));
//		maxSumAtNode(temp);
	}

	public static void main(String[] args) {

		Q124BTMaxSum tree1 = new Q124BTMaxSum();
		tree1.root = new Node(1);
		tree1.root.left = new Node(2);
		tree1.root.right = new Node(3);
//		tree1.root.left.left = new Node(11);
//		tree1.root.left.left.left = new Node(7);
//		tree1.root.left.left.right = new Node(2);
//		tree1.root.right.left = new Node(13);
//		tree1.root.right.right = new Node(4);
//		tree1.root.right.right.right = new Node(1);
		tree1.maxSumAtNode(tree1.root);
		System.out.println(tree1.max);
	}

}
