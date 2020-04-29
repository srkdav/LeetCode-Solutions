package leetQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class Q951FlipBT {

	Node root;

	Q951FlipBT() {
		root = null;
	}

	Q951FlipBT(int key) {
		root = new Node(key);
	}

//	boolean swap=true;
	public static boolean flipBTRecurse(Node temp1,Node temp2) {
		if(temp1==null && temp2==null){
			return true;
		}
		if(temp1==null || temp2==null || temp1.key!=temp2.key ){
			return false;
		}
		boolean non_swap_left=flipBTRecurse(temp1.left, temp2.left);
		boolean non_swap_right=flipBTRecurse(temp1.right, temp2.right);
		boolean swap_left=flipBTRecurse(temp1.left, temp2.right);
		boolean swap_right=flipBTRecurse(temp1.right, temp2.left);
		if(non_swap_left==true && non_swap_right==true){
			return true;
		}
		if(swap_left==true && swap_right==true){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Q951FlipBT tree1 = new Q951FlipBT();
		tree1.root = new Node(1);
		tree1.root.left = new Node(2);
		tree1.root.right = new Node(3);
		tree1.root.right.left = new Node(6);
		tree1.root.left.left = new Node(4);
		tree1.root.left.right = new Node(5);
		tree1.root.left.right.left = new Node(7);
		tree1.root.left.right.right = new Node(8);
		
		Q951FlipBT tree2 = new Q951FlipBT();
		tree2.root = new Node(1);
		tree2.root.left = new Node(3);
		tree2.root.left.right = new Node(6);
		tree2.root.right = new Node(2);
		tree2.root.right.left = new Node(4);
		tree2.root.right.right = new Node(5);
		tree2.root.right.right.left = new Node(8);
		tree2.root.right.right.right = new Node(7);
		
		System.out.println(flipBTRecurse(tree1.root, tree2.root));

	}

}
//if(non_swap_left==true || non_swap_right==true || swap_left==true || swap_right==true){
////	return false;
////}