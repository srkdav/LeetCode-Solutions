package leetQuestions;

public class Q1281Subtract {

	public static void main(String[] args) {
		int number=234;
		int prod=1,sum=0,n=1,x=0;
		//int length = (int) (Math.log10(number) + 1);
		int i=1;
		while(number!=0) {
			n=number%(10*i);
			number=number/10;
			sum=sum+n;
			prod=prod*n;
			//System.out.println(n);
		}
		System.out.println(prod);
	}
}
