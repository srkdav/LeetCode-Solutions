package leetQuestions;

import java.util.Arrays;
import java.util.HashMap;

public class Q923_3SumMult {

	public static void find3Sum(int a[], int t) {
		Arrays.sort(a);

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			int start = i + 1;
			int end = a.length - 1;
			while (start < end) {
				if (start < end && a[start] + a[end] + a[i] < t) {
					start++;
				} else if (start < end && a[i] + a[start] + a[end] > t) {
					end--;
				} else if (start < end && a[i] + a[start] + a[end] == t) {
					System.out.println(a[i] + " " + a[start] + " " + a[end]);
					count++;
					start++;
				}
			}
		}
		System.out.println(count);
	}

	public static void find3Sum1(int a[], int t) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			if (!hm.containsKey(a[i])) {
				hm.put(a[i], 1);
			} else {
				int c = hm.get(a[i]);
				c++;
				hm.put(a[i], c);
			}
		}
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			while (a[i] == a[i + 1]) {
				i++;
			}
			int start = i + 1;
			int end = a.length - 1;
			while (start < end) {
				while (start<a.length-1 && a[start] == a[start + 1]) {
					start++;
				}
				while (end>0 && a[end] == a[end - 1]) {
					end--;
				}
				if (start < end && a[start] + a[end] + a[i] < t) {
					start++;
				} else if (start < end && a[i] + a[start] + a[end] > t) {
					end--;
				} else if (start < end && a[i] + a[start] + a[end] == t) {
					System.out.println(a[i] + " " + a[start] + " " + a[end]);
					count = count + (hm.get(a[start]) * hm.get(a[i]) * hm.get(a[end]));
					start++;
				}
			}
		}
		System.out.println(count);

	}

	public static void main(String[] args) {

		int a[] = new int[] { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
		find3Sum1(a, 8);
	}

}
