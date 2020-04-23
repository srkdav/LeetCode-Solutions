package leetQuestions;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Q1415LexiString {

	static int count = 0;
	static String ans="";
	public static void getAllPermutation(char a[], String res,int n,int k) {
		if (res.length() == n) {
			boolean flag = false;
			for (int j = 0; j < res.length() - 1; j++) {
				if (res.charAt(j) == res.charAt(j + 1)) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				count++;
				if (count == k) {
					ans=res;
//					System.out.println(res);
				}
			}
			return;
		} else {
			for (int i = 0; i < a.length; i++) {
				res = res + a[i];
				getAllPermutation(a, res,n,k);
				res = res.substring(0, res.length() - 1);
			}
		}
	}

	public static void main(String[] args) {

		String s = "abc";
		String res = "";
		int n=3,k=9;
		getAllPermutation(s.toCharArray(), res,n,k);

	}

}
