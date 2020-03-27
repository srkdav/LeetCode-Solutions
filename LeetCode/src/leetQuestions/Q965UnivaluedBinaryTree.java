package leetQuestions;

public class Q965UnivaluedBinaryTree {
	Node root;

	Q965UnivaluedBinaryTree() {
		root = null;
	}

	Q965UnivaluedBinaryTree(int key) {
		root = new Node(key);
	}

//	int val = root.key;
	
	public boolean isUnivalTree(Node temp) {
//		int val = root.key;
		if(temp==null) {
			return true;
		}
		if(temp.left!=null && temp.key!=temp.left.key) {
			return false;
		}
		if(temp.right!=null && temp.key!=temp.right.key) {
			return false;
		}

		boolean l=isUnivalTree(temp.left);
		boolean r=isUnivalTree(temp.right);
		return l&&r;
	}

	public static void main(String[] args) {
		Q965UnivaluedBinaryTree tree = new Q965UnivaluedBinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(1);
		tree.root.right = new Node(1);
		tree.root.right.left = new Node(1);
		tree.root.right.right = new Node(1);
		tree.root.right.right.left = new Node(1);
		tree.root.right.right.right = new Node(1);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(8);
//		tree.root.left.right.left = new Node(8);
		tree.root.left.right.right = new Node(9);
		boolean a=tree.isUnivalTree(tree.root);
		System.out.println(a);
	}

}
