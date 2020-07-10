package leetQuestions;

public class Q27RemoveElement {

	public static void main(String[] args) {
	
		int[] a =new int[] {3,2,2,3};
		int n=3;
			int count=0;
			for(int i=0;i<a.length;i++) {
				if(a[i]!=n) {
					count++;
				}
			}
			System.out.println(count);
	}

}
