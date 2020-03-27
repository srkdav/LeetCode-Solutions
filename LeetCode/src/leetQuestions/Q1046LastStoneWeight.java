package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q1046LastStoneWeight {

	public static void main(String[] args) {

		int a[] = new int[] { 2,2};
		List<Integer> list = new ArrayList<Integer>();
		for (int i : a) {
			list.add(i);
		}
		while (list.size() != 1) {
			if(list.size()==0) {
				break;
			}
			int max1 = Math.max(a[0], a[1]);
			int max2 = Math.min(a[0], a[1]);
			int max1i = 0;
			int max2i = 0;
//			for(int i=2;i<a.length;i++) {
//				if(a[i]>max1) {
//				
//				}
//			}
			for (int i = 0; i < a.length; i++) {
				if (a[i] > max1) {
					max1 = a[i];
					max1i = i;
				}
			}
			for (int i = 0; i < a.length; i++) {
				if (a[i] > max2 && a[i] < max1) {
					max2 = a[i];
					max2i = i;
				}
				if (a[i] == max1 && i != max1i) {
					max2 = a[i];
					max2i = i;
				}
			}
			if (max1 > max2) {
				a[max1i] = a[max1i] - a[max2i];
				a[max2i] = 0;
			}
			if (max1 == max2) {
				a[max2i] = 0;
				a[max1i] = 0;
			}
			list = new ArrayList<Integer>();
			for (int i : a) {
				if (i != 0) {
					list.add(i);
				}
			}
		}
		if(list.size()==0) {
			list.add(0);
		}
		for (int i : list) {
			System.out.print(i + " ");
		}
	}

}

//for(int i=0;i<a.length;i++) {
//	if(a[i]>max1) {
//		max2=max1;	
//		max1=a[i];
//		max1i=i;
//		
//	}
//	else if(a[i]>max2 && a[i]!=max1) {
//		max2=a[i];
//		max2i=i;
//	}
//	
//}
