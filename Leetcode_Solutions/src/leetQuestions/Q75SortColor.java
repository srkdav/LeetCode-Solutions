package leetQuestions;

import java.lang.module.FindException;

public class Q75SortColor {

	public static void sortcolor(int a[]) {
		int low = 0;
		int high = a.length - 1;
		int i=low;
		while(i<=high) {
			if(a[i]==0) {
				int t=a[i];
				a[i]=a[low];
				a[low]=t;
				i++;
				low++;
			}else if(a[i]==2) {
				int t=a[i];
				a[i]=a[high];
				a[high]=t;
				high--;
			}else {
				i++;
			}
		}
		for( i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		int a[]=new int[] {2,0,2,1,1,0};
		sortcolor(a);
	}

}


//for(int i=high;i>=0;i--) {
//	low=0;
//	while(low<=i) {
//		if(a[low]==0 || a[i]==2) {
//			low++;
//			continue;
//		}
//		if(a[low]>a[i]) {
//			int t=a[i];
//			a[i]=a[low];
//			a[low]=t;
//		}
//		low++;
//	}
//}