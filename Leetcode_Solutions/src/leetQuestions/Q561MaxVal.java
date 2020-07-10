package leetQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class Q561MaxVal {

	public static void main(String[] args) {
		int max= 0;
		int[] a = new int[] {1,1,1,1};
		Arrays.sort(a);
		ArrayList<Integer[]> list = new ArrayList<Integer[]>();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				list.add(new Integer[] { a[i], a[j] });
			}
		}
		for (int i = 0; i < list.size(); i++) {
			int min1 = Math.min(list.get(i)[0], list.get(i)[1]);
			for (int j = i+1; j < list.size(); j++) {
				int min2 = Math.min(list.get(j)[0], list.get(j)[1]);
				
				if(max<min1+min2 && list.get(i)[0]!=list.get(j)[0] && list.get(i)[0]!=list.get(j)[1]&& list.get(i)[1]!=list.get(j)[0] && list.get(i)[1]!=list.get(j)[1]) {
				max = min1+min2;
				}
			}
		}
		System.out.println(max);

	}
}
