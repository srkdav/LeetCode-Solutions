package leetQuestions;

public class Q1325DeleteLeavesofTree {
	
	Node root;
	
	Q1325DeleteLeavesofTree(){
		root=null;
	}
	
	Q1325DeleteLeavesofTree(int key){
		root = new Node(key);
	}
	
	boolean flag=false;
	public void checkLeaves(Node temp,int val) {
		if(temp==null) {
			return;
		}
		if(temp.left==null && temp.right==null) {
			if(temp.key==val) {
				flag=true;
			}
		}
		checkLeaves(temp.left, val);
		checkLeaves(temp.right, val);
		
	}
	
	public Node deleteLeafOfK(Node temp,int val) {
		if(temp==null) {
			return null;
		}
		if(temp.left==null && temp.right==null && temp.key==val) {
			return null;
		}
		temp.left=deleteLeafOfK(temp.left,val);
		temp.right=deleteLeafOfK(temp.right,val);
		return temp;
	}
	
	public void deleteLeafOfKAll(Node temp,int val) {
		boolean ans=true;
		while(ans) {
			flag=false;
			checkLeaves(temp, val);
			if(temp.left==null && temp.right==null) {
				break;
			}
			if(flag==true) {
				deleteLeafOfK(temp,val);
			}else {
				break;
			}
		}
		
	}

	public static void main(String[] args) {

		Q1325DeleteLeavesofTree tree = new Q1325DeleteLeavesofTree();
		tree.root = new Node(2);
		tree.root.left = new Node(2);
		
//		tree.root.left.left = new Node(2);
//		tree.root.left.left.left = new Node(2);
//		tree.root.left.left.left.left = new Node(3);
//		tree.root.left.right = new Node(3);
		
		tree.root.right = new Node(2);
//		tree.root.right.left = new Node(2);
//		tree.root.right.right = new Node(3);
		tree.deleteLeafOfKAll(tree.root, 2);
		
	}

}
