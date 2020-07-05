package leetQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q974SubArrayDivideK {

	public static void subarraysDivByK(int[] a, int k) {
		HashMap<Integer, List<Integer>> hm = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		list.add(a[0]);
		int count = 0;
		hm.put(0, list);
		for (int i = 1; i < a.length; i++) {
			List<Integer> prevList = new ArrayList<>();
			prevList = hm.get(i - 1);
			List<Integer> ansList = new ArrayList<>();
			if (a[i] % k == 0) {
				count++;
			}
			ansList.add(a[i]);
			for (Integer l : prevList) {
				if ((l + a[i])% k == 0) {
					count++;
				}
				ansList.add(l + a[i]);
			}
			hm.put(i, ansList);
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		int a[] = new int[] { 4, 5, 0, -2, -3, 1 };
		subarraysDivByK(a, 5);
	}

}
