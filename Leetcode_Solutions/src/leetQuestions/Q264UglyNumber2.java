package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q264UglyNumber2 {

	public static void findUglyNumber(int n) {
		List<Boolean> list = new ArrayList<Boolean>();
		list.add(true); // 0
		list.add(true); // 1
		list.add(true); // 2
		list.add(true); // 3
		list.add(true); // 4
		list.add(true); // 5
		int count = 5;
		int i = 6;
		while (count < n) {
			if (i % 2 != 0 && i % 5 != 0 && i % 3 != 0) {
				list.add(false);
			} else {
				if (i % 2 == 0) {
					int q = i / 2;
					if (list.get(q)) {
						list.add(true);
						count++;
					} else {
						list.add(false);
					}
					
				} else if (i % 3 == 0) {
					int q = i / 3;
					if (list.get(q)) {
						list.add(true);
						count++;
					} else {
						list.add(false);
					}
				} else if (i % 5 == 0) {
					int q = i / 5;
					if (list.get(q)) {
						list.add(true);
						count++;
					} else {
						list.add(false);
					}
				}
			}
			i++;
		}
		int idx = list.size() - 1;
		while (list.get(idx) == false) {
			idx--;
		}

		System.out.println(idx + " " + list.get(idx));
	}
	
	public static void findUglyNumber1(int n) {
		int [] ugly = new int[n];
		ugly[0]=1;
		int count=1;
		int idx2=0,idx3=0,idx5=0;
		while(count<n) {
			int ugly2=ugly[idx2]*2;
			int ugly3=ugly[idx3]*3;
			int ugly5=ugly[idx5]*5;
			int min = Math.min(Math.min(ugly2, ugly3),ugly5);
			if(min==ugly2) {
				idx2++;
			}
			if(min==ugly3) {
				idx3++;
			}
			if(min==ugly5) {
				idx5++;
			}
			ugly[count]=min;
			count++;
		}
		System.out.println(ugly[n-1]);
		
	}

	public static void main(String[] args) {
		findUglyNumber1(10);
	}

}
