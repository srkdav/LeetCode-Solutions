package leetQuestions;

public class Q1448CountBT {

	Node root;
	
	Q1448CountBT(){
		root=null;
	}
	
	Q1448CountBT(int key){
		root = new Node(key);
	}
	
	static int count=0;
	public void countGoodNodes(Node temp,int high){
		if(temp==null){
			return;
		}
		countGoodNodes(temp.left, Math.max(high, temp.key));
		countGoodNodes(temp.right, Math.max(high, temp.key));
		if(temp.key>=high){
			count++;
		}
	}
	public static void main(String[] args) {
		Q1448CountBT tree5 = new Q1448CountBT();
		tree5.root = new Node(3);
		tree5.root.left = new Node(3);
//		tree5.root.right = new Node(4);
		tree5.root.left.left = new Node(4);
		tree5.root.left.right = new Node(2);
//		tree5.root.right.left=new Node(1);
//		tree5.root.right.right=new Node(5);
		tree5.countGoodNodes(tree5.root, tree5.root.key);
		System.out.println(tree5.count);

	}

}
