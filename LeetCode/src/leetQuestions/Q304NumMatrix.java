package leetQuestions;

public class Q304NumMatrix {

	public static void main(String[] args) {

		int [][] a = new int[][]{{3, 0, 1, 4, 2},{5, 6, 3, 2, 1},{1, 2, 0, 1, 5},{4, 1, 0, 1, 7},{1, 0, 3, 0, 5	}};
//		int[][]a = new int[][]{{1},{7}};
		int [][]dp= new int[a.length+1][a[0].length+1];
		int sum=0;
		for(int col=1;col<dp[0].length;col++){
			int row=1;
			sum=sum+a[0][col-1];
			dp[row][col]=sum;
		}
		sum=0;
		for(int row=1;row<dp.length;row++){
			int col=1;
			sum=sum+a[row-1][0];
			dp[row][col]=sum;
		}
		
		
		for(int row=1;row<dp.length;row++){
			for(int col=1;col<dp[row].length;col++){
				dp[row][col] = a[row-1][col-1]+dp[row][col-1]+dp[row-1][col]-dp[row-1][col-1];
			}
		}
		
		for(int row=0;row<dp.length;row++){
			for(int col=0;col<dp[0].length;col++){
				System.out.print(dp[row][col]+" ");
			}
			System.out.println();
		}
		int row1=2, col1=1, row2=4,col2=3;
		System.out.println(dp[row2+1][col2+1]-dp[row2+1][col1]-dp[row1][col2+1]+dp[row1][col1]);
 
	}

}
