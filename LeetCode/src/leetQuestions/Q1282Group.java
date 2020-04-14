package leetQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Q1282Group {

	public static void main(String[] args) {

		int a[] = new int[] { 3, 3, 3, 3, 3, 1, 3 };
		HashMap<Integer, ArrayList<Integer>> hm = new HashMap<Integer, ArrayList<Integer>>();
		List<List<Integer>> list1 = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (!hm.containsKey(a[i])) {
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(i);
				hm.put(a[i], list);
			}
			else {
				ArrayList<Integer> list = new ArrayList<Integer>();
				list = hm.get(a[i]);
				if (list.size() == a[i]) {
					hm.remove(a[i]);
					list1.add(list);
					list = new ArrayList<Integer>();
					list.add(i);
					hm.put(a[i], list);
				} else {
					list.add(i);
					hm.put(a[i], list);
				}
			}
		}
		for(Entry<Integer, ArrayList<Integer>> h:hm.entrySet()) {
			list1.add(h.getValue());
		}
		for(List<Integer> l:list1) {
			System.out.println(l);
		}

	}

}
