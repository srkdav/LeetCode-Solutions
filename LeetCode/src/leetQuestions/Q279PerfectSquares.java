package leetQuestions;

public class Q279PerfectSquares {
	static int ans = Integer.MAX_VALUE;

	public static void findCount1(int n) {
		if (n <= 3) {
			return;
		}
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 3;
		for (int i = 4; i <= n; i++) {
			dp[i] = i;
			for (int j = 1; j * j <= i; j++) {
				dp[i] = Math.min(dp[i], 1 + dp[i - j * j]);
			}
		}
		System.out.println(dp[n]);
	}

	public static int findCount(int n) {
		if (n <= 3) {
			return n;
		}
		for (int i = 1; i * i <= n; i++) {
			ans = Math.min(ans, 1 + findCount(n - i * i));
		}
		return ans;
	}

	public static void main(String[] args) {
//		System.out.println(findCount1(4));
		findCount1(12);
	}
}
