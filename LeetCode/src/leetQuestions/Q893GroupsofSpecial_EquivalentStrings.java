package leetQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q893GroupsofSpecial_EquivalentStrings {
	static char[] swap(String str, int i, int j) {
		char ch[] = str.toCharArray();
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return ch;
	}

	public static void main(String[] args) {

		String s[] = new String[] {  "cdab", "cbad", "xyzz", "zzxy", "zzyx" };
		HashSet<String> hm = new HashSet<String>();
		StringBuilder eve = new StringBuilder();
		StringBuilder odd = new StringBuilder();
		for (int i = 0; i < s.length; i++) {
			eve = new StringBuilder();
			odd = new StringBuilder();
			for (int j = 0; j < s[i].length(); j++) {
				if (j % 2 == 0) {
					eve.append(s[i].charAt(j));
				} else {
					odd.append(s[i].charAt(j));
				}
			}
			eve.toString().toCharArray();
			char t[]= eve.toString().toCharArray();
			char q[]= odd.toString().toCharArray();
			Arrays.sort(t);
			Arrays.sort(q);
			char[] result = new char[t.length+q.length];
			System.arraycopy(t, 0, result, 0, t.length);
			System.arraycopy(q, 0, result, t.length, q.length);
			String string = new String(result);
			hm.add(string);
		}
		System.out.println(hm);
	}
}

//for (int i = 0; i < p.length(); i++) {
//	if (i % 2 == 0) {
//		eve.append(p.charAt(i));
//	} else {
//		odd.append(p.charAt(i));
//	}
//	eve.toString().toCharArray();
//	Arrays.sort(eve.toString().toCharArray());
//	Arrays.sort(odd.toString().toCharArray());
//}
//System.out.println(eve);
//System.out.println(odd);
//
