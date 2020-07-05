package leetQuestions;

public class Q474OnesAndZeroes {

	static int max = 0;
	static int[][] dp;

	public static void setArray(String[] strs) {
		dp = new int[strs.length + 1][2];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[i].length; j++) {
				dp[i][j] = -1;
			}
		}
	}

	public static int findMaxForm(String[] str, int m, int n, int idx, int count) {
		if (m < 0 || n < 0 || idx >= str.length) {
			return 0;
		}

		int p = 0, q = 0;
		if (dp[idx][0] != -1) {
			p = dp[idx][0];
			q = dp[idx][1];

		} else {
			for (int j = 0; j < str[idx].length(); j++) {
				if (str[idx].charAt(j) == '0') {
					p++;
				} else {
					q++;
				}
			}
			dp[idx][0] = p;
			dp[idx][1] = q;
		}
		if (m >= p && n >= q) {
			return findMaxForm(str, m - p, n - q, idx + 1, count + 1);
		} else
			return findMaxForm(str, m, n, idx + 1, count);
	}

	public static void main(String[] args) {
		String[] strs = new String[] { "10", "0001", "111001", "1", "0" };
		setArray(strs);
		for (int i = 0; i < strs.length; i++) {
			findMaxForm(strs, 4, 3, i, 0);
		}
		System.out.println(max);
	}

}
