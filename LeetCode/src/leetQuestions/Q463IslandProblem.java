package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q463IslandProblem {

	public static void main(String[] args) {
		int[][] a = new int[][] { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
		int permiter=0;
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a.length; col++) {
				if (a[row][col] == 1) {
					
				}
			}
		}
		
	}
}


//tried with another array, did not figure out . 
//int[][] b = new int[7][2];
//int i = 0;
//for (int row = 0; row < a.length; row++) {
//	for (int col = 0; col < a.length; col++) {
//		if (a[row][col] == 1) {
//			b[i] = new int[] { row, col };
//			i++;
//		}
//	}
//}
////for (int row = 0; row < b.length; row++) {
////	for (int col = 0; col < b[row].length; col++) {
////		System.out.print(b[row][col]);
////	}
////	System.out.println();
////}
//
//int x = b[0][0]; //0
//int y = b[0][1]; //1
////int permieter=0;
////int count=4;
//for (int row = 0; row < b.length; row++) {
//	for (int col = 0; col < b[row].length; col++) {
//		if((x+1==b[row][0] && y==b[row][1]) ||
//			(x=)) {
//		System.out.print(b[row][col]);
//		}
//	}
//}