package leetQuestions;

public class Q110BalancedTree {

	Node root;

	Q110BalancedTree() {
		root = null;
	}

	Q110BalancedTree(int key) {
		root = new Node(key);
	}

	public int getHeight(Node temp) {
		if (temp == null) {
			return 0;
		}
		int l = getHeight(temp.left) + 1;
		int r = getHeight(temp.right) + 1;
		return Math.max(l, r);
	}

	boolean fFinal=true;
	public boolean getHeightUtil(Node temp) {
		int x = 0;
		int y = 0;
		if (temp.left != null) {
			x = getHeight(temp.left);
		} else {
			x = 0;
		}
		if (temp.right != null) {
			y = getHeight(temp.right);
		} else {
			y = 0;
		}
		if (Math.abs(x-y)<=1  ) {
			return true;
		} else {
			fFinal=false;
			return false;
		}
	}
//	boolean flag=false;
	public void isBalanced(Node temp) {
		if (temp == null) {
			return;
		}
		isBalanced(temp.left);
		getHeightUtil(temp);
		isBalanced(temp.right);
	}
	
	public void isBalancedUtil(Node temp) {
		isBalanced(temp);
		System.out.println(fFinal);
	}

	public static void main(String[] args) {
		Q110BalancedTree tree = new Q110BalancedTree();
		tree.root = new Node(1);
		tree.root.right = new Node(2);
		tree.root.right.right = new Node(2);
//		tree.root.right = new Node(3);
//		tree.root.left.left = new Node(3);
//		tree.root.left.right = new Node(3);
//		tree.root.left.left.left = new Node(3);
//		tree.root.left.left.right = new Node(3);
			
//		tree.root.left.left = new Node(4);
//		tree.root.left.left.left = new Node(22);
//		tree.root.left.left.right = new Node(10);
//		tree.root.left.right = new Node(5);
//		tree.root.left.left.right.left = new Node(6);
//		int x = tree.getHeight(tree.root);
//		System.out.println(x);
		tree.isBalancedUtil(tree.root);
	}
}
