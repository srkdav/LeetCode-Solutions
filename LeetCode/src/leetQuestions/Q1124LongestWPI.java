package leetQuestions;

public class Q1124LongestWPI {

	public static void findWPI(int a[]) {
		int i=0;
		int count=0;
		int t=0;
		int nt=0;
		while(i<a.length) {
			if(a[i]>8) {
				t++;
			}
			else if(a[i]<=8) {
				nt++;
			}
			if(t>nt) {
				count=Math.max(count, t+nt);
			}else if(t<=nt) {
				t=0;
				nt=1;
			}
			i++;
		}
		System.out.println(t);
	}
	public static void main(String[] args) {
		int a[]=new int[] {6,6,9};
		findWPI(a);
	}

}
