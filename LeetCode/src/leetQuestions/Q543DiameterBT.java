package leetQuestions;

public class Q543DiameterBT {

	Node root;
	Q543DiameterBT(){
		root=null;
	}
	Q543DiameterBT(int key){
		root = new Node(key);
	}
	
	static int max=0;
	public static int traverseTree(Node temp){
		if(temp==null){
			return 0;
		}
		int l = traverseTree(temp.left);
		int r = traverseTree(temp.right);
		if(l+r>max){
			max=l+r;
		}
		return Math.max(l, r)+1;
		
	}
	public static void main(String[] args) {

		Q543DiameterBT tree = new Q543DiameterBT();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		traverseTree(tree.root);
		System.out.println(max);
	}

}
