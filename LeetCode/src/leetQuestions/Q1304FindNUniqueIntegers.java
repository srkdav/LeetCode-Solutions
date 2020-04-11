package leetQuestions;

import java.util.Random;

public class Q1304FindNUniqueIntegers {

	public static void main(String[] args) {

		int n = 6;
		int a[] = new int[n];
		int k = (0 - n) / 2;
		if (n % 2 != 0) {
			for (int i = 0; i < a.length; i++) {
				a[i] = k;
				k++;
			}
		}else {
			for (int i = 0; i < a.length; i++) {
				if(k==0) {
					k++;
					a[i]=k;
					k++;
					continue;
				}
				a[i] = k;
				k++;
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
