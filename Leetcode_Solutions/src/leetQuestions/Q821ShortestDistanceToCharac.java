package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q821ShortestDistanceToCharac {

	public static void main(String[] args) {
		String str = " loveleetcode";
		char c ='e';
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==c) {
				count++;
			}
		}
		int[] a = new int[count]; //  1 2 7
		int j=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==c) {
				a[j]=i;
				j++;
			}
		}
		int[] b = new int[str.length()];
		for(int i=0;i<b.length;i++) {
			int min=Integer.MAX_VALUE;
			if(str.charAt(i)!=c) {
				for(int k=0;k<a.length;k++) {
					if(Math.abs(a[k]-i)<min) {
						min=Math.abs(a[k]-i);
					}
				}
				b[i]=min;
			}
		}
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	}

}

