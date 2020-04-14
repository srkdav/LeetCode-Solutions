package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q463IslandProblem {

	public static int checkOne(int[][] a, int row, int col, int permiter) {

		// North
		if (row > 0) {
			if (a[row - 1][col] == 1) {
				permiter--;
			}
		}

		// South
		if (row < a.length - 1) {
			if (a[row + 1][col] == 1) {
				permiter--;
			}
		}

		// East
		if (col < a[row].length - 1) {
			if (a[row][col + 1] == 1) {
				permiter--;
			}
		}

		// West
		if (col > 0) {
			if (a[row][col - 1] == 1) {
				permiter--;
			}
		}
		return permiter;
	}

	public static void main(String[] args) {
		int[][] a = new int[][] { { 1, 1 } };
		int permiter = 0;
		System.out.println(a.length);
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				if (a[row][col] == 1) {
					permiter = permiter + checkOne(a, row, col, 4);
				}
			}
		}
		System.out.println(permiter);

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