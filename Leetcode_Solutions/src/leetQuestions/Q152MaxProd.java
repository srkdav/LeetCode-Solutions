package leetQuestions;

public class Q152MaxProd {

	public static void findMax(int a[]) {
		int dp[][]=new int[a.length][a.length];
		int max=Integer.MIN_VALUE;
		for(int row=0;row<dp.length;row++) {
			for(int col=row;col<dp[row].length;col++) {
				if(row==col) {
					dp[row][col]=a[row];
					max=Math.max(max, dp[row][col]);
				}else {
					dp[row][col]=dp[row][col-1] * a[col];
					max=Math.max(max, dp[row][col]);
				}
			}
		}
		System.out.println(max);
	}
	
	public static void findMax2(int a[]) {
		int max=a[0];
		int min=a[0];
		int result=a[0];
		for(int i=1;i<a.length;i++) {
			int temp=max;
			max=Math.max(Math.max(max*a[i], min*a[i]),a[i]);
			min = Math.min(Math.min(temp*a[i], min*a[i]), a[i]);
			result=Math.max(result, max);
		}
		System.out.println(result);
	}
	public static void main(String[] args) {

		int a[]=new int[] {2,3,-2,4};
		findMax2(a);
	}

}
