package leetQuestions;

public class Q565ArrayNesting {

	public static void arrayNesting(int a[]) {
		int count=0;
		int max=0;
		for(int i=0;i<a.length;i++) {
			count=0;
			while(i<a.length && a[i]!=-1) {
				int k=a[i];
				a[i]=-1;
				i=k;
				count++;
			}
			max=Math.max(max, count);
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		int a[]=new int[] {1,2,0,4,5,6,3};
		arrayNesting(a);
	}

}
