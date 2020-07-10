package leetQuestions;

public class Q985SumofEvenNumbersAfterQueries {

	public static void main(String[] args) {

		int a[]=new int[] {1,2,3,4};
		int b[][]= new int[][] {{1,0},{-3,1},{-4,0},{2,3}};
		int c[]=new int[a.length];
		int k=0;
		int sum1=0;
		for(int p=0;p<a.length;p++) {
			if(a[p]%2==0) {
			sum1=sum1+a[p];
			}
		}
		for(int row=0;row<b.length;row++) {
			int sum=0;
			int i=b[row][1];
			int val=b[row][0];
			boolean flag=false;
			if(a[i]%2!=0) {
				flag=true;
			}
			int temp=a[i];
			a[i]=a[i]+val;
			if(a[i]%2==0) {
				if(flag==true) {
					sum1=sum1+a[i];
				}else {
					sum1=sum1+a[i]-temp;
				}
			}
			if(a[i]%2!=0) {
				if(flag==false) {
					sum1=sum1-temp;
				}
			}
			
			c[k]=sum1;
			k++;
		}
		for(int j=0;j<c.length;j++) {
			System.out.println(c[j]);
		}
	}

}
