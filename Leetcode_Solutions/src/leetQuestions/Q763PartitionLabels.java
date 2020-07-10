package leetQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Q763PartitionLabels {

	public static void main(String[] args) {

		String s = "ababcbacadefegdehijhklij";
		StringBuilder sb = new StringBuilder(s);
		HashMap<Character, Integer[]> hm = new HashMap<Character, Integer[]>();
		Integer[] a = new Integer[2];
		for(int i=0;i<sb.length();i++) {
			 a = new Integer[] {0,0};
			if(!hm.containsKey(sb.charAt(i))) {
				a[0]=i;
				hm.put(sb.charAt(i),a);
			}
			else {
				a=hm.get(sb.charAt(i));
				a[1]=i;
				hm.replace(sb.charAt(i), a);
				
			}
		}
//		for(Entry<Character, Integer[]> hm1:hm.entrySet()) {
//			a=hm1.getValue();
//			for(int i=0;i<a.length;i++) {
//				System.out.print(hm1.getKey()+" "+a[i]+" ");
//			}
//			System.out.println();
//		}
		Iterator<Map.Entry<Character, Integer[]>> itr = hm.entrySet().iterator(); 
		Integer b[] = new Integer[2];
//		HashSet<Character> hs = new HashSet<Character>();
		List<ArrayList<Character>> list = new ArrayList<ArrayList<Character>>();
		while(itr.hasNext()) {
			ArrayList<Character> list1 = new ArrayList<Character>();
			  Map.Entry<Character, Integer[]> entry = itr.next(); 
			  a=entry.getValue();
			  while(itr.hasNext()) {
				  Map.Entry<Character, Integer[]> entry1 = itr.next();
				  b=entry1.getValue();
				  if(a[0]<b[0] && b[0]<a[1]) {
					  list1.add(entry1.getKey());
					  System.out.print(entry1.getKey()+" ");
				  }else {
					  break;
				  }
			  }
			  list.add(list1);
			  System.out.println();
		}
	

	}

}

//for(;i<sb.length();i++) {
//	if(!hm.containsKey(sb.charAt(i))) {
//		hm.put(sb.charAt(i), 1);
//	}else {
//		int count = hm.get(sb.charAt(i));
//		count++;
//		hm.replace(sb.charAt(i),count);
//	}
//}