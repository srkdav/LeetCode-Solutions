package leetQuestions;

import java.util.HashMap;

public class Q383RansomNote {

	public static void main(String[] args) {
	
		String a="aa";
		String b="aab";
		int[] c =new int[26];
		for(int i=0;i<b.length();i++) {
			c[(int)b.charAt(i)-'a']++;
		}
		for(int i=0;i<a.length();i++) {
			c[(int)a.charAt(i)-'a']--;
			if(c[(int)a.charAt(i)-'a']<0) {
				System.out.println("false");
			}
		}
		
				
	}

}

//HashMap<Character,Integer> hm1= new HashMap<Character,Integer>();
//HashMap<Character,Integer> hm2= new HashMap<Character,Integer>();
//for(int i=0;i<b.length();i++) {
//	if(hm2.containsKey(b.charAt(i))) {
//		int count= hm2.get(b.charAt(i));
//		count++;
//		hm2.replace(b.charAt(i), count);
//	}else
//		hm2.put(b.charAt(i), 1);
//}
//for(int i=0;i<a.length();i++) {
//	if(hm1.containsKey(a.charAt(i))) {
//		int count= hm1.get(a.charAt(i));
//		count++;
//		hm1.replace(a.charAt(i), count);
//	}else
//		hm1.put(a.charAt(i), 1);
//}
//for(Character key:hm1.keySet()) {
//	if(hm2.containsKey(key)) {
//		int count2=hm2.get(key);
//		int count1=hm1.get(key);
//		if(count1>count2) {
//			System.out.println("false");
//		}
//	}
//	else {
//		System.out.println("false");
//	}
//}