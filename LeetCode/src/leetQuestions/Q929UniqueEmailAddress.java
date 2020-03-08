package leetQuestions;

import java.util.HashSet;

public class Q929UniqueEmailAddress {

	public static void main(String[] args) {

		String[] str = new String[] { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com" };
		HashSet<String> set = new HashSet<String>();
		for (int j = 0; j < str.length; j++) {
			StringBuilder str1 = new StringBuilder();
			int x = str[j].indexOf('@');
			for (int i = 0; i < x; i++) {
				if (str[j].charAt(i) == '+') {
					break;
				}
				if (str[j].charAt(i) == '.') {
					i++;
				}
				str1.append(str[j].charAt(i));
			}
			for (int i = x; i < str[j].length(); i++) {
				str1.append(str[j].charAt(i));
			}
			set.add(str1.toString());
		}
		System.out.println(set);
	}

}
