package leetQuestions;

public class Q416PartitionEqualSubSetSum {

	public static void canPartition(int[] a) {
		int sum = 0;
		for (int A : a) {
			sum = sum + A;
		}
		sum = sum / 2;
		boolean dp[][] = new boolean[a.length + 1][sum + 1];
		for (int col = 1; col < dp[0].length; col++) {
			dp[0][col] = false;
		}
		for (int row = 0; row < dp.length; row++) {
			dp[row][0] = true;
		}
		for (int row = 1; row < dp.length; row++) {
			for (int col = 1; col < dp[0].length; col++) {
				int i = row - 1;
				if (a[i] > col) {
//					if(dp[row-1])
					dp[row][col] = false;
				} else if (a[i] == col) {
					dp[row][col] = true;
				} else {
					if(dp[row-1][col]==true || dp[row-1][col-a[i]]==true) {
						dp[row][col]=true;
					}else {
						dp[row][col]=false;
					}
				}
			}
		}
		System.out.println(dp[dp.length-1][dp[0].length-1]);
	}

	public static void main(String[] args) {
		int a[] = new int[] { 1, 5, 11, 5 };
		canPartition(a);
	}

}

//for (int i = 1; i < a.length; i++) {
//	int row = i, col = 1;
//	if (a[i-1] > col) {
//		dp[row][col] = false;
//	} else if (a[i-1] == col) {
//		dp[row][col] = true;
//	} else {
//		if (dp[row - 1][col] == true) {
//			dp[row][col] = true;
//		} else if (dp[row - 1][col - a[i-1]] == true) {
//			dp[row][col] = true;
//		} else {
//			dp[row][col] = false;
//		}
//	}
//}
