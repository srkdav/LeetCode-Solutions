package leetQuestions;

import java.util.LinkedHashMap;

public class Q386FirstUnique {

	public static void main(String[] args) {
		
		String s = "loveleetcode";
		LinkedHashMap<Character,Integer[]> hm = new LinkedHashMap<Character,Integer[]>();
		for(int i=0;i<s.length();i++) {
			if(hm.containsKey(s.charAt(i))) {
				Integer[] arr = hm.get(s.charAt(i));
				arr[0]++;
				hm.replace(s.charAt(i), arr);
			}else {
				Integer[] arr = new Integer[2];
				arr[0]=0;
				arr[1]=i;
				hm.put(s.charAt(i), arr);
			}
		}
//		System.out.println(hm);
		for(Character key: hm.keySet()) {
			Integer[] arr =hm.get(key);
			if(arr[0]==0) {
				System.out.println(arr[1]);
				break;
			}
		}

	}

}
