package leetQuestions;

import java.util.ArrayList;
import java.util.List;


public class Q863DistKTree {

	Node root;

	Q863DistKTree() {
		root = null;
	}

	Q863DistKTree(int key) {
		root = new Node(key);
	}
	static List<Integer> list = new ArrayList<Integer>();	
	public void treeTraversal(Node temp,int step,int k) {
		if(temp==null) {
			return;
		}
		if(step==k) {
			list.add(temp.key);
		}
		treeTraversal(temp.left, step+1,k);
		treeTraversal(temp.right, step+1,k);				
	}
	public void treeTraversalfromRoot(Node temp,int step,int k,boolean flag,Node temp1) {
		if(temp==null) {
			return;
		}
		if(temp==temp1) {
			return;
		}
		if(step==k) {
			list.add(temp.key);
		}
		treeTraversalfromRoot(temp.left, step+1, k-1, flag, temp1);
		treeTraversalfromRoot(temp.right, step+1, k-1, flag, temp1);
	}

	public static void main(String[] args) {

		Q863DistKTree tree1 = new Q863DistKTree();
		tree1.root = new Node(3);
		tree1.root.left = new Node(5);
		tree1.root.left.left = new Node(6);
		tree1.root.left.right = new Node(2);
		tree1.root.left.right.left = new Node(7);
		tree1.root.left.right.right = new Node(4);
//		tree1.root.left.right.right.left = new Node(14);
		tree1.root.right = new Node(1);
		tree1.root.right.left = new Node(0);
		tree1.root.right.right = new Node(8);
		Node target = tree1.root.left;
		tree1.treeTraversal(target, 0, 2);
		tree1.treeTraversalfromRoot(tree1.root, 0,2, false, target);
		System.out.println(list);
	}

}


//		int levelK = findElement(temp, k, 1);
//if(levelK!=1) {
//	int diff = levelK-1;
//	findElementsFromRoot(temp, levelK+diff);
//}
//findElementsFromRoot(element, 3);
//int findElementUtil(Node temp, Node target,int k) {
//if(temp==null) {
//	return -1;
//}
//if(target==temp) {
//	findElementsFromRoot(temp, k);
//	return 0;
//}
//int dl = findElementUtil(temp.left,target,k);
//if(dl!=-1) {
//	if(dl+1==k) {
//		System.out.print(temp.key+" ");
//	}else {
//		findElementsFromRoot(temp.right, k-dl-2);
//	}
//	return 1+dl;
//}
//
//int dr = findElementUtil(temp.right,target, k);
//if(dr!=-1) {
//	if(dr+1==k) {
//		System.out.print(temp.key+" ");
//	}else {
//		findElementsFromRoot(temp.left, k-dr-2);
//	}
//	return 1+dr;
//}
//return -1;
//}
//
//int findElement(Node temp, int k, int level) {
//if (temp == null) {
//	return 0;
//}
//if (temp.key == k) {
//	element=temp;
//	return level;
//}
//int l = findElement(temp.left, k, level + 1);
//if (l != 0) {
//	return l;
//}
//l = findElement(temp.right, k, level + 1);
//return l;
//
//}
//
//public void findElementsFromRoot(Node temp, int d) {
//
//if (temp == null) {
//	return;
//}
//if (d == 0) {
//	list.add(temp.key);
//	System.out.print(temp.key+" ");
//	return;
//} 
//else {
//	findElementsFromRoot(temp.left, d - 1);
//	findElementsFromRoot(temp.right, d - 1);
//}
//}
