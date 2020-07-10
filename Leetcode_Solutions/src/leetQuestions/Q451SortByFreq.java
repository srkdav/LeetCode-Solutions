package leetQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Q451SortByFreq {

	public static void sortByFreq(String a) {
		//int a[]=new int[10];
//		List<Character> c[]= new List<>;;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < a.length(); i++) {
			if (hm.containsKey(a.charAt(i))) {
				int c = hm.get(a.charAt(i));
				c++;
				hm.put(a.charAt(i), c);
			} else {
				hm.put(a.charAt(i), 1);
			}
		}
		System.out.println(hm);
		List<Map.Entry<Character, Integer>> list = new LinkedList<Map.Entry<Character, Integer>>(hm.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
			public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});

		HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
		for (Map.Entry<Character, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}

		StringBuilder str = new StringBuilder();
		List<Character> list1=new ArrayList<Character>(temp.keySet());
		for(Character l:list1) {
			int c = temp.get(l);
			while(c!=0) {
				str.append(l);
				c--;
			}
		}
		System.out.println(str.toString());

	}

	public static void main(String[] args) {
		String str = "tree";
		sortByFreq(str);

	}

}
