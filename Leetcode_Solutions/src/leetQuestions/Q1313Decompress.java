package leetQuestions;

import java.util.ArrayList;

public class Q1313Decompress {

	public static void main(String[] args) {
		int[] a = new int[] {9,1};
		ArrayList<Integer> list = new ArrayList<Integer>();
		int size=0;
		for(int i=0;i<a.length;i=i+2) {
			size=size+a[i];
		}
		int[] arrf = new int[size];
		int j=0;
		for(int i=0;i<a.length;i=i+2) {
			while(a[i]!=0) {
//				list.add(a[i+1]);
				arrf[j]=a[i+1];
				j++;
				a[i]--;
			}
		}

        Integer[] arr = new Integer[list.size()]; 
        arr = list.toArray(arr);
        int[] arr1 = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
