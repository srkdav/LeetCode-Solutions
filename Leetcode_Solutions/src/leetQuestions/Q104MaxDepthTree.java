package leetQuestions;

import java.util.Stack;

public class Q104MaxDepthTree {

	Node root;

	Q104MaxDepthTree() {
		root = null;
	}

	Q104MaxDepthTree(int key) {
		root = new Node(key);
	}

	public int leafRootDistance(Node temp) {
		Stack<Node> st1 = new Stack<Node>();
		Stack<Integer> st2 = new Stack<Integer>();
		int max = 0;
		int depth = 1;
		Node curr = temp;
		while (curr != null || st1.size() > 0) {
			if (curr != null) {
				st1.push(curr);
				st2.push(depth);
				curr = curr.left;
				depth++;
			} else {
				curr = st1.pop();
				depth = st2.pop();
				if (depth > max) {
					max = depth;
				}
				curr=curr.right;
				depth++;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Q104MaxDepthTree tree5 = new Q104MaxDepthTree();
		tree5.root = new Node(1);
		tree5.root.left = new Node(2);
		tree5.root.right = new Node(3);
		tree5.root.left.left = new Node(4);
		tree5.root.left.right = new Node(5);
//		tree5.root.left.right.left = new Node(6);
//		tree5.maxDepth(tree5.root);
//		System.out.println(tree5.max);
		System.out.println(tree5.leafRootDistance(tree5.root));
	}

}

//******************************************************
//Solution2 - Recursive.

//if(temp==null) {
//	return 0;
//}
//int l = leafRootDistance(temp.left);
//int r= leafRootDistance(temp.right);
//
//int m = Math.max(l, r)+1;
//return m;

//***********************************************************
// Solution1 - Needs improvement.
//Stack<Node> st = new Stack<Node>();
//int max=0;
//public void maxDepth(Node temp) {
//	if(temp==null) {
//		return;
//	}
//	
//	st.add(temp);
//	if(temp.left==null && temp.right==null) {
//		if(st.size()>max) {
//			max=st.size();
//		}
//		Node t = st.peek();
//		while(t==temp && st.size()>0) {
//			t= st.pop();
//			t=st.peek();
//		}
//	}
//	maxDepth(temp.left);
//	maxDepth(temp.right);
//	if (!st.isEmpty()) {
//		if (temp == st.peek()) {
//			st.pop();
//		}
//	}
//}
