package leetQuestions;

public class Q807MaxIncreasetoKeepCitySkyline {

	public static void main(String[] args) {

		int[][] a = new int[][] { { 3, 0, 8, 4 }, { 2, 4, 5, 7 }, { 9, 2, 6, 3 }, { 0, 3, 1, 0 } };

		int[] maxr=new int[a.length];
		int[] maxc=new int[a[0].length];
		int i=0;
		for (int row = 0; row < a.length; row++) {
			int max=0;
			for (int col = 0; col < a[row].length; col++) {
				if(a[row][col]>max) {
					max=a[row][col];
				}
			}
			maxr[i]=max;
			i++;
		}
		int j=0;
		for(int col=0;col<a.length;col++) {
			int max=0;
			for(int row=0;row<a.length;row++) {
				if(a[row][col]>max) {
					max=a[row][col];
				}
			}
			maxc[j]=max;
			j++;
		}
		int sum=0;
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
				int k=Math.min(maxc[col], maxr[row]);
				sum=sum+Math.abs(k-a[row][col]);
			}
		}
		System.out.println(sum);
	}

}
