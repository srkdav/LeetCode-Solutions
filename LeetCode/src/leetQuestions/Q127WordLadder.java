package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q127WordLadder {

//	public static boolean findLength(String b, String e,String f, List<String> list, int i) {
//		if (i > list.size()) {
//			return false;
//		}
//		findLength(b, e, f, list, i)
//	}

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("hot");
		list.add("dot");
		list.add("dog");
		list.add("lot");
		list.add("log");
		list.add("cog");
		String s = "hit";
		String e = "cog";
		boolean ePresent = false;
		for (String l : list) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != l.charAt(i)) {
					count++;
				}
			}
			if (count == 1) {

			}
			if (l.equals(e)) {
				ePresent = true;
			}
		}

	}

}
