package leetQuestions;

public class Q98ValidateBST {
	
	Node root;
	Q98ValidateBST(){
		root = null;
	}
	
	Q98ValidateBST(int key){
		root = new Node(key);
	}
	
//	boolean flag= true;
	boolean isValidBST(Node parent,Node temp,boolean flag) {
		if(temp==null) {
			return true;
		}
		isValidBST(parent,temp.left,flag);
		if(temp!=null) {
			if(temp.key>=parent.key) {
				flag=false;
				return flag;
			}
		}
		isValidBST(parent,temp.right,flag);
		if(temp!=null) {
			if(temp.key<=parent.key) {
				flag=false;
				return flag;
			}
		}
		return flag;
	}
	
	public void isValidBSTUtil(Node temp) {
		boolean flag = true;
		Node parent=temp;
		boolean ans=isValidBST(parent,temp, flag);
		System.out.println(ans);
		
	}

	public static void main(String[] args) {
		Q98ValidateBST tree1 = new Q98ValidateBST();
		tree1.root = new Node(10);
		tree1.root.left = new Node(5);
		tree1.root.right = new Node(15);
		tree1.root.left.left = new Node(2);
		tree1.root.left.right = new Node(17);
		tree1.root.right.left = new Node(9);
		tree1.root.right.right = new Node(20);
		tree1.isValidBSTUtil(tree1.root);
//		System.out.println(tree1.flag);

	}

}
