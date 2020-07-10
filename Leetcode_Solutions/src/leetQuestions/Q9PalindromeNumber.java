package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q9PalindromeNumber {

	public static void main(String[] args) {

		int n = 123421;
		List<Integer> list = new ArrayList<Integer>();
		int i = 0;
		while (n > 0) {
			int r = n % 10;
			n = n / 10;
			list.add(r);
		}
		int[] a = new int[list.size()];
		for(int j=0;j<a.length;j++) {
			a[j]=list.get(j);
		}
		boolean pal=true;
		for(int x=0;x<a.length/2;x++) {
			if(a[x]!=a[a.length-x-1]) {
				pal=false;
			}
		}
		System.out.println(pal);
	}

}
