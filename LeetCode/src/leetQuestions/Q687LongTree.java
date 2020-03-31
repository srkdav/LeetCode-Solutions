package leetQuestions;


public class Q687LongTree {

	Node root;
	
	Q687LongTree(){
		root=null;
	}
	
	Q687LongTree(int key){
		root = new Node(key);
	}
	
	int sum=0;
	public void distanceTree(Node temp) {
		if(temp==null) {
			return;
		}
		if(temp.left!=null && temp.key==temp.left.key) {
			sum++;
		}
		if(temp.right!=null && temp.key==temp.right.key) {
			sum++;
		}
		distanceTree(temp.left);
		distanceTree(temp.right);
	}
	
	public static void main(String[] args) {
		Q687LongTree tree = new Q687LongTree();
		tree.root = new Node(1);
		tree.root.left = new Node(4);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(4);
		tree.root.right = new Node(5);
		tree.root.right.right = new Node(5);
//		tree.root.left.left.left = new Node(22);
//		tree.root.left.left.right = new Node(10);
//		tree.root.left.right = new Node(2);
//		tree.root.left.left.right.left = new Node(6);
		tree.distanceTree(tree.root);
		System.out.println(tree.sum);
	}

}
