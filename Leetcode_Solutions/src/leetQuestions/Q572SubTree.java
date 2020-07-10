package leetQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q572SubTree {
	Node root;

	Q572SubTree() {
		root = null;
	}

	Q572SubTree(int key) {
		root = new Node(key);
	}

	Node curr = null;
	List<Integer> list1 = new ArrayList<Integer>();

	public Node nodeOfT(Node temp, int val) {
		if (temp == null) {
			return null;
		}
		if (temp.key == val) {
			curr = temp;
			return curr;
		}
		Node l = nodeOfT(temp.left, val);
		Node r = nodeOfT(temp.right, val);
		if (r != null || l != null) {
			return curr;
		} else {
			return null;
		}
	}

	List<Integer> list2 = new ArrayList<Integer>();
	public void inOrderTravere(Node temp2) {
		if(temp2==null) {
			return;
		}
		inOrderTravere(temp2.left);
		list2.add(temp2.key);
		inOrderTravere(temp2.right);
	}
	public void findNodes(Node temp, Node temp2) {

		Node temp1 = nodeOfT(temp, temp2.key);
		boolean ans=isSubtree(temp1, temp2);
		boolean fans=true;
		if(ans==false) {
			inOrderTravere(temp2);
			for(Integer l:list1) {
				if(!list2.contains(l)) {
					fans=false;
				}
			}
			if(fans==true) {
				if(list1.size()<list2.size()) {
					fans=false;
				}
			}
		}
		System.out.println("final is : "+fans);

	}

	public boolean isSubtree(Node temp1, Node temp2) {
		if (temp1 != null) {
			list1.add(temp1.key);
		}
		if (temp1 == null || temp2 == null) {
			if (temp1 != null && temp2 == null) {
				return false;
			}
			if (temp1 == null && temp2 != null) {
				return false;
			}
		}
		if (temp1 == null && temp2 == null) {
			return true;
		}

		if (temp1.key != temp2.key) {
			return false;
		}
		boolean l = isSubtree(temp1.left, temp2.left);
		boolean r = isSubtree(temp1.right, temp2.right);
		return l && r;
	}

	public static void main(String[] args) {
		Q572SubTree tree = new Q572SubTree();
		tree.root = new Node(1);
		tree.root.left = new Node(1);
//		tree.root.right = new Node(5);
//		tree.root.left.left = new Node(1);
//		tree.root.left.left.left = new Node(0);
//		tree.root.left.left.right = new Node(9);
//		tree.root.left.right = new Node(2);
//		tree.root.left.right.left = new Node(0);

		Q572SubTree tree1 = new Q572SubTree();
		tree1.root = new Node(1);
//		tree1.root.left = new Node(1);
//		tree1.root.right = new Node(2);
//		tree1.root.right.left = new Node(6);

		tree.findNodes(tree.root, tree1.root);

	}

}
