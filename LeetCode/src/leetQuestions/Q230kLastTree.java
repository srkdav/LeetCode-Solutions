package leetQuestions;

public class Q230kLastTree {

	Node root;

	Q230kLastTree() {
		root = null;
	}

	Q230kLastTree(int key) {
		root = new Node(key);
	}

	int k = 0;
	Node ans=null;
	void inOrder(Node temp,int m) {
		if(temp==null) {
			return;
		}
		inOrder(temp.left,m);
		k++;
		if(k==m) {
			ans=temp;
//			System.out.println(temp.key);
		}
		inOrder(temp.right,m);
	}

	void findKSmall(Node temp,int k) {
		inOrder(temp,k);
		System.out.println(ans.key);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q230kLastTree tree1 = new Q230kLastTree();
		tree1.root = new Node(5);
		tree1.root.left = new Node(3);
		tree1.root.left.left = new Node(2);
		tree1.root.left.left.left = new Node(1);
		tree1.root.left.right = new Node(4);
		tree1.root.right = new Node(6);
		tree1.findKSmall(tree1.root, 3);
	
	}

}
