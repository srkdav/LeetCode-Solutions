package leetQuestions;

import java.util.Arrays;

public class Q881Boats {
	public static void numRescueBoats(int[] a, int l) {

		Arrays.sort(a); // 1 2 2 3
		int start = 0;
		int end = a.length - 1;
		int count = 0;
		while (start <= end) {
			count++;
			int sum = a[start] + a[end];
			if (sum <= l) {
				start++;
			}
			end--;

		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		int a[] = new int[] { 1,2,2,3 };
		numRescueBoats(a, 3);
	}

}
