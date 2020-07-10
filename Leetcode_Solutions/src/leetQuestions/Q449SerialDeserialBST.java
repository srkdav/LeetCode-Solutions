package leetQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q449SerialDeserialBST {

	Node root;

	static Node ans;
	Q449SerialDeserialBST() {
		root = null;
	}

	Q449SerialDeserialBST(int key) {
		root = new Node(key);
	}

	public static String serialize(Node root) {
		StringBuilder sb = new StringBuilder();
		serializeHelper(root, sb);
		return sb.toString();
	}

	public static void serializeHelper(Node root,StringBuilder sb) {
		if(root==null) {
			return;
		}
		sb.append(root.key).append(",");
		serializeHelper(root.left, sb);
		serializeHelper(root.right, sb);
	}
	
	public static void deserialize(String str) {
	
//		List<Integer> values = new ArrayList<>();
		List<String> values1 = Arrays.asList(str.split(","));
//		Arrays.asList(str.split(","));
		deserializeHelper(values1);
		
	}
	public static void deserializeHelper(List<String> a) {
		Node root = new Node(Integer.parseInt(a.get(0)));
		for(int i=1;i<a.size();i++) {
			treeConstructHelper(root, new Node(Integer.parseInt(a.get(i))));
		}
	}
	
	public static void treeConstructHelper(Node root,Node node) {
		if(root==null) {
			return;
		}
		if(root.key>node.key) {
			if(root.left==null) {
				root.left=node;
			}else {
				treeConstructHelper(root.left, node);
			}
		}
		if(root.key<node.key) {
			if(root.right==null) {
				root.right=node;
			}else {
				treeConstructHelper(root.right, node);
			}
		}
	}
	
	public static void main(String[] args) {
		Q449SerialDeserialBST tree = new Q449SerialDeserialBST();
		tree.root = new Node(5);
		tree.root.left = new Node(2);
		tree.root.right = new Node(7);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(8);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(3);
		tree.root.left.right.right = new Node(4);
//		System.out.println(serialize(tree.root));
		deserialize("5,2,1,3,4,7,6,8,");
		System.out.println(ans);
	}

}
