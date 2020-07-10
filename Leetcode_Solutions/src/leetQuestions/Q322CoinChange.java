package leetQuestions;

import java.util.HashMap;
import java.util.Map;

public class Q322CoinChange {

	static Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
	public static int coinChange(int a[], int amount) {
		if (amount == 0) {
			return 0;
		}
		if(hm.containsKey(amount)) {
			return hm.get(amount);
		}
		int n = amount + 1;
		for (int i = 0; i < a.length; i++) {
			int curr = 0;
			if (amount >= a[i]) {
				int next = coinChange(a, amount - a[i]);
				if (next >= 0) {
					curr = curr + next;
				}
			}
			if (curr > 0) {
				n = Math.min(n, curr);
			}
		}
		int finalCount = (n == amount + 1) ? -1 : n;
		hm.put(amount, finalCount);
		return finalCount;
	}

	public static int coinChange1(int a[],int w) {
		int dp[][]=new int[a.length+1][w+1];
		for(int col=0;col<dp[0].length;col++) {
			dp[0][col]=Integer.MAX_VALUE-1;
		}
		for(int col=1;col<dp[0].length;col++) {
			if(col%a[0]==0) {
				dp[1][col] =col/a[0];
			}else {
				dp[1][col]=Integer.MAX_VALUE-1;
			}
		}
		for(int row=2;row<dp.length;row++) {
			for(int col=1;col<dp[row].length;col++) {
				if(a[row-1]<=col) {
					dp[row][col]=Math.min(1+dp[row][col-a[row-1]], dp[row-1][col]);
				}else {
					dp[row][col]=dp[row-1][col];
				}
			}
		}
		return dp[a.length][w];
	}
	public static void main(String[] args) {
		int a[] = new int[] { 2};
		System.out.println(coinChange1(a, 3));

	}

}
