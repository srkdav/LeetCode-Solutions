package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q238ProductOfArray {

	public static void main(String[] args) {

		int a[] = new int[]{1,2,3,4};
		int b[] = new int[a.length];
		int left=1;
		int right=1;
		for(int i=0;i<a.length;i++){
			b[i]=left;
			left=left*a[i];
		}
		for(int i=a.length-1;i>=0;i--){
			b[i]=b[i]*right;
			right=right*a[i];
		}
		for(int x=0;x<b.length;x++){
			System.out.print(b[x]+" ");
		}
			
		
	}

}
