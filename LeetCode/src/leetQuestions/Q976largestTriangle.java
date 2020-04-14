package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q976largestTriangle {

	static List<Integer> list = new ArrayList<Integer>();
	static int max = Integer.MIN_VALUE;

	public static void findSidesUtil(int a[], int i) {
		if (list.size() == 3) {
			int b[] = new int[3];
			int j = 0, sum = 0;
			for (Integer l : list) {
				b[j] = l;
				j++;
				sum = sum + l;
			}
			boolean flag = false;
			if (b[0] >= b[1] + b[2] || b[1] >= b[0] + b[2] || b[2] >= b[0] + b[1]) {
				flag = true;
			}
			if (!flag) {
				if (sum > max) {
					max = sum;
				}
			}

			return;
		}
		for (int k = i; k < a.length; k++) {
			list.add(a[k]);
			findSidesUtil(a, k + 1);
			list.remove(list.size() - 1);

		}
	}

	public static void findSides(int a[]) {
		for (int i = 0; i < a.length; i++) {
			findSidesUtil(a, i);
		}
	}
	
	public static int getFinalAnswer(int a[]) {
		findSides(a);
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[] { 3,6,2,3 };
		findSides(a);
		System.out.println(getFinalAnswer(a));

	}

}

//if(a.length==3) {
//	if (a[0] >= a[1] + a[2] || a[1] >= a[0] + a[2] || a[2] >= a[0] + a[1]) {
//		return 0;
//	}else {
//		return a[0]+a[1]+a[2];
//	}
//}