package leetQuestions;

public class Q516LongestPalinSS {

	static int t[][];

	public static int longestPalindromeSubSeq(String s, int low, int high) {
		if (low == high) {
			return 1;
		}
		if (low > high) {
			return 0;
		}
		if (s.charAt(low) == s.charAt(high)) {
			return 2 + longestPalindromeSubSeq(s, low + 1, high - 1);
		} else {
			return Math.max(longestPalindromeSubSeq(s, low + 1, high), longestPalindromeSubSeq(s, low, high - 1));
		}
	}

	public static void setArray(String a) {
		t = new int[a.length()][a.length()];
		for(int row=0;row<t.length;row++) {
			for(int col=0;col<t[row].length;col++){
				t[row][col]=-1;
			}
		}
	}

	public static int longestPalindromeSubSeq1(String str, int low, int high) {
		if (low == high) {
			t[low][high]=1;
			return 1;
		}
		if (low > high) {
			t[low][high]=0;
			return 0;
		}
		if (t[low][high] != -1) {
			return t[low][high];
		}
		if (str.charAt(low) == str.charAt(high)) {
			return t[low][high] = 2 + longestPalindromeSubSeq1(str, low + 1, high - 1);
		} else {
			return t[low][high] = Math.max(longestPalindromeSubSeq1(str, low + 1, high),
					longestPalindromeSubSeq1(str, low, high - 1));
		}
	}

	public static void main(String[] args) {
		String str = "bbbab";
		setArray(str);
		System.out.println(longestPalindromeSubSeq1(str, 0, str.length() - 1));
	}

}
