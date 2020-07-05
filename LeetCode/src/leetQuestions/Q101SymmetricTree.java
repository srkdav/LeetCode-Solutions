package leetQuestions;

import java.util.Stack;

//to do!!!!
public class Q101SymmetricTree {

	Node root;

	Q101SymmetricTree() {
		root = null;
	}

	Q101SymmetricTree(int key) {
		root = new Node(key);
	}

	int count = 0;
	Node parent = null;
	Stack<Node> q = new Stack<Node>();

	void printAllPaths1(Node temp, int sum) {
		if (temp == null) {
			return;
		}
		q.add(temp);
		printStack(q, sum);
		if (temp.left == null && temp.right == null) {
			Node curr = q.peek();
			while (temp == curr && q.size() > 0) {
				curr = q.pop();
				if (q.size() > 0) {
					curr = q.peek();
				}
			}
		}
		printAllPaths1(temp.left, sum);
		printAllPaths1(temp.right, sum);
		if (!q.isEmpty()) {
			if (temp == q.peek()) {
				q.pop();
			}
		}
	}
	//

	public void printStack(Stack<Node> st, int sum) {
		int st_sum = 0;
		Stack<Node> st1 = new Stack<Node>();
//		if (st.size() > 1) {
			while (!st.isEmpty()) {
				Node t = st.pop();
				st_sum = st_sum + t.key;
				st1.add(t);
//        	System.out.println("st_sum is"+ st_sum);    
			System.out.print(t.key + " ");
			}
			while (!st1.isEmpty()) {
				Node t = st1.pop();
				st.add(t);
			}
			System.out.println();
			if (st_sum == sum) {
				count++;
			}
//		}
	}

	//
	void printAllPaths(Node temp, int sum) {
		while (temp != null) {
			printAllPaths1(temp, sum);
			temp = temp.left;
		}
		temp = root;
		while (temp.right != null) {
			temp = temp.right;
			printAllPaths1(temp, sum);
		}
	}

	//
	void inOrderTraversal(Node temp, int sum) {
		if (temp == null) {
			return;
		}
		if (temp.key == sum) {
			count++;
		}
		inOrderTraversal(temp.left, sum);
		inOrderTraversal(temp.right, sum);
	}

	public int pathSum(Node root, int sum) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			if (root.key == sum) {
				count++;
			} else {
				count = 0;
			}
			return count;
		}
		parent = root;
		printAllPaths(root, sum);
		inOrderTraversal(root, sum);
		return count;
	}

	public static boolean isSymmentric(Node root1,Node root2) {
		if(root1==null && root2==null) {
			return true;
		}
		if(root1==null || root2==null) {
			return false;
		}
		return root1.key==root2.key && isSymmentric(root1.right, root2.left) &&
				isSymmentric(root1.left, root2.right);
	}
	public static void main(String[] args) {

		Q101SymmetricTree tree1 = new Q101SymmetricTree();
		tree1.root = new Node(1);
		tree1.root.left = new Node(2);
		tree1.root.right = new Node(2);
		tree1.root.left.left = new Node(3);
		tree1.root.left.right = new Node(4);
		tree1.root.right.left = new Node(4);
		tree1.root.right.right = new Node(3);
		System.out.println(isSymmentric(tree1.root, tree1.root));
//		tree1.root.left = new Node(0);
//		tree1.root.right = new Node(1);
//		tree1.root.left.left = new Node(1);
//		tree1.root.left.right = new Node(2);
//		tree1.root.right.left = new Node(0);
//		tree1.root.right.right = new Node(-1);
//		
//		tree1.root.left.left.left = new Node(0);
//		tree1.root.left.left.right = new Node(1);
//		tree1.root.left.right.left = new Node(-1);
//		tree1.root.left.right.right = new Node(0);
//		tree1.root.right.left.left = new Node(-1);
//		tree1.root.right.left.right = new Node(0);
//		tree1.root.right.right.left = new Node(1);
//		tree1.root.right.right.right = new Node(0);		
//		tree1.printAllPaths(tree1.root, 2);
//		tree1.inOrderTraversal(tree1.root, 2);
//		System.out.println(tree1.count);

//		tree1.root.right.right = new Node(3);
//		tree1.isSymmetric(tree1.root);
//		System.out.println(tree1.str);
	}

}

