package leetQuestions;

public class Q222CountNodes {

	Node root;
	
	Q222CountNodes(){
		root=null;
	}
	Q222CountNodes(int val){
		root = new Node(val);
	}
	public static int countLeft(Node root,int level) {
		if(root==null) {
			return 0;
		}
		return 1+countLeft(root.left, level+1);
	}
	
	public static int countRight(Node root,int level) {
		if(root==null) {
			return 0;
		}
		return 1+countRight(root.right, level+1);
	}
	
	public static int countNodes(Node root) {
		if(root==null) {
			return 0;
		}
		int left = countLeft(root, 1);
		int right = countRight(root,1);
		if(left==right) {
			return ((int)Math.pow(2, left)-1);
		}else {
			return 1+countNodes(root.left)+countNodes(root.right);
		}
	}
	public static void main(String[] args) {

		Q222CountNodes tree = new Q222CountNodes();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
//		tree.root.left.right=new Node(5);
//		tree.root.right.left=new Node(6);
//		tree.root.right.right=new Node(7);
		System.out.println(countNodes(tree.root));
	}

}
