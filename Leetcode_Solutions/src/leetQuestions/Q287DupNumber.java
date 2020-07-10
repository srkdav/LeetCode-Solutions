package leetQuestions;

import java.util.Arrays;

public class Q287DupNumber {

	public static void findDuplicate(int a[]) {
		Arrays.sort(a);
		int low = 0;
		int high = a.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (a[mid] == mid) {
				high = mid - 1;
			} else if (a[mid] == mid + 1) {
				low = mid + 1;
			}
			if (mid > 0 && a[mid] == a[mid - 1]) {
				System.out.println(a[mid]);
			}
			if (mid < a.length && a[mid] == a[mid + 1]) {
				System.out.println(a[mid]);
			}
		}
	}

	public static int findDuplicate1(int a[]) {
		if (a.length > 1) {
			int hare = a[0];
			int tort = a[a[0]];
			while (hare != tort) {
				hare = a[hare];
				tort = a[a[tort]];
			}
			hare = 0;
			while (hare != tort) {
				hare = a[hare];
				tort = a[tort];
			}
			return a[tort];
		}
		return -1;
	}

	public static void main(String[] args) {
//		int a[] = new int[] { 2, 5, 9, 6, 9, 3, 8, 9, 7, 1 };// 1 2 3 5 6 7 8 9 9 9
//		findDuplicate(a);
		int a[]=new int[] {2,6,4,1,3,1,5};
		System.out.println(findDuplicate1(a));
	}

}
