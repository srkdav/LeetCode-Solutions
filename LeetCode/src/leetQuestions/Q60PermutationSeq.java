package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q60PermutationSeq {
	// static int k;
	static List<Integer> list = new ArrayList<Integer>();

	public static void permutateUtil(int a[],int k) {
		if (list.size() == 3) {
			System.out.println(list);
			return;
		}
		for (int i = k; i < a.length; i++) {
			list.add(a[i]);
			permutateUtil(a, k+1);
			list.remove(list.size() - 1);
		}
	}

	public static void permutateSeq(int a[], int k) {
		for(int j=0;j<a.length;j++){
			permutateUtil(a,j);
		}
	}

	public static void main(String[] args) {

		// String str = "1234";
		int a[] = new int[] { 1, 2, 3 };
		permutateSeq(a, 0);

	}

}
