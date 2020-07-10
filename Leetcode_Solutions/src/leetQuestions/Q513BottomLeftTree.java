package leetQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class Q513BottomLeftTree {

	Node root;
	
	Q513BottomLeftTree(){
		root = null;
	}
	
	Q513BottomLeftTree(int key){
		root = new Node(key);
	}
	
	Queue<Node> q = new LinkedList<Node>();
	Node leftNode=null;
	void leftLastNode(Node temp) {
		q.add(temp);
		q.add(null);
		while(!q.isEmpty() || temp!=null) {
			Node curr = q.peek();
			if(curr!=null) {
				curr = q.poll();
				if(curr.left!=null) {
					q.add(curr.left);
				}
				if(curr.right!=null) {
					q.add(curr.right);
				}
			}else {
				q.poll();
				if(q.peek()!=null) {
					leftNode=q.peek();
				}
				q.add(null);
			}
			if(q.size()==1 && q.peek()==null) {
				break;
			}
		}
		System.out.println(leftNode.key);
		
	}
	public static void main(String[] args) {
		Q513BottomLeftTree tree = new Q513BottomLeftTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
//		tree.root.left.right.left = new Node(15);
		tree.root.left.right.right = new Node(25);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.leftLastNode(tree.root);
	}

}
