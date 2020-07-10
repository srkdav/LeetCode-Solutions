package leetQuestions;

import java.util.Arrays;

public class Q905Sort {

	public static void main(String[] args) {
		int[] a = new int[] {0,2,4,1,6};
		int t=0;
		Arrays.sort(a);
		for(int i=0;i<a.length/2;i++) {
			for(int j=a.length-1;j>=0;j--) {
				if(a[i]%2!=0 && a[j]%2==0) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
