package leetQuestions;

import java.util.Arrays;

public class Q163SumClosest {

	public static void threeSumclosest(int a[], int t) {
		Arrays.sort(a);
		int ans = 0;
		int diff = Integer.MAX_VALUE;
		for (int i = 0; i < a.length - 2; i++) {
			int start = i + 1, end = a.length - 1;
			while (start < end) {
				int sum = a[i] + a[start] + a[end];
				if (sum > t) {
					end--;
				} else {
					start++;
				}
				if (Math.abs(sum - t) < diff) {
					diff = Math.abs(sum - t);
					ans = sum;
				}
			}
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {

		int a[] = new int[] { 1,1,-1,-1,3 };
		threeSumclosest(a, 3);
	}

}
