package leetQuestions;

import java.util.HashSet;

public class Q442Duplicates {

	public static void main(String[] args) {
		int a[] = new int[]{4,3,2,8,1,2,3,8};
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0 && a[i] < a.length) {
				int j = a[i];
				int v = a[j];
				if (a[j] < 0) {
					System.out.println(a[i]);
				} else {
					a[j] = 0 - v;
				}
			} else if (a[i] < 0 && Math.abs(a[i])<a.length) {
				int j = -1 * a[i];
				int v = a[j];
				if (a[j] < 0) {
					System.out.println(Math.abs(a[i]));
				} else {
					a[j] = 0 - v;
				}
			}else if(Math.abs(a[i])>=a.length){
				if(hs.contains(a[i])){
					System.out.println(a[i]);
				}else{
					hs.add(Math.abs(a[i]));
				}
			}
		}

	}

}
