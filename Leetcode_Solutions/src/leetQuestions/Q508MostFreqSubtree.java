package leetQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

//to do
public class Q508MostFreqSubtree {

	Node root;

	Q508MostFreqSubtree() {
		root = null;
	}

	Q508MostFreqSubtree(int key) {
		root = new Node(key);
	}

	List<Integer> list = new ArrayList<Integer>();
	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

	int sumOfSubTree(Node temp, int sum) {
		if (temp == null) {
			return 0;
		}
		int l = sumOfSubTree(temp.left, sum);
		int r = sumOfSubTree(temp.right, sum);
		if (temp != null) {
			sum = sum + temp.key;
		}
		return sum + l + r;
	}

	void inOrder(Node temp) {
		if (temp == null) {
			return;
		}
		inOrder(temp.left);
		int sum = 0;
		sum=sumOfSubTree(temp, sum);
		inOrder(temp.right);
		if(!hm.containsKey(sum)) {
			hm.put(sum, 0);
		}else {
			int c=hm.get(sum);
			c++;
			hm.replace(sum, c);
		}
	}
	
	void getFinalArray(Node temp) {
		inOrder(temp);
		System.out.println(hm);
		int max=-1;
		HashMap<Integer,Integer> hm1= new HashMap<Integer,Integer>();
		for(Entry<Integer, Integer> h:hm.entrySet()) {
//			System.out.println(h.getValue());
			if(h.getValue()>max) {
				max=h.getValue();
			}
			if(h.getValue()==max) {
				hm1.put(h.getKey(), h.getValue());
			}
		}
		System.out.println(hm1);
		if(max==0) {
			int a[]=new int[hm.size()];
			int i=0;
			for(Entry<Integer, Integer> h:hm.entrySet()) {
				a[i]=h.getKey();
				i++;
			}
		}
	}

	public static void main(String[] args) {
		Q508MostFreqSubtree tree1 = new Q508MostFreqSubtree();
		tree1.root = new Node(5);
		tree1.root.left = new Node(2);
		tree1.root.right = new Node(-3);
		tree1.getFinalArray(tree1.root);
	}

}
