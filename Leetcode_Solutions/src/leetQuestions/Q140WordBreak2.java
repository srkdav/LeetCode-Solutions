package leetQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Q140WordBreak2 {

	static int j = 0;

	public static void findCombination(String s, String[] w, int idx, int start, List<String> list) {
		if (start >= s.length()) {
			System.out.println(list);
			return;
		}
		for (int i = idx; i < w.length; i++) {
			boolean flag = true;
			for (j = start; j < start + w[i].length(); j++) {
				if (w[i].charAt(j - start) != s.charAt(j)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				list.add(w[i]);
			}
			findCombination(s, w, i + 1, j, list);
			if (list.size() > 0) {
				list.remove(list.size() - 1);
			}
		}
	}

	public static List<String> findCombination1(String s, String[] word, HashMap<String, LinkedList<String>> hm) {
		if (hm.containsKey(s)) {
			return hm.get(s);
		}
		LinkedList<String> res = new LinkedList<>();
		if(s.length()==0){
			res.add(" ");
			return res;
		}
		for (String w : word) {
			if (s.startsWith(w)) {
				List<String> list=findCombination1(s.substring(w.length()), word, hm);
				for(String sub:list){
					res.add(w+ (sub.isEmpty()?"" :" ")+sub);
				}
			}
		}
		hm.put(s, res);
		return res;
	}

	public static void main(String[] args) {
		String s = "catsanddog";
		 String[] w = new String[] { "cat", "cats", "and", "sand", "dog" };
//		String[] w = new String[] { "apple", "pen", "applepen", "pine", "pineapple" };
		List<String> list = new ArrayList<String>();
//		findCombination(s, w, 0, 0, list);
		HashMap<String,LinkedList<String>> hm = new HashMap<>();
		System.out.println(findCombination1(s,w, hm));
	}

}
