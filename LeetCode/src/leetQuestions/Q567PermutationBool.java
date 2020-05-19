package leetQuestions;

import java.util.HashMap;

public class Q567PermutationBool {

	public static void checkPermutation(String a, String b) {
		HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> hm2 = new HashMap<Character, Integer>();
		for (int i = 0; i < a.length(); i++) {
			if (!hm1.containsKey(a.charAt(i))) {
				hm1.put(a.charAt(i), 1);
			} else {
				int c = hm1.get(a.charAt(i));
				c++;
				hm1.put(a.charAt(i), c);
			}
		}
		for (int i = 0; i < b.length(); i++) {
			if (!hm2.containsKey(b.charAt(i))) {
				hm2.put(b.charAt(i), 1);
			} else {
				int c = hm2.get(b.charAt(i));
				c++;
				hm2.put(b.charAt(i), c);
			}
		}
		for (int i = 0; i < b.length(); i++) {
			if (hm1.containsKey(b.charAt(i))) {

			}
		}
	}

	public static void checkPermutation1(String s, String t) {
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (hm.containsKey(s.charAt(i))) {
				int c = hm.get(s.charAt(i));
				c++;
				hm.put(s.charAt(i), c);
			} else {
				hm.put(s.charAt(i), 1);
			}
		}
		int begin=0;
		int end=0;
		int count=hm.size();
		while(end<t.length()){
			if(hm.containsKey(t.charAt(end))){
				int c=hm.get(t.charAt(end));
				c--;
				if(c==0){
					count--;
				}
				hm.put(t.charAt(end), c);
			}
			while(count==0){
				if(end-begin==s.length()-1){
					System.out.println("true");
				}
				if(hm.containsKey(t.charAt(begin))){
					int c=hm.get(t.charAt(begin));
					if(c==0){
						count++;
					}
					c++;
					hm.put(t.charAt(begin), c);
				}
				begin++;
			}
			end++;
		}
	}

	public static void main(String[] args) {

		String a = "ab";
		String b = "aidaobaab";
		checkPermutation1(a, b);
	}

}
