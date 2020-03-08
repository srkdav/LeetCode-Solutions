package leetQuestions;

public class Q1299ReplaceElementsWithGreatest {

	public static void main(String[] args) {
		
		int [] a = new int[] {57010,40840,69871,14425,70605};
		int [] b = new int[a.length];
		for(int i=0;i<a.length-1;i++) {
			int max=a[i+1];
			for(int j=i+1;j<a.length;j++) {
				max = Math.max(max, a[j]);
			}
			b[i]=max;
		}
		//Try with better time complx
		for(int i=a.length-2;i>=0;i++) {
			
		}
		b[b.length-1]=-1;
		
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	}
}
