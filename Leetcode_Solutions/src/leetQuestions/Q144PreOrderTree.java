package leetQuestions;

import java.util.Stack;

public class Q144PreOrderTree {
	Node root;
	
	Q144PreOrderTree(){
		root = null;
	}
	
	Q144PreOrderTree(int key){
		root = new Node(key);
	}

	Stack<Node> st = new Stack<Node>();
	void preOrder(Node temp) {
		st.add(temp);
		while(!st.isEmpty() || temp!=null) {
			Node curr = st.pop();
			System.out.print(curr.key);
			if(curr.right!=null) {
				st.push(curr.right);
			}
			if(curr.left!=null) {
				st.push(curr.left);
			}
			if(st.isEmpty()) {
				break;
			}
		}
	}
	
	

	public static void main(String[] args) {
		Q144PreOrderTree tree1 = new Q144PreOrderTree();
		tree1.root = new Node(1);
		tree1.root.left = new Node(2);
		tree1.root.left.left = new Node(4);
		tree1.root.left.right = new Node(5);
		tree1.root.right = new Node(3);
		tree1.preOrder(tree1.root);
	}

}
