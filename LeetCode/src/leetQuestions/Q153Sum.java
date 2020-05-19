package leetQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q153Sum {

	public static void main(String[] args) {
		int a[] = new int[] { -2,0, 1, 1, 2};
		Arrays.sort(a);
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		int count = 0;// -2 0 1 1 2
		for (int i = 0; i < a.length - 2; i++) {
			if (i == 0 || a[i] != a[i - 1]) {
				int low = i + 1;
				int high = a.length - 1;
				int sum = 0 - a[i];
				while (low < high) {
					if (a[low] + a[high] == sum) {
						List<Integer> list1 = new ArrayList<Integer>();
//						System.out.println(a[i] + " " + a[low] + " " + a[high]);
						list1.add(a[i]);
						list1.add(a[low]);
						list1.add(a[high]);
						list.add(list1);
						while (low < high && a[low] == a[low + 1]) {
							low++;
						}
						while (low < high && a[high] == a[high - 1]) {
							high--;
						}
						low++;
						high--;
					}else if(a[low]+a[high]>sum){
						high--;
					}else{
						low++;
					}
				}
			}
		}
	
	}

}
