package leetQuestions;

import java.util.HashMap;

public class Q1347Anagram {

	public static void minSteps(String s, String t) {
		HashMap<Character,Integer> hms = new HashMap<Character,Integer>();
		HashMap<Character,Integer> hmt = new HashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++) {
			if(hms.containsKey(s.charAt(i))) {
				int c = hms.get(s.charAt(i));
				c++;
				hms.put(s.charAt(i), c);
			}else {
				hms.put(s.charAt(i), 1);
			}
			
			if(hmt.containsKey(t.charAt(i))) {
				int c = hmt.get(t.charAt(i));
				c++;
				hmt.put(t.charAt(i), c);
			}else {
				hmt.put(t.charAt(i), 1);
			}
		}
		
		for(Character h:hmt.keySet()) {
			if(hms.containsKey(h)) {
				int vals = hms.get(h);
				int valt = hmt.get(h);
				if(valt<=vals) {
					hmt.put(h, 0);
				}else {
					hmt.put(h, valt-vals);
				}	
			}
		}
		int sum=0;
		for(Character h:hmt.keySet()) {
			int c = hmt.get(h);
			sum=sum+c;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
	
		String s = "";
		String t = "";
		minSteps(s,t);

	}

}
