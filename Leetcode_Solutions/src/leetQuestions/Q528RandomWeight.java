package leetQuestions;

import java.util.Random;

public class Q528RandomWeight {

	int a[];

	public Q528RandomWeight(int[] w) {
		a = new int[w.length];
//		int sum = 0;
//		for (int i = 0; i < w.length; i++) {
//			sum = sum + w[i];
//			a[i] = sum;
//		}
		a[0] = w[0];
		for (int i = 1; i < w.length; i++) {
			a[i] = a[i - 1] + w[i];
		}
	}

	// 1 3
	// 1 4
	public int pickIndex() {
		Random rand = new Random();
		int num = rand.nextInt(a[a.length - 1]) + 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < num) {
				continue;
			} else
				return i;
		}
		return 0;
	}

	public static void main(String[] args) {
		int w[] = new int[] { 3, 14, 1, 7 };
		Q528RandomWeight q = new Q528RandomWeight(w);
		q.pickIndex();
		q.pickIndex();
		q.pickIndex();
		q.pickIndex();
		q.pickIndex();

	}
}
