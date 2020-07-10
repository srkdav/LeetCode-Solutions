package leetQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q102LevelTree {
	Node root;
	
	Q102LevelTree(){
		root= null;
	}
	
	Q102LevelTree(int key){
		root=new Node(key);
	}

	Queue<Node> q = new LinkedList<Node>();
	List<List<Integer>> list = new ArrayList<List<Integer>>();
	public void levelOrderTraversal(Node temp) {
		List<Integer> list1 = new ArrayList<Integer>();
		q.add(temp);
		q.add(null);
		while(!q.isEmpty() || temp!=null) {
			Node curr=q.peek();
			if(curr!=null) {
				curr=q.peek();
				q.poll();
				list1.add(curr.key);
				if(curr.left!=null) {
					q.add(curr.left);
				}
				if(curr.right!=null) {
					q.add(curr.right);
				}	
			}else {
				list.add(list1);
				q.poll();
				q.add(null);
				list1 = new ArrayList<Integer>();
				
			}if( q.size()==1 && q.peek()==null) {
				list.add(list1);
				break;
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q102LevelTree tree1 = new Q102LevelTree();
		tree1.root = new Node(1);
//		tree1.root.left = new Node(2);
//		tree1.root.left.left = new Node(4);
//		tree1.root.left.right = new Node(5);
//		tree1.root.right = new Node(3);
		tree1.levelOrderTraversal(tree1.root);
		for(List<Integer> l:tree1.list) {
			System.out.println(l);
		}
	}

}
