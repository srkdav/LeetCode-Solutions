package leetQuestions;

public class Q1052GrumpyOwner {
	public static void findMax(int c[], int g[],int x) {

		int count=0;
		for(int i=0;i<g.length;i++) {
			if(g[i]==0) {
				count=count+c[i];
			}
		}
		int k=1;
		int ans=0;
		int max=0;
		for(int i=0;i<g.length;i++) {
			int j=i;
			k=0;
			ans=0;
			while(k<x && j<g.length) {
				if(g[j]==1) {
					ans=ans+c[j];
				}
				k++;
				j++;
			}
			count=count+ans;
			max=Math.max(max, count);
			count=count-ans;
		}
		System.out.println(max);
	}

	public static void main(String[] args) {

		int c[] = new int[] {1,0,1,2,1,1,7,5};
		int g[]= new int[] {0,1,0,1,0,1,0,1};
		int X=3;
		findMax(c, g, X);
	}

}
