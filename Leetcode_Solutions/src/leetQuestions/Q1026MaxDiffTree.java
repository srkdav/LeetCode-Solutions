package leetQuestions;

public class Q1026MaxDiffTree {

	Node root;
	
	Q1026MaxDiffTree(){
		root= null;
	}
	
	Q1026MaxDiffTree(int key){
		root = new Node(key);
	}
	
	int max=0;
	Node parent=null;
	public void inOrder(Node temp) {
		if(temp==null) {
			return;
		}
		inOrder(temp.left);
		parent=temp;
		maxDiff(temp,parent);
		inOrder(temp.right);
	}
	
	private void maxDiff(Node temp,Node parent) {
		if(temp==null) {
			return;
		}
		maxDiff(temp.left,parent);
		maxDiff(temp.right,parent);
		if(temp!=null) {
			if(Math.abs(temp.key-parent.key)>max) {
				max=Math.abs(temp.key-parent.key);
			}
		}
	}

	public static void main(String[] args) {
		Q1026MaxDiffTree tree= new Q1026MaxDiffTree();
		tree.root = new Node(8);
		tree.root.left = new Node(3);
		tree.root.right = new Node(10);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(6);
		tree.root.left.right.left = new Node(4);
		tree.root.left.right.right = new Node(7);
		tree.root.right.right = new Node(14);
		tree.root.right.right.left = new Node(13);
		tree.inOrder(tree.root);
		System.out.println(tree.max);
		
	}

}
