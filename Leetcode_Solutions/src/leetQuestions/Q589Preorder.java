package leetQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q589Preorder {
	Node root;

	public Q589Preorder() {
		root = null;
	}

	public Q589Preorder(int key) {
		root = new Node(key);
	}
	
	
	public void sumRoot() {
		Node temp=root;
		List<Integer> list= new ArrayList<Integer>();
		if(root==null) {
			return;
		}
		Stack<Node> st = new Stack<Node>();
		while(temp!=null|| st.size()>0) {
			
		}
	}

	public void preOrder() {
		Node temp=root;
		List<Integer> list= new ArrayList<Integer>();
		if(root==null) {
			return;
		}
		Stack<Node> st = new Stack<Node>();
		while(temp!=null|| st.size()>0) {
			while(temp!=null) {
			list.add(temp.key);
			st.push(temp);
			temp=temp.left;
			}
			temp=st.pop();
			if(temp.right==null && temp.left==null) {
				temp=st.pop();
			}
			temp=temp.right;
		}
	}

	public static void main(String[] args) {

		Q589Preorder tree = new Q589Preorder();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.sumRoot();
	}

}
