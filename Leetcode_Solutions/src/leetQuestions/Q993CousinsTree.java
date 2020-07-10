package leetQuestions;

public class Q993CousinsTree {

	Node root;
	
	Q993CousinsTree(){
		root=null;
	}
	Q993CousinsTree(int key){
		root = new Node(key);
	}
	
	int level=0;
	Node parent=null;
	void findLevelParent(Node temp,int val,int l) {
		if(temp==null) {
			return;
		}
		if(temp.left!=null &&temp.left.key==val 
				|| temp.right!=null && temp.right.key==val) {
			parent=temp;
		}
		if(temp.key==val) {
			level=l;
		}
		findLevelParent(temp.left,val,l+1);
		findLevelParent(temp.right,val,l+1);
	}
	
	 void isCousin(Node temp,int x,int y) {
		 findLevelParent(temp,x,0);
		 int flevel=level;
		 Node fp=parent;
		 findLevelParent(temp,x,0);
		 int slevel=level;
		 Node sp=parent;
		 if(flevel==slevel && fp==sp) {
			 System.out.println("true");
		 }else {
			 System.out.println("false");
		 }
		 System.out.println("fparent is" );
		
		 
	}
	public static void main(String[] args) {
		
		Q993CousinsTree tree5 = new Q993CousinsTree();
		tree5.root = new Node(1);
		tree5.root.left = new Node(2);
		tree5.root.right = new Node(3);
		tree5.root.left.left = new Node(4);
//		tree5.root.left.right = new Node(4);
//		tree5.root.right.left = new Node(5);
//		tree5.root.right.right = new Node(5);
//		tree5.findLevelParent(tree5.root, 2, 0);
		tree5.isCousin(tree5.root, 5,4);
	}

}
