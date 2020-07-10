package leetQuestions;

public class Q116NextPointer {

	class Node{
		int key;
		Node left;
		Node right;
		Node next;
		
		Node(){
			
		}
		Node(int key){
			this.key=key;
			left=null;
			right=null;next=null;
		}
		Node(int k,Node l,Node r,Node n){
			key=k;
			left=l;
			right=r;
			next=n;
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
