package leetQuestions;

import java.util.HashSet;

public class Q1079Tiles {

	static HashSet<String> hs = new HashSet<String>();

	public static void findAllCases(char a[], String res, int start, int end) {
		if (start == end) {
			hs.add(res);
//			System.out.print(res + " ");
			return;
		}
		for (int i = start; i < end; i++) {
			System.out.print(res + " ");
//			System.out.println(i+" "+start+" "+end);
			findAllCases(a, res+a[i], start+1, end);
		}

	}

	public static void main(String[] args) {

		char a[] = new char[] { 'A', 'B', 'C' };
		String res = "";
		findAllCases(a, res, 0, 3);
//	System.out.println(hs);

	}

}
