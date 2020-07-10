package leetQuestions;

import java.util.ArrayList;

public class Q500KeyBoardRow {

	public static void main(String[] args) {
		String a = new String("qwertyuiop");
		String b = new String("asdfghjkl");
		String c = new String("zxcvbnm");
		String[] words = new String[] {};
		String[] s1 = new String[] { "hello", "Alaska", "Dad", "Peace" };
		ArrayList<String> list = new ArrayList<String>();
		boolean t = false;
		for (int q = 0; q < s1.length; q++) {
			String s = s1[q].toLowerCase();
			int k = 0;
			for (int i = 0; i < s.length(); i++) {
				for (int j = 0; j < a.length(); j++) {
					if (s.charAt(i) == a.charAt(j)) {
						k++;
						break;
					} else {
						continue;
					}
				}
				if (k - i != 1) {
//					System.out.println("not in A");
					t = true;
					break;
				}
			}
			if (t == false) {
				list.add(s);
			}
			//
			t = false;
			int l = 0;
			for (int i = 0; i < s.length(); i++) {
				for (int j = 0; j < b.length(); j++) {
					if (s.charAt(i) == b.charAt(j)) {
						l++;
						break;
					} else {
						continue;
					}
				}
				if (l - i != 1) {
					// System.out.println("not in B");
					t = true;
					break;
				}
			}
			if (t == false) {
				list.add(s);
			}
			//
			t = false;
			int m = 0;
			for (int i = 0; i < s.length(); i++) {
				for (int j = 0; j < c.length(); j++) {
					if (s.charAt(i) == c.charAt(j)) {
						m++;
						break;
					} else {
						continue;
					}
				}
				if (m - i != 1) {
					// System.out.println("not in C");
					t = true;
					break;
				}
			}
			if (t == false) {
				list.add(s);
			}

		}
		String[] sol = new String[list.size()];
		int sol1=0;
		for (String w : list) {
			sol[sol1]= (String)w;
			sol1++;
		}
	}
}
