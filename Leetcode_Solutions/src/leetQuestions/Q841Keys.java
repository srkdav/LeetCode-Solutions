package leetQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q841Keys {

	public static void canVisitAll(List<List<Integer>> a) {
		boolean[] seen = new boolean[a.size()];
		seen[0] = true;
		int j = 0;
		for (List<Integer> list : a) {
			if (list.size() == 0) {
				seen[j] = true;
			}
			for (Integer val : list) {
				if (j != val) {
					seen[val] = true;
				}
			}
			j++;
		}
		for (int i = 0; i < seen.length; i++) {
			if (!seen[i]) {
				System.out.println(false + " " + i);
			}
		}

	}

	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> ele = new ArrayList<Integer>();
		ele.add(1);
		ele.add(3);
		list.add(ele);
		ele = new ArrayList<Integer>();
		ele.add(0);
		ele.add(3);
		ele.add(1);
		list.add(ele);
		ele = new ArrayList<Integer>();
		ele.add(2);
		list.add(ele);
		ele = new ArrayList<Integer>();
		ele.add(0);
		list.add(ele);
		ele = new ArrayList<Integer>();
		canVisitAll(list);

	}

}
