package leetQuestions;

import java.util.Stack;

public class Q1008BST {

	Node root;

	Q1008BST() {
		root = null;
	}

	Q1008BST(int key) {
		root = new Node(key);
	}

	static Stack<Node> st = new Stack<Node>();
	public static Node constructBST(int a[]){
		Node root = new Node(a[0]);
		st.push(root);
		for(int i=1;i<a.length;i++){
			Node temp = new Node(a[i]);
			if(a[i]<st.peek().key){
				st.peek().left=temp;
			}else{
				Node check=null;
				while(!st.isEmpty() && a[i]>st.peek().key){
					check=st.pop();	
				}
				check.right=temp;
			}
			st.push(temp);
		}
		return root;
	}

	public static void main(String[] args) {
		int a[] = new int[] { 8, 5, 1, 7, 10, 12 };
		Node curr = constructBST(a);
	}

}
