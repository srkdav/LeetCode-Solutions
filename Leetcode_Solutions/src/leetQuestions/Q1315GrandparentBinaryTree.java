package leetQuestions;

public class Q1315GrandparentBinaryTree {

	Node root;

	Q1315GrandparentBinaryTree() {
		root = null;
	}

	Q1315GrandparentBinaryTree(int key) {
		root = new Node(key);
	}

	int sum = 0;

	void sumofgpNodes(Node temp) {
		if (temp == null) {
			return;
		}
		if (temp.key % 2 == 0) {
			if (temp.left != null) {
				if (temp.left.left != null) {
					sum = sum + temp.left.left.key;
				}
				if (temp.left.right != null) {
					sum = sum + temp.left.right.key;
				}
			}
			if (temp.right != null) {
				if (temp.right.left != null) {
					sum = sum + temp.right.left.key;
				}
				if (temp.right.right != null) {
					sum = sum + temp.right.right.key;
				}
			}
		}
		sumofgpNodes(temp.left);
		sumofgpNodes(temp.right);
	}

	public static void main(String[] args) {
		Q1315GrandparentBinaryTree tree = new Q1315GrandparentBinaryTree();
		tree.root = new Node(6);
		tree.root.left = new Node(7);
		tree.root.left.left = new Node(2);
		tree.root.left.left.left = new Node(9);
		tree.root.left.right = new Node(7);
		tree.root.left.right.left = new Node(1);
		tree.root.left.right.right = new Node(4);
		tree.root.right = new Node(8);
		tree.root.right.left = new Node(1);
		tree.root.right.right = new Node(3);
		tree.root.right.right.right = new Node(5);
		tree.sumofgpNodes(tree.root);
		System.out.println(tree.sum);
	}

}
