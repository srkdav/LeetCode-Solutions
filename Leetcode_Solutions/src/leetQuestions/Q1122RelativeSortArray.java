package leetQuestions;

public class Q1122RelativeSortArray {

	public static int[] swap(int b[],int n,int j) {
		int t=b[n];
		b[n]=b[j];
		b[j]=t;
		return b;
	}
	public static void main(String[] args) {
	
		int a[]= new int[] {2,1,4,3,9,6};
		int b[]=new int[] {2,3,1,3,2,4,6,27,9,2,19,99};
		int n=0;
		for(int i=0;i<a.length;i++) {
			for(int j=n;j<b.length;j++) {
				if(a[i]!=b[j]) {
					continue;
				}else {
					b=swap(b,n,j);
					n++;
				}
			}
		}
		for(int i=n;i<b.length;i++) {
			for(int j=n+1;j<b.length;j++) {
				 if (b[j-1] > b[j]) {
					 int temp = b[j]; 
	                    b[j] = b[j-1]; 
	                    b[j-1] = temp; 
				 }
			}
		}
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	
	
	}

}
