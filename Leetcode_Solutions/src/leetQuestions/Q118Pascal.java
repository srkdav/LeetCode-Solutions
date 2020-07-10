package leetQuestions;

import java.util.ArrayList;
import java.util.List;

//to do
public class Q118Pascal {

	public static void main(String[] args) {

		int[] a1 = new int[] { 1 };
		int[] a2 = new int[] { 1, 1 };
		int[] a3 = new int[3];
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		int n = 5;
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < a3.length; i++) {
				a3[i] = a2[i - 1] + a2[i];
			}
		}

	}

}
