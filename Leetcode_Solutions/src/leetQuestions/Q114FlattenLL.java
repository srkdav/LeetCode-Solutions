package leetQuestions;

public class Q114FlattenLL {

	
	public void flatten(Node root) {
		if (root == null) {
			return;
		}
		System.out.println(root.key);
		flatten(root.left);
		flatten(root.right);
		
	}

	public static void main(String[] args) {

	}

}
