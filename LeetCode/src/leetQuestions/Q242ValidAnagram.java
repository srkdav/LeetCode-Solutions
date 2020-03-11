package leetQuestions;

import java.util.Arrays;

public class Q242ValidAnagram {

	public static void main(String[] args) {
		String s = "anagram";
		String t = "anagram";
		boolean result= false;
		char sa[]= s.toCharArray();
		char ta[]=t.toCharArray();
		Arrays.sort(sa);
		Arrays.sort(ta);
		for(int i=0;i<sa.length;i++) {
			if(sa[i]!=ta[i]) {
				System.out.println(result);
			}
		}
		result=true;
		System.out.println(result);
	}

}
