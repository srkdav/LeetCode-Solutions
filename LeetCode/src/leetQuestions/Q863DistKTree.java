package leetQuestions;

import java.util.ArrayList;
import java.util.List;


//to do
public class Q863DistKTree {

	Node root;

	Q863DistKTree() {
		root = null;
	}

	Q863DistKTree(int key) {
		root = new Node(key);
	}
	Node element=null;
	List<Integer> list = new ArrayList<Integer>();
	void findElementUtil(Node temp, int k) {
		int levelK = findElement(temp, k, 1);
		if(levelK!=1) {
			int diff = levelK-1;
			findElementsFromRoot(temp, levelK+diff);
		}
		findElementsFromRoot(element, 3);
	}

	int findElement(Node temp, int k, int level) {
		if (temp == null) {
			return 0;
		}
		if (temp.key == k) {
			element=temp;
			return level;
		}
		int l = findElement(temp.left, k, level + 1);
		if (l != 0) {
			return l;
		}
		l = findElement(temp.right, k, level + 1);
		return l;

	}

	public void findElementsFromRoot(Node temp, int d) {

		if (temp == null) {
			return;
		}
		if (d == 0 && temp.key!=element.key) {
			list.add(temp.key);
			System.out.print(temp.key+" ");
			return;
		} 
		else {
			findElementsFromRoot(temp.left, d - 1);
			findElementsFromRoot(temp.right, d - 1);
		}
	}

	public static void main(String[] args) {

		Q863DistKTree tree1 = new Q863DistKTree();
		tree1.root = new Node(3);
		tree1.root.left = new Node(5);
		tree1.root.left.left = new Node(6);
		tree1.root.left.right = new Node(2);
		tree1.root.left.right.left = new Node(7);
		tree1.root.left.right.right = new Node(4);
		tree1.root.left.right.right.left = new Node(14);
		tree1.root.right = new Node(1);
		tree1.root.right.left = new Node(0);
		tree1.root.right.right = new Node(8);
//		System.out.println(tree1.findElement(tree1.root, 8, 1));
		tree1.findElementUtil(tree1.root, 5);
	}

}
