package leetQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q784LetterCombo {

	public static void main(String[] args) {

		String str = "sDy";
		StringBuilder s = new StringBuilder(str);
		HashSet<String> hs = new HashSet<String>();
		findAllCapitals(s, 0,0, hs);
		hs.add(str);
		List<String> list = new ArrayList<>(hs);
		for (String l : list) {
			System.out.println(l);
		}
	}
    public static void findAllCapitals(StringBuilder str, int m,int n,HashSet<String> hs) {
		if(n==str.length()) {
			return;
		}
		for(int i=m;i<str.length();i++) {
			String s=str.substring(i,i+1).toUpperCase();
			char c = s.charAt(0);
			if(Character.isDigit(c)) {
				continue;
			}
			str.setCharAt(i, c);
			findAllCapitals(str, m+1, n+1,hs);
			hs.add(str.toString());
			String s1=str.substring(i,i+1).toLowerCase();
			char c1 = s1.charAt(0);
			str.setCharAt(i, c1);
            hs.add(str.toString());
		}
		
	}


}

//public static void findAllCapitals(StringBuilder str, int m, HashSet<String> hs) {
//	if (m == str.length()) {
//		return;
//	}
//	for(int i=m;i<str.length();i++) {
//        char c = str.charAt(i);
//        if(Character.isUpperCase(c)) {
//        	str.setCharAt(i, Character.toLowerCase(c));
//        }else {
//			str.setCharAt(i, Character.toUpperCase(c));
//        }
//        hs.add(str.toString());
//        findAllCapitals(str, i+1, hs);
//
//	}
//
//}
