package leetQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class Q987VerticalOrder {

	Node root;

	Q987VerticalOrder() {
		root = null;
	}

	Q987VerticalOrder(int key) {
		root = new Node(key);
	}

	TreeMap<Integer, List<Integer>> hm = new TreeMap<Integer, List<Integer>>();

	public void traverseBST(Node temp, int val) {
		if (temp == null) {
			return;
		}
		traverseBST(temp.left, val - 1);
		if(hm.containsKey(val)){
			List<Integer> l = hm.get(val);
			l.add(temp.key);
			hm.put(val, l);
		}else{
			List<Integer> l = new ArrayList<Integer>();
			l.add(temp.key);
			hm.put(val, l);
		}
		traverseBST(temp.right, val + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q987VerticalOrder tree2 = new Q987VerticalOrder();
		tree2.root = new Node(1);
		tree2.root.left = new Node(2);
		tree2.root.right = new Node(3);
		tree2.root.left.left = new Node(4);
		tree2.root.left.right = new Node(5);
		tree2.root.right.left = new Node(6);
		tree2.root.right.right = new Node(7);
		tree2.traverseBST(tree2.root, 0);
		List<List<Integer>> l = new ArrayList<List<Integer>>();
		System.out.println(tree2.hm);
		
		for(List<Integer> h:tree2.hm.values()){
			Collections.sort(h);
			l.add(h);
		}
		System.out.println(l);
	}

}
