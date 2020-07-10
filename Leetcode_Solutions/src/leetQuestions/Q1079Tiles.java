package leetQuestions;

import java.util.HashSet;

public class Q1079Tiles {

	static HashSet<String> hs = new HashSet<String>();

	public static String swap(String ans, int p, int q) {
		StringBuilder str1 = new StringBuilder(ans);
		char m = str1.charAt(p);
		char n = str1.charAt(q);
		str1.setCharAt(p, n);
		str1.setCharAt(q, m);
		return str1.toString();
	}

	public static void findAllPermutations(String res, int left, int right) {
		if (left == right) {
			hs.add(res);
//			System.out.print(res + " ");
		} else {
			for (int j = left; j <=right; j++) {
				res=swap(res, left, j);
				findAllPermutations(res, left + 1, right);
				res=swap(res, left, j);
			}
		}
	}

	public static void findAllCases(char a[], String res, int index) {
		if (index == a.length) {
			return;
		}
		hs.add(res);
//		System.out.print(res + " ");
		if (res.length() > 1) {
			findAllPermutations(res, 0, res.length()-1);
		}
		for (int i = index + 1; i < a.length; i++) {
			res = res + a[i];
			findAllCases(a, res, i);
			res = res.substring(0, res.length() - 1);
		}

	}

	public static void main(String[] args) {

		char a[] = new char[] { 'A' };
		String q = "abc";
		a=q.toCharArray();
		String res = "";
		findAllCases(a, res, -1);
		System.out.println(hs.size());
	}

}
