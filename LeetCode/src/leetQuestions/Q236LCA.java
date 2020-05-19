package leetQuestions;

public class Q236LCA {

	Node root;

	Q236LCA() {
		root = null;
	}

	Q236LCA(int k) {
		root = new Node(k);
	}

	public boolean findLCALeft(Node temp, Node l,Node r) {
		if (temp == null) {
			return false;
		}
		if (temp == l || temp==r) {
			return true;
		}
		boolean t = findLCALeft(temp.left, l, r);
		boolean s = findLCALeft(temp.right, l, r);
		return t || s;
	}

	public boolean findLCARight(Node temp, Node l, Node r) {
		if (temp == null) {
			return false;
		}
		if (temp == l || temp==r) {
			return true;
		}
		boolean t = findLCARight(temp.left, l, r);
		boolean s = findLCARight(temp.right, l, r);
		return t || s;
	}

	Node ancestor = null;

	public void traverseTree(Node temp, Node l, Node r) {
		if (temp == null) {
			return;
		}
		if (temp == l && findLCARight(temp.right, l,r)) {
			ancestor = temp;
		}
		if (temp == r && findLCALeft(temp.left, l,r) ) {
			ancestor = temp;
		}
		if (findLCALeft(temp.left, l,r) && findLCARight(temp.right, l,r)) {
			ancestor = temp;
		}
		
		traverseTree(temp.left, l, r);
		traverseTree(temp.right, l, r);
	}

	public static void main(String[] args) {
		Q236LCA tree1 = new Q236LCA();
		tree1.root = new Node(2);

		// tree1.root.left = new Node(5);
		tree1.root.right = new Node(1);

		// tree1.root.left.left = new Node(6);
		// tree1.root.left.right = new Node(2);
		//
		// tree1.root.right.left = new Node(0);
		// tree1.root.right.right = new Node(8);
		// tree1.root.left.right.left = new Node(7);
		// tree1.root.left.right.right = new Node(4);
		tree1.traverseTree(tree1.root, tree1.root.right, tree1.root);
		System.out.println(tree1.ancestor.key);

	}

}


//if (temp == l && findLCARight(temp.right, r) || temp == l && findLCALeft(temp.left, r)) {
//	ancestor = temp;
//}
//if (temp == r && findLCALeft(temp.left, l) || temp == r && findLCARight(temp.right, l)) {
//	ancestor = temp;
//}
//if (findLCALeft(temp.left, l) && findLCARight(temp.right, r)) {
//	ancestor = temp;
//}
//if (findLCALeft(temp.left, r) && findLCARight(temp.right, l)) {
//	ancestor = temp;
//}