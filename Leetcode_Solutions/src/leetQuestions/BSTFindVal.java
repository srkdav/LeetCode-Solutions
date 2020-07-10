package leetQuestions;

public class BSTFindVal {

	Node root;

	BSTFindVal() {
		root = null;
	}

	BSTFindVal(int key) {
		root = new Node(key);
	}

	static Node ans = null;

	public static void traverse(Node root, int val) {
		if (root == null) {
			return;
		}
		if (root.key == val) {
			ans = root;
		}
		if (root.key > val)
			traverse(root.left, val);
		if (root.key < val)
			traverse(root.right, val);
	}

	public static void main(String[] args) {
		BSTFindVal tree2 = new BSTFindVal();
		tree2.root = new Node(4);
		tree2.root.left = new Node(2);
		tree2.root.right = new Node(7);
		tree2.root.left.left = new Node(1);
		tree2.root.left.right = new Node(3);
		traverse(tree2.root, 3);
		System.out.println(ans);
	}

}
