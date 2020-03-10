package leetQuestions;

import java.util.HashSet;

public class Q217ContainsDuplicate {

	public static void main(String[] args) {

		int[] a = new int[] {1,2,3,4};
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			if(hs.contains(a[i])) {
				System.out.println("yes "+a[i]);
			}else
				hs.add(a[i]);
		}
	}

}
