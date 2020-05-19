package leetQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q1375Bulb3 {

	static HashMap<Character, List<Integer>> hm = new HashMap<Character, List<Integer>>();

	public static void makeBlue(char b[], int k) {
		for (int i = k; i < b.length; i++) {
			if (b[i] == 'T') {
				b[i] = 'B';
				List<Integer> list1 = hm.get('T');
				list1.remove(i);
				hm.put('T', list1);
				if (hm.get('T').size() == 0) {
					count++;
				}
			} else {
				break;
			}
		}
	}

	static int count = 0;

	public static void findTotal(int a[], char b[]) {
		List<Integer> list = new ArrayList<Integer>();
		hm.put('T', list);
		for (int i = 0; i < a.length; i++) {
			int k = a[i];
			if (k == 1) {
				b[k - 1] = 'B';
				makeBlue(b, k);
			} else {
				if (b[k - 1] == 'F' && b[k - 2] == 'T') {
					b[k - 1] = 'T';
					List<Integer> list1 = hm.get('T');
					list1.add(k - 1);
					hm.put('T', list1);
				} else if (b[k - 1] == 'F' && b[k - 2] == 'B') {
					b[k - 1] = 'B';
					makeBlue(b, k);
					if (hm.get('T').size() == 0) {
						count++;
					}
				} else if (b[k - 1] == 'F' && b[k - 2] == 'F') {
					b[k - 1] = 'T';
					List<Integer> list1 = hm.get('T');
					list1.add(k - 1);
					hm.put('T', list1);
				}
			}
		}
	}

	public static void findBlueBulb(int a[]) {
		int rmax = -1;
		int m = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > rmax) {
				rmax = a[i];
			}
			if (rmax == i+1) {
				m++;
			}
		}
		System.out.println(m);
	}

	public static void main(String[] args) {

		int[] a = new int[] { 2,1,3,5,4 };
		char[] b = new char[a.length];
		findBlueBulb(a);

	}

}
