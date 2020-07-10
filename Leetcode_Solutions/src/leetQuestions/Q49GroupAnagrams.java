package leetQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q49GroupAnagrams {

	public static void main(String[] args) {
		String[] a = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
		HashMap<String,ArrayList<String>> hm = new HashMap<String,ArrayList<String>>();
		for(int i=0;i<a.length;i++) {
			char[] t = a[i].toCharArray();
			Arrays.sort(t);
			String key = String.valueOf(t);
			if(!hm.containsKey(key)) {
				List<String> list1 =  new ArrayList<String>();
				list1.add(a[i]);
				hm.put(key, (ArrayList<String>) list1);
			}else {
				ArrayList<String> list2 = hm.get(key);
				list2.add(a[i]);
			}
		}
		System.out.println(hm);
	}

}


//String[] orig = new String[a.length];
//
//for(int i=0;i<a.length;i++) {
//	orig[i]=a[i];
//}
//for(int i=0;i<a.length;i++) {
//	char[] t = a[i].toCharArray();
//	Arrays.sort(t);
//	a[i] = new String(t);
//}
//
//List<List<String>> list = new ArrayList<List<String>>();
//for(int i=0;i<a.length;i++) {
//	boolean flag=false;
//	for(List<String> l:list) {
//		if(l.contains(a[i])) {
//			l.add(a[i]);
//			flag=true;
//			break;
//		}else {
//			flag=false;
//		}
//	}
//	if(flag==false) {
//		List<String> list1 = new ArrayList<String>();
//		list1.add(a[i]);
//		list.add(list1);
//	}
//}
//
//for(List<String> l:list) {
//	System.out.print(l+" ");
//}
//
//
//
