package leetQuestions;

public class Q814PruneTree {

	Node root;

	Q814PruneTree() {
		root = null;
	}

	Q814PruneTree(int key) {
		root = new Node(key);
	}

	boolean pruneTree(Node temp) {
		if (temp == null) {
			return false;
		}
		boolean l = pruneTree(temp.left);
		boolean r = pruneTree(temp.right);
//		if (temp.left==null && temp.right==null && temp.key == 0) {
//			return false;
//		}
//		if (temp.left==null && temp.right==null && temp.key > 0) {
//			return true;
//		}
//		if (temp.left!=null || temp.right!=null ) {
			if(l==false) {
				temp.left=null;
			}
			if(r==false) {
				temp.right=null;
			}
//		}
		return temp.key==1 || l || r;
	}
	
	Node pruneTreeUtil(Node temp) {
		pruneTree(temp);
		return temp;
	}

	public static void main(String[] args) {
		Q814PruneTree tree = new Q814PruneTree();
		tree.root = new Node(0);
		tree.root.left = new Node(0);
		tree.root.right = new Node(1);
		tree.root.left.left = new Node(1);
		tree.root.left.left.left = new Node(0);
		tree.root.left.left.right = new Node(1);
		tree.root.left.right = new Node(1);
		tree.root.left.right.left = new Node(0);
//		tree.root.left.left.left = new Node(0);
//		tree.root.left.right.right = new Node(0);
		tree.root.right.left = new Node(1);
		tree.root.right.left.left = new Node(0);
		tree.root.right.left.right = new Node(1);
		tree.root.right.right = new Node(0);
		tree.root.right.right.left = new Node(1);
		tree.root.right.right.right = new Node(0);
//		tree.root.right.right.left = new Node(0);
//		tree.root.right.right.left.right = new Node(0);
//		tree.root.right.right.right = new Node(1);
//		tree.pruneTree(tree.root);
		tree.pruneTreeUtil(tree.root);
	}

}
