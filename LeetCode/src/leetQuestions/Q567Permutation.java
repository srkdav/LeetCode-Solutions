package leetQuestions;

import java.util.HashMap;
import java.util.Map.Entry;

public class Q567Permutation {
	
	public static void main(String[] args) {
		String str1 = "ab";
		String str2="eidboaoo";
		HashMap<Character,Integer> hm1 = new HashMap<Character,Integer>();
		HashMap<Character,Integer> hm2 = new HashMap<Character,Integer>();
		for(int i=0;i<str1.length();i++) {
			if(hm1.containsKey(str1.charAt(i))) {
				int c = hm1.get(str1.charAt(i));
				c++;
				hm1.replace(str1.charAt(i), c);
			}else {
				hm1.put(str1.charAt(i), 1);
			}
		}
		for(int i=0;i<str2.length();i++) {
			if(hm2.containsKey(str2.charAt(i))) {
				int c = hm2.get(str2.charAt(i));
				c++;
				hm2.replace(str2.charAt(i), c);
			}else {
				hm2.put(str2.charAt(i), 1);
			}
		}
		System.out.println(hm1);
		System.out.println(hm2);
		for(Entry<Character, Integer> h:hm2.entrySet()) {
			if(hm1.containsKey(h.getKey())) {
				int c2 = h.getValue();
				int c1 = hm1.get(h.getKey());
				if(c1<=c2)
					hm1.put(h.getKey(), 0);
			}
		}
		boolean flag=true;
		for(Entry<Character, Integer> h:hm1.entrySet()) {
			int c = h.getValue();
			if(c!=0) {
				flag=false;
				break;
			}
		}
		System.out.println(flag);
	}

}


//static boolean flag=false;
//public static void swap(char[] str,int i,int j) {
//	char a = str[i];
//	char b= str[j];
//	str[j]=a;
//	str[i]=b;
//}
//public static void permutation(char[] str,int l,int r,String str2) {
//	if(l==r) {
//		String check=String.valueOf(str);
//		if(str2.contains(check)) {
//			flag=true;
//		}
//	}
//	else {
//		for(int i=l;i<=r;i++) {
//			swap(str,l,i);
//			permutation(str, l+1, r,str2);
//			swap(str,l,i);
//		}
//	}
//}