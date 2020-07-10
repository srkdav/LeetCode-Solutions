package leetQuestions;

public class Q931MinFallPath {

	static int min=100;
	public static int findPath(int a[][], int row, int col,int sum) {
		if (row < 0 || row >= a.length || col < 0 || col >= a[row].length) {
			return 0;
		} 
		if(row==a.length-1){
			if(sum+a[row][col]<min){
				min=sum+a[row][col];
			}
			return sum+a[row][col];
		}
		else {
			sum=sum+a[row][col];
			int x=findPath(a, row + 1, col-1,sum);
			int y=findPath(a, row + 1, col,sum);
			int z=findPath(a, row+1, col+1,sum);
			return x+y+z;
		}
	}

	static int[][] dp = new int[3][3];
	public static void findPath2(int [][]a){
		for(int col=0;col<a.length;col++){
			dp[0][col]=a[0][col];
		}
		for(int row=1;row<a.length;row++){
			for(int col=0;col<a[row].length;col++){
				if(col==0){
					dp[row][col]=a[row][col]+ Math.min(dp[row-1][col], dp[row-1][col+1]);
				}else if(col==a.length-1){
					dp[row][col]=a[row][col]+ Math.min(dp[row-1][col],dp[row-1][col-1]);
				}else{
					dp[row][col]=a[row][col]+ Math.min(dp[row-1][col],Math.min(dp[row-1][col-1], dp[row-1][col+1]));
				}
			}
		}
		
		int min=1000;
		for(int col=0;col<dp.length;col++){
			if(dp[a.length-1][col]<min){
				min=dp[a.length-1][col];
			}
		}
		System.out.println(min);
	}
	public static void main(String[] args) {
		int[][] a = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int sum=Integer.MAX_VALUE;
//		findPath(a, 0, 0);
//		for(int col=0;col<a[0].length;col++){
//			findPath(a, 0, col,0);
//		}
		findPath2(a);
	}

}
