package leetQuestions;

import java.util.Arrays;

public class Q1051HeightChecker {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5};
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		Arrays.sort(b);
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i]) {
				count++;
			}
		}
		System.out.println(count);
	}

}
