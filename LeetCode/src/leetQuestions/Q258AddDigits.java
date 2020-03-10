package leetQuestions;

public class Q258AddDigits {

	public static void main(String[] args) {
	
		int[] a=new int[] {9,2,2,8};
		int sum=0;
		int sum2=0;
		for(int i=0;i<a.length-1;i++) {
			if(sum2>0) {
				sum2=a[i+1]+sum2;
			}
			else {
			sum2=a[i]+a[i+1];
			}
			if(sum2>=10) {
				int r=sum2%10;
				int q=sum2/10;
				sum2=q+r;
			}
		}
		System.out.println(sum2);
		
	}

}
