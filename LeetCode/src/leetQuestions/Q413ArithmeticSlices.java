package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q413ArithmeticSlices {

	static int count = 0;

	public static void findSlices(List<Integer> temp, int a[], int index) {
		if (temp.size() > 2) {
			int diff = temp.get(1) - temp.get(0);
			for (int j = 1; j < temp.size() - 1; j++) {
				if (temp.get(j + 1) - temp.get(j) != diff) {
					return;
				}
			}
			System.out.println(temp);
			count++;

		}
		for (int i = index; i < a.length; i++) {
			temp.add(a[i]);
			findSlices(temp, a, i + 1);
			temp.remove(temp.size() - 1);
		}
	}

	public static int numberOfArithmeticSlices(int a[], int idx) {
		if (idx < 2) {
			return 0;
		}
		int c = 0;
		if (a[idx] - a[idx - 1] == a[idx - 1] - a[idx - 2]) {
			c = 1 + numberOfArithmeticSlices(a, idx - 1);
			count = c + count;
		} else {
			numberOfArithmeticSlices(a, idx - 1);
		}
		return count;
	}

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();
		int a[] = new int[] { 1, 2, 3, 4, 5, 6 };
		// findSlices(l,a,0);
		// System.out.println(count);
		numberOfArithmeticSlices(a, a.length - 1);
		 System.out.println(count);
	}

}
