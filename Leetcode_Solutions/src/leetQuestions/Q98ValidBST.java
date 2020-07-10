package leetQuestions;

public class Q98ValidBST {

	Node root;
	Q98ValidBST(){
		root = null;
	}
	Q98ValidBST(int key){
		root = new Node(key);
	}
	
	public boolean checkBSTLeft(Node temp,int key){
		if(temp==null){
			return true;
		}
		if(temp.key>=key){
			return false;
		}
		boolean l=checkBSTLeft(temp.left, key);
		boolean r = checkBSTLeft(temp.right, key);
		return l&&r;
	}
	public boolean checkBSTRight(Node temp,int key){
		if(temp==null){
			return true;
		}
		if(temp.key<=key){
			return false;
		}
		boolean l=checkBSTRight(temp.left, key);
		boolean r = checkBSTRight(temp.right, key);
		return l&&r;
	}
	boolean fin=true;
	public void treeTraversal(Node temp){
		if(temp==null){
			return ;
		}
		treeTraversal(temp.left);
		boolean ans=checkBSTLeft(temp.left, temp.key) && checkBSTRight(temp.right, temp.key);
		if(!ans)
			fin=false;
		treeTraversal(temp.right);
	}
	
	public boolean checkBST(Node temp,Integer low,Integer up){
		if(temp==null){
			return true;
		}
		if(low!=null && temp.key<=low){
			return false;
		}
		if(up!=null && temp.key>=up){
			return false;
		}
		return checkBST(temp.left, low, temp.key) && checkBST(temp.right, temp.key, up);
		
	}
	public static void main(String[] args) {
		Q98ValidBST tree2 = new Q98ValidBST();
		tree2.root = new Node(10);
		tree2.root.left = new Node(5);
		tree2.root.right = new Node(15);
		tree2.root.left.left = new Node(4);
		tree2.root.left.right = new Node(6);
		tree2.root.right.left = new Node(12);
		tree2.root.right.right= new Node(6);	
//		tree2.treeTraversal(tree2.root);
//		System.out.println(tree2.fin);
		boolean x=tree2.checkBST(tree2.root, null, null);
		System.out.println(x);
	}

}
