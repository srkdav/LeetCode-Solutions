package leetQuestions;

import java.util.Collections;

public class Q832Flipping {

	public static void main(String[] args) {
		int[][] a = new int[][] { { 1, 1, 0 }, { 1, 0, 1 }, { 0,0,0}};
		int t=0;
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a.length/2;col++) {
				t=a[row][col];
				a[row][col]=a[row][a.length-col-1];
				a[row][a.length-col-1]=t;	
				if(a[row][col]==0) {
					a[row][col]=1;
				}
				else
					a[row][col]=0;
				if(a[row][a.length-col-1]==0) {
					a[row][a.length-col-1]=1;
				}else
					a[row][a.length-col-1]=0;
			}
		}
//		for(int row=0;row<a.length;row++) {
//			for(int col=0;col<a.length;col++) {
//			if(a[row][col]==0) {
//				a[row][col]=1;
//			}
//			else
//				a[row][col]=0;
//			}
//		}		
		
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a.length;col++){
				System.out.print(a[row][col]);
			}
			System.out.println();
		}
	}
}
