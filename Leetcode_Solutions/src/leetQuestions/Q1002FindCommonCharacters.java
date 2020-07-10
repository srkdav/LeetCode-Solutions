package leetQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q1002FindCommonCharacters {

	public static void main(String[] args) {
//to -do
		String[] A = new String[] { "bella", "label", "roller" };
		List<String> list = new ArrayList<String>();
		int[] min_freq = new int[26];
		Arrays.fill(min_freq, Integer.MAX_VALUE);
		
		for(String curr_string: A) {
			int[] char_freq = new int[26];
			for(char c:curr_string.toCharArray()) {
				char_freq[c-'a']++;
			}
			for(int i=0;i<26;i++) {
				min_freq[i]= Math.min(min_freq[i], char_freq[i]);
			}
		}
	}

}

//
//for (int k = 0; k < s[i].length(); k++) {
//	if (a[(int) s[i].charAt(k)] > 1) {
//								
//			continue;
//	}
//	if (a[(int) s[i].charAt(k)] == 1) {
//		if (!list.contains(s[i].charAt(k))) {
//	
//		}
//	}

//int[] a = new int[256];
//for (int i = 0; i < s[0].length(); i++) {
//	a[(int) s[0].charAt(i)]++;
//}
//for (int i = 0; i < s[1].length(); i++) {
//	a[(int) s[1].charAt(i)]++;
//}
//for (int i = 0; i < s[2].length(); i++) {
//	if (a[(int) s[2].charAt(i)] > 1) {
//		list.add(s[2].charAt(i));
//		a[(int) s[1].charAt(i)]=a[(int) s[1].charAt(i)]-2;
//	}
//}
