package leetQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q448FindAllNumbersDisappearedinanArray {
//to do with No extra space
	public static void main(String[] args) {
		int[] a = new int[] { 1, 1, 2, 2 };
		int[] b = new int[] { 1, a.length };
		for(int i=1;i<=a.length;i++) {
			if(i==a[i-1]) {
				continue;
			}
		}
	}

}


//------------Extra Space-----------------------
//if(a.length==0){
//    return new ArrayList<Integer>();
//}
//		int[] b = new int[] {1,a.length };
//HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
//for (int i = 0; i < a.length; i++) {
//	if (hm.containsKey(a[i])) {
//		int count = hm.get(a[i]);
//		count++;
//		hm.replace(a[i], count);
//	} else {
//		hm.put(a[i], 1);
//	}
//}
//List<Integer> list = new ArrayList<Integer>();
//for(int i=1;i<=a.length;i++) {
//	if(!hm.containsKey(i))
//		list.add(i);
//}
//return list;
