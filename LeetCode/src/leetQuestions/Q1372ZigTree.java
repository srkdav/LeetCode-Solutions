package leetQuestions;

//incomplete
public class Q1372ZigTree {
	Node root;
	
	Q1372ZigTree(){
		root = null;
	}
	
	Q1372ZigTree(int key){
		root = new Node(key);
	}
	
	int k=0;
	int max=0;
	void zigZagLengthLeft(Node temp) {
		boolean flag=false;
		while(temp!=null) {
			if(temp.left!=null) {
				temp=temp.left;
				k++;
				flag=true;
				if(k>max) {
					max=k;
				}
			}else {
				flag=false;
				if(k>max) {
					max=k;
				}
				break;
			}
			if(temp.right!=null) {
				temp=temp.right;
				k++;
				flag=true;
			}else {
				flag=false;
				if(k>max) {
					max=k;
				}
				break;
			}
			if(k>max) {
				max=k;
			}
			if(temp.right==null || temp.left==null && temp.right==null) {
				break;
			}
			if(flag==false) {
				break;
			}
		}	
	}
	
	void zigZagLengthRight(Node temp) {
		boolean flag=false;
		while(temp!=null) {
			if(temp.right!=null) {
				flag=true;
				temp=temp.right;
				k++;
			}else {
				flag=false;
				if(k>max) {
					max=k;
				}
				break;
			}
			if(temp.left!=null) {
				temp=temp.left;
				k++;
			}else {
				flag=false;
				if(k>max) {
					max=k;
				}
				break;
			}
			if(k>max) {
				max=k;
			}
			if(temp.left==null && temp.right==null) {
				break;
			}
			if(flag==false) {
				break;
			}
		}	
	}
	
	void inOrder(Node temp) {
		if(temp==null) {
			return;
		}
		inOrder(temp.left);
		k=0;
		zigZagLengthLeft(temp);
		k=0;
		zigZagLengthRight(temp);
		inOrder(temp.right);
	}
	
	void finalLength(Node temp) {
		inOrder(temp);
		System.out.println(max);
	}
	
	

	public static void main(String[] args) {
		Q1372ZigTree tree1 = new Q1372ZigTree();
		tree1.root = new Node(11);
		
//		tree1.root.left = new Node(2);
		tree1.root.right = new Node(12);
		
		tree1.root.right.left = new Node(13);
		tree1.root.right.right = new Node(14);
		
		tree1.root.right.right.left = new Node(15);
		tree1.root.right.right.right = new Node(16);
//		tree1.root.left.right.left.right = new Node(6);
		
		tree1.root.right.right.left.right = new Node(17);
		tree1.root.right.right.left.right.right = new Node(18);
		tree1.root.right.right.left.right.right.right = new Node(19);
//		tree1.root.left.right.left = new Node(15);
//		tree1.root.left.right.right = new Node(25);
		tree1.finalLength(tree1.root);
//		System.out.println(tree1.max);
//		tree1.zigZagLengthRight(tree1.root.right);
//		System.out.println(tree1.max);
	}

}
