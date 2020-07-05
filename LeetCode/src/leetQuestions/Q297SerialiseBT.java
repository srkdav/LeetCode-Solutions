package leetQuestions;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Q297SerialiseBT {

	Node root;

	Q297SerialiseBT() {
		root = null;
	}

	Q297SerialiseBT(int key) {
		root = new Node(key);
	}

	
	public static void serialize(Node root) {
		StringBuilder sb = new StringBuilder();
		serializeHelper(root, sb);
		System.out.println(sb.toString());
	}
	
	public static void serializeHelper(Node root, StringBuilder sb) {
		if(root==null) {
			sb.append("null").append(",");
			return;
		}
		sb.append(root.key).append(",");	
		serializeHelper(root.left, sb);
		serializeHelper(root.right, sb);
	}
	
	static Node ans;
	public static void deserialize(String str) {
		Deque<String> values = new LinkedList<String>();
		values.addAll(Arrays.asList(str.split(",")));
		ans=deserializeHelper(values);
	}
	
	public static Node deserializeHelper(Deque<String> values) {
		String val = values.remove();
		if(val.equals("null"))
			return null;
		else {
			Node node = new Node(Integer.parseInt(val));
			node.left=deserializeHelper(values);
			node.right=deserializeHelper(values);
			return node;
		}
	}
	public static void main(String[] args) {
		Q297SerialiseBT tree1= new Q297SerialiseBT();
		tree1.root = new Node(1);
		tree1.root.left = new Node(2);
		tree1.root.right = new Node(3);
		tree1.root.right.left = new Node(4);
		tree1.root.right.right = new Node(5);
//		serialize(tree1.root);
		deserialize("1,2,null,null,3,4,null,null,5,null,null,");
		System.out.println(ans);
	}

}
