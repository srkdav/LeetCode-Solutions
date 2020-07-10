package leetQuestions;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QSubDomainVisit {
	public static void main(String[] args) {
		String str = "9000 discuss.leetcode.com";
		StringBuilder str1 = new StringBuilder();
		StringBuilder[] str2 = new StringBuilder[3];
		int k = 0;
		int z = 0;
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(str);
		while (m.find()) {
			k = Integer.parseInt(m.group());
		}
//		System.out.println(k);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				z++;
			} else
				break;
		}
//		String str = "discuss.leetcode.com";
		int j = 0;
		for (int i = str.length()-1; i > z+1; i--) {

			if (str.charAt(i) != '.') {
				str1.append(str.charAt(i));
			} else {
				j++;
//				break;
			}
			str2[j] = str1;
			str1.delete(0, str1.length());
			
		}
		System.out.println(str2[0]);
	}
}

//for(int i=0;i<str.length();i++) {
//	if(str.charAt(i)!='.')
//		System.out.print(str.charAt(i));
//	else
//		System.out.println();
//}

//working
//for (int i = z + 1; i < str.length(); i++) {
//	if (str.charAt(i) != '.') {
//		str1.append(str.charAt(i));
//	} 
//	else {
//		j++;
//	//	break;
//	}
//	str2[j]=str1.toString();
//}
//System.out.println(str2[1]);
//}