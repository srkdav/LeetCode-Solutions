package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q47Permutation2 {

	public static void swap(int a[], int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	public static void print(int a[]) {
		for (int p = 0; p < a.length; p++) {
			System.out.print(a[p] + " ");
		}
		System.out.println();
	}

	public static void permutation(int a[], int l, int r) {
		if (l == r) {
			print(a);
		} else {
			for (int i = l; i <= r; i++) {
				swap(a, l, i);
				permutation(a, l + 1, r);
				
				swap(a, l, i);
			}
		}
	}

	public static void main(String[] args) {

		int a[] = new int[] { 1, 2, 3 };
		permutation(a,0,a.length-1);

	}

}
