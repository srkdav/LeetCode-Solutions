package leetQuestions;

public class Day30LCChallenge {

	Node root;

	Day30LCChallenge() {
		root = null;
	}

	Day30LCChallenge(int key) {
		root = new Node(key);
	}

	boolean flag;
	public void searchDFS(Node temp, int a[], int i) {
		if (temp == null) {
			return;
		}
		if (i<a.length && temp.key == a[i]) {
			i++;
		}else{
			i--;
			return;
		}
		if(temp.left==null && temp.right==null){
			if(temp.key==a[a.length-1]){
				flag=true;
			}else{
				return;
			}
		}
		searchDFS(temp.left, a, i);
		searchDFS(temp.right, a, i);
	}

	public static void main(String[] args) {

		int a[] = new int[] { 0,1,4};
		Day30LCChallenge tree1 = new Day30LCChallenge();
		tree1.root = new Node(0);
		tree1.root.left = new Node(1);
		tree1.root.right = new Node(2);
		tree1.root.left.left = new Node(3);
		tree1.root.left.right = new Node(4);
		tree1.root.left.right.left = new Node(7);
		tree1.root.left.right.right = new Node(8);
		tree1.root.right.left = new Node(5);
		tree1.root.left.left.right = new Node(6);
		tree1.searchDFS(tree1.root, a, 0);
		System.out.println(tree1.flag);
	}

}
