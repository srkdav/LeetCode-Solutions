package leetQuestions;

public class Q1302DeepLeaveTree {

	Node root;
	
	Q1302DeepLeaveTree(){
		root=null;
	}
	
	Q1302DeepLeaveTree(int key){
		root = new Node(key);
	}
	
	int depth=0;
	public int maxDepth(Node temp) {
		if(temp==null) {
			return 0;
		}
		
		int l = maxDepth(temp.left);
		int r = maxDepth(temp.right);
		return Math.max(l, r)+1;
	}
	int sum=0;
	public void sumOfDeepLeaveUtil(Node temp) {
		int d = maxDepth(temp);
		sumOfDeepLeav(temp,d);
		System.out.println(sum);
		
	}
	public void sumOfDeepLeav(Node temp,int d) {
		if(temp==null) {
			return;
		}
		
		if(temp!=null && d<=1) {
			sum=sum+temp.key;
		}
		sumOfDeepLeav(temp.left,d-1);
		sumOfDeepLeav(temp.right,d-1);
	}
	public static void main(String[] args) {

		Q1302DeepLeaveTree tree1 = new Q1302DeepLeaveTree();
		tree1.root = new Node(1);
		tree1.root.left = new Node(2);
		tree1.root.right = new Node(3);
		tree1.root.left.left = new Node(4);
		tree1.root.left.left.right= new Node(4);
//		tree1.root.left.right = new Node(5);
//		tree1.root.right.left = new Node(6);
		tree1.root.right.right = new Node(7);
		tree1.sumOfDeepLeaveUtil(tree1.root);
	}

}
