package leetQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Q1356SortIntegersbyTheNumberof1Bits {
//to do
	public static void main(String[] args) {
		int [] arr = new int[] {0,1,2,3,4,5,6,7,8};
		Arrays.sort(arr);
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			String str = Integer.toBinaryString(i);
			int count=0;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)=='1') {
					count++;
				}
			}
			hm.put(arr[i], count);
		}
	
		for(Integer key: hm.keySet()) {
			
		}
	}

}
