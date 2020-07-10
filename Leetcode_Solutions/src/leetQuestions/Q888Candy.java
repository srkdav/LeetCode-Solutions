package leetQuestions;

public class Q888Candy {

	public static void main(String[] args) {
	
		int a[] = new int[] {1,2,5};
		int b[] = new int[] {2,4};
		int sum1=0;
		int sum2=0;
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
		for(int i=0;i<b.length;i++) {
			sum2=sum2+b[i];
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(sum1-a[i]+b[j]==sum2-b[j]+a[i]) {
					System.out.print(a[i]+" "+b[j]);
					break;
				}
			}
		}
	}

}
