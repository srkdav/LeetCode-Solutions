package leetQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q368largestDivSubset {

	public static void largestDivisibleSubset(int[] a) {
		boolean dp[][] = new boolean[a.length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {

				if (a[i] % a[j] == 0 || a[j] % a[i] == 0) {
					dp[i][j] = true;
				}
			}
		}
		List<Integer> ans = new ArrayList<>();
		for (int row = 0; row < dp.length; row++) {
			for (int col = 0; col < dp[row].length; col++) {
				if (row != col && dp[row][col] == true) {
					ans.add(a[row]);
					ans.add(a[col]);
				}
			}
		}
		System.out.println(ans);
	}

	public static void largestDivisibleSubset1(int[] a) {
		int[] dp = new int[a.length];
		Arrays.fill(dp, 1);
		Arrays.sort(a);
		int max = 1;
		List<Integer> ans = new ArrayList<>();
		for (int i = 1; i < a.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (a[i] % a[j] == 0) {
					if (1 + dp[j] > dp[i]) {
						dp[i] = dp[j] + 1;
						if (dp[i] > max) {
							max = dp[i];
						}
					}
				}
			}
		}
		int prev=-1;
		for(int i=dp.length-1;i>=0;i--) {
			if(dp[i]!=max) {
				continue;
			}
			else if(dp[i]==max) {
				if(prev==-1) {
					prev=a[i];
					ans.add(a[i]);
					max--;
				}else {
					if(prev%a[i]==0) {
						prev=a[i];
						ans.add(a[i]);
						max--;
					}
				}
			}
		}
		System.out.println(ans);
		
	}

	public static void main(String[] args) {

		int a[] = new int[] { 546,669 };
		largestDivisibleSubset1(a);

	}

}
