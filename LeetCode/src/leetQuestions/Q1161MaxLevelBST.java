package leetQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class Q1161MaxLevelBST {

	Node root;
	
	Q1161MaxLevelBST(){
		root = null;
	}
	
	Q1161MaxLevelBST(int key){
		root = new Node(key);
	}
	
	int maxSum=0;
	int maxLevel=0;
	public void getLevelSum(Node root){
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		System.out.println(root.key+" ");
		int sum=0;
		int level=1;
		sum=root.key;
		level++;
		q.add(null);
		if(sum>maxSum){
			maxSum=sum;
			maxLevel=level;
		}
		while(!q.isEmpty()){
			if(q.peek()!=null){
				Node curr = q.poll();
				if(curr.left!=null){
					q.add(curr.left);
					sum=sum+curr.left.key;
					System.out.print(curr.left.key+" ");
				}
				if(curr.right!=null){
					q.add(curr.right);
					sum=sum+curr.right.key;
					System.out.print(curr.right.key+" ");
				}
			}else{
				q.poll();
				System.out.println();
				if(sum>maxSum){
					maxSum=sum;
					maxLevel=level;
				}
				sum=0;
				level++;
				q.add(null);
			}
			if(q.peek()==null && q.size()==1){
				System.out.println(maxSum+" "+maxLevel);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Q1161MaxLevelBST tree1 = new Q1161MaxLevelBST();
		tree1.root = new Node(1);
		tree1.root.left = new Node(2);
		tree1.root.right = new Node(3);
		tree1.root.left.left = new Node(4);
		tree1.root.left.right = new Node(5);
		tree1.root.right.left = new Node(6);
		tree1.root.right.right = new Node(7);
		tree1.getLevelSum(tree1.root);

	}

}
