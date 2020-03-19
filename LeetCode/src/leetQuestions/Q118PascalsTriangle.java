package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q118PascalsTriangle {

	public static void main(String[] args) {
		List<ArrayList<Integer>> list1 = new ArrayList<ArrayList<Integer>>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();
		list2.add(1);
		list3.add(1);
		list3.add(1);
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		list4.add(1);
		for(int i=0;i<1;i++) {
			list4 = new ArrayList<Integer>();
			int sum=list3.get(i)+list3.get(i+1);
			//System.out.println(sum);
			list4.add(sum);
			list1.add(list4);
		}
		list4.add(1);
		for(ArrayList<Integer> l:list1) {
			System.out.print(l+" ");
		}
		
	}

}
