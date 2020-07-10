package leetQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q872LeafTree {

	Node root;
	Q872LeafTree(){
		root=null;
	}
	
	Q872LeafTree(int key){
		root = new Node(key);
	}
	
//	List<Integer> list1 = new ArrayList<Integer>();
	public void getLeafSeq(Node temp1,Node temp2) {
		Stack<Integer> list1 = new Stack<Integer>();
		allLeafNodes(temp1,list1);
		Stack<Integer> list2 = new Stack<Integer>();
		allLeafNodes(temp2,list2);
		boolean flag=true;
		if(list1.size()>0 && list2.size()>0) {
			while(list2.size()>0 && list1.size()>0) {
				Integer a= list1.pop();
				Integer b= list2.pop();
				if(a!=b) {
					flag=false;
				}
			}
		}
		System.out.println(flag);
	}
	public void allLeafNodes(Node temp1,Stack<Integer> list1) {
		if(temp1==null) {
			return;
		}
		if(temp1.left==null && temp1.right==null) {
			list1.add(temp1.key);
		}
		allLeafNodes(temp1.left,list1);
		allLeafNodes(temp1.right,list1);
	}
	public static void main(String[] args) {
		Q872LeafTree tree1 = new Q872LeafTree();
		tree1.root = new Node(1);
		tree1.root.left = new Node(2);
		tree1.root.right = new Node(3);
		tree1.root.left.left = new Node(4);
		tree1.root.left.right = new Node(5);
		tree1.root.right.left = new Node(6);
		tree1.root.right.right = new Node(7);
		
		Q872LeafTree tree2 = new Q872LeafTree();
		tree2.root = new Node(1);
		tree2.root.left = new Node(2);
		tree2.root.right = new Node(3);
		tree2.root.left.left = new Node(4);
		tree2.root.left.right = new Node(5);
		tree2.root.right.left = new Node(6);
		tree2.root.right.right = new Node(0);
		
		tree1.getLeafSeq(tree1.root, tree2.root);
		
	}

}
