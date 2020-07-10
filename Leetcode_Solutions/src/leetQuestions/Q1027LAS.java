package leetQuestions;

public class Q1027LAS {

	public static void longestArithSeqLength(int a[], int idx, int prev, int diff, int count) {
		if (idx >= a.length) {
			return;
		} else {
			if (count == 0) {
				count++;
				longestArithSeqLength(a, idx + 1, a[idx], -1, count);
			} else {
				if (diff == -1) {
					if (a[idx] > prev) {
						count++;
						longestArithSeqLength(a, idx + 1, a[idx], a[idx] - prev, count);
					}else {
						longestArithSeqLength(a, idx + 1,prev, -1, count);
								
					}
				} else {
					if (a[idx] - prev == diff) {
						count++;
						longestArithSeqLength(a, idx + 1, a[idx], diff, count);
					}
				}
			}
		}
	}

	public static void main(String[] args) {

		int a[] = new int[] { 9, 4, 7, 2, 10 };
		longestArithSeqLength(a, 0, 0, 0, 0);
	}

}
