package leetQuestions;

public class Q404SumLeafTree {

	Node root;

	Q404SumLeafTree() {
		root = null;
	}

	Q404SumLeafTree(int key) {
		root = new Node(key);
	}

	int sum = 0;

	void sumofLeft(Node temp) {
		if (temp == null) {
			return;
		}
		if (temp.left != null) {
			if (temp.left.left == null & temp.left.right == null) {
				sum = sum + temp.left.key;
			}
		}
		sumofLeft(temp.left);
		sumofLeft(temp.right);

	}

	public static void main(String[] args) {
		Q404SumLeafTree tree1 = new Q404SumLeafTree();
		tree1.root = new Node(1);
		tree1.root.left = new Node(2);
		tree1.root.right = new Node(3);
//		tree1.root.left.left = new Node(4);
		tree1.root.left.right = new Node(5);
		tree1.root.right.left = new Node(6);
		tree1.root.right.right = new Node(7);
		tree1.sumofLeft(tree1.root);
		System.out.println(tree1.sum);
	}

}
