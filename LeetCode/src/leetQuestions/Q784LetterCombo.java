package leetQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q784LetterCombo {

	public static void permutation(String res, String a, int index) {
		if (res.length() == a.length()) {
			System.out.println(res);
		}
		for (int i = index + 1; i < a.length(); i++) {
			char c = a.charAt(i);
			permutation(res + c, a, i);
			if (Character.isLetter(c)) {
				permutation(res + (Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c)), a,
						i);
			}
			if (res.length() != 0) {
				res = res.substring(0, res.length() - 1);
			}
		}
	}

	public static void helper(char[] chs, List<String> res, int pos) {
		if (pos == chs.length) {
			res.add(new String(chs));
			return;
		}
		if (chs[pos] >= '0' && chs[pos] <= '9') {
			helper(chs, res, pos + 1);
			return;
		}

		chs[pos] = Character.toLowerCase(chs[pos]);
		helper(chs, res, pos + 1);

		chs[pos] = Character.toUpperCase(chs[pos]);
		helper(chs, res, pos + 1);
	}

	public static void main(String[] args) {

		String str = "a1b2";
		List<String> res = new ArrayList<String>();
		helper(str.toCharArray(),res, 0);
//		String res = "";
//		permutation(res, str, -1);
		// StringBuilder s = new StringBuilder(str);
		// HashSet<String> hs = new HashSet<String>();
		// findAllCapitals(s, 0,0, hs);
		// hs.add(str);
		// List<String> list = new ArrayList<>(hs);
		// for (String l : list) {
		// System.out.println(l);
		// }
	}

	public static void findAllCapitals(StringBuilder str, int m, int n, HashSet<String> hs) {
		if (n == str.length()) {
			return;
		}
		for (int i = m; i < str.length(); i++) {
			String s = str.substring(i, i + 1).toUpperCase();
			char c = s.charAt(0);
			if (Character.isDigit(c)) {
				continue;
			}
			str.setCharAt(i, c);
			findAllCapitals(str, m + 1, n + 1, hs);
			hs.add(str.toString());
			String s1 = str.substring(i, i + 1).toLowerCase();
			char c1 = s1.charAt(0);
			str.setCharAt(i, c1);
			hs.add(str.toString());
		}

	}

}

// public static void findAllCapitals(StringBuilder str, int m, HashSet<String>
// hs) {
// if (m == str.length()) {
// return;
// }
// for(int i=m;i<str.length();i++) {
// char c = str.charAt(i);
// if(Character.isUpperCase(c)) {
// str.setCharAt(i, Character.toLowerCase(c));
// }else {
// str.setCharAt(i, Character.toUpperCase(c));
// }
// hs.add(str.toString());
// findAllCapitals(str, i+1, hs);
//
// }
//
// }
