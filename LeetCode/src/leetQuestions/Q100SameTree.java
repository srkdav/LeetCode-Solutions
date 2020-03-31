package leetQuestions;

public class Q100SameTree {

	Node root;

	Q100SameTree() {
		root = null;
	}

	Q100SameTree(int key) {
		root = new Node(key);
	}

	boolean flag = true;
	void inOrderTraversal(Node temp1, Node temp2) {
		if (temp1 == null || temp2 == null) {
			if(temp1!=null || temp2!=null) {
				flag=false;
			}
			return;
		}

		if (temp1 != null || temp2 != null) {
			if (temp1.key != temp2.key) {
				flag = false;
			}
		}
		inOrderTraversal(temp1.left, temp2.left);
		inOrderTraversal(temp1.right, temp2.right);
	}

	public static void main(String[] args) {
		Q100SameTree tree1 = new Q100SameTree();
		tree1.root = new Node(1);
		tree1.root.left = new Node(2);
		tree1.root.right = new Node(3);
		tree1.root.left.left = new Node(4);
//		tree1.root.left.right = new Node(5);
		tree1.root.right.left = new Node(6);
		tree1.root.right.right = new Node(7);
		
		Q100SameTree tree2 = new Q100SameTree();
		tree2.root = new Node(1);
		tree2.root.left = new Node(2);
		tree2.root.right = new Node(3);
		tree2.root.left.left = new Node(4);
		tree2.root.left.right = new Node(5);
		tree2.root.right.left = new Node(6);
		tree2.root.right.right = new Node(7);
		
		
		tree1.inOrderTraversal(tree1.root,tree2.root);
		System.out.println(tree1.flag);
	}

}
