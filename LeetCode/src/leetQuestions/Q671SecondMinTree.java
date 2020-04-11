package leetQuestions;

public class Q671SecondMinTree {

	Node root;

	Q671SecondMinTree() {
		root = null;
	}

	Q671SecondMinTree(int key) {
		root = new Node(key);
	}

//	int min1 = 0;
//	int a = Integer.MAX_VALUE;
//	public void minimumValue(Node temp) {
//		if(temp==null) {
//			return;
//		}
//		if (temp != null) {
//			if (min1 < temp.key && temp.key<a) {
//				a=temp.key;
//			} else if (min1 == temp.key) {
//				minimumValue(temp.left);
//				minimumValue(temp.right);
//			}
//		}
//	}
//
//	public void finalMin(Node root) {
//		min1=root.key;
//		minimumValue(root);
//		if(a<Integer.MAX_VALUE) {
//			System.out.println(a);
//		}else{
//			System.out.println(-1);
//		}
//	}
	public void findMin2Util(Node temp) {

		findMin2(temp);
		System.out.println(min2);
		if (flag == false) {
			System.out.println(-1);
		}

	}

	int min1 = Integer.MAX_VALUE;
	boolean flag = false;
	int min2 = Integer.MAX_VALUE;

	public void findMin2(Node temp) {
		if (temp == null) {
			return;
		}
		findMin2(temp.left);
		findMin2(temp.right);
		if (min1 == Integer.MAX_VALUE) {
			if (temp.key < min1) {
				min1 = temp.key;
			}
		}else {
			if(temp.key<min1) {
				min2=min1;
				min1=temp.key;
				flag=true;
			}
		}
		if (temp.key <= min2 && temp.key > min1) {
			min2 = temp.key;
			flag = true;
		}

	}

	public static void main(String[] args) {
		Q671SecondMinTree tree = new Q671SecondMinTree();
		tree.root = new Node(5);
		tree.root.left = new Node(8);
		tree.root.right = new Node(5);
//		tree.root.right.left = new Node(5);
//		tree.root.right.right = new Node(7);
		tree.findMin2Util(tree.root);
//		tree.root.left.left = new Node(4);
//		tree.root.left.right = new Node(5);
//		tree.root.left.left.left = new Node(0);
//		tree.root.left.left.right = new Node(9);
//		System.out.println(tree.a);
//		System.out.println(tree.b);
	}

}

//public int minimumValue(Node temp) {
//	if (temp == null) {
//		return Integer.MAX_VALUE;
//	}
//	if (temp.left == null && temp.right == null) {
//		return temp.key;
//	}
//	int l = minimumValue(temp.left);
//	int r = minimumValue(temp.right);
//	if (temp != root) {
//		if (temp.left != null || temp.right != null) {
//			m = Math.min(temp.key, Math.min(l, r));
//		}
//	}
//	if (temp == root) {
//		a=l;
//		b=r;
//	}
//	return m;
//}
//
//public int finalMin(Node root) {
//	minimumValue(root);
//	if(root.key==a && root.key==b) {
//		System.out.println(-1);
//	
//		return -1;
//	}
//	else if(root.key==a || root.key==b) {
//		System.out.println(Math.max(a, b));
//		return 2;
//	}
//	else {
//		System.out.println(Math.min(a, b));
//		return 3;
//	}
//	
//}
