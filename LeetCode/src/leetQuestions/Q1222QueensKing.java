package leetQuestions;

import java.util.HashSet;

public class Q1222QueensKing {

	public static void main(String[] args) {

		int[][] q = new int[][] { { 0, 0 }, { 1, 1 }, { 2, 2 }, { 3, 4 }, { 3, 5 }, { 4, 4 }, { 4, 5 } };
		int[] k = new int[] { 3, 3 };
		int kr = k[0];
		int kc = k[1];
		int[] a = new int[] { 3, 3 };
		// RIGHT
		for (int c = kc; c < 8; c++) {
			a[1]++;
			boolean flag = false;
			for (int qr = 0; qr < q.length; qr++) {
				if (a[0] == q[qr][0] && a[1] == q[qr][1]) {
					System.out.print(a[0] + " " + a[1]);
					System.out.println();
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}
		// LEFT
		a = new int[] { 3, 3 };
		for (int c = kc; c >= 0; c--) {
			a[1]--;
			boolean flag = false;
			for (int qr = 0; qr < q.length; qr++) {
				if (a[0] == q[qr][0] && a[1] == q[qr][1]) {
					System.out.print(a[0] + " " + a[1]);
					System.out.println();
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}
		// DOWN
		a = new int[] { 3, 3 };
		for (int r = kr; r < 8; r++) {
			a[0]++;
			boolean flag = false;
			for (int qr = 0; qr < q.length; qr++) {
				if (a[0] == q[qr][0] && a[1] == q[qr][1]) {
					System.out.print(a[0] + " " + a[1]);
					System.out.println();
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}
		// UP
		a = new int[] { 3, 3 };
		for (int r = kr; r >= 0; r--) {
			a[0]--;
			boolean flag = false;
			for (int qr = 0; qr < q.length; qr++) {
				if (a[0] == q[qr][0] && a[1] == q[qr][1]) {
					System.out.print(a[0] + " " + a[1]);
					System.out.println();
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}
		// Diag-Up-right
		a = new int[] { 3, 3 };
		for (int r = kr; r >= 0; r--) {
			boolean flag = false;
			for (int c = kc; c < 8; c++) {
				a[0]--;
				a[1]++;
				if (a[0] >= 0 && a[1] <= 8) {
					for (int qr = 0; qr < q.length; qr++) {
						if (a[0] == q[qr][0] && a[1] == q[qr][1]) {
							System.out.print(a[0] + " " + a[1]);
							System.out.println();
							flag = true;
							break;
						}
					}
				}else{
					flag=true;
				}
				if (flag) {
					break;
				}
			}
			if(flag){
				break;
			}
		}
		// Diag-up-left
		a = new int[] { 3, 3 };
		for (int r = kr; r >= 0; r--) {
			for (int c = kc; c >= 0; c--) {
				a[0]--;
				a[1]--;
				boolean flag = false;
				for (int qr = 0; qr < q.length; qr++) {
					if (a[0] == q[qr][0] && a[1] == q[qr][1]) {
						System.out.print(a[0] + " " + a[1]);
						System.out.println();
						flag = true;
						break;
					}
				}
				if (flag) {
					break;
				}
			}
		}
		// diag-bott-right
		a = new int[] { 3, 3 };
		for (int r = kr; r < 8; r++) {
			for (int c = kc; c < 8; c++) {
				a[0]++;
				a[1]++;
				boolean flag = false;
				for (int qr = 0; qr < q.length; qr++) {
					if (a[0] == q[qr][0] && a[1] == q[qr][1]) {
						System.out.print(a[0] + " " + a[1]);
						System.out.println();
						flag = true;
						break;
					}
				}
				if (flag) {
					break;
				}
			}
		}
		// Diag-bot-left
		a = new int[] { 3, 3 };
		for (int r = kr; r < 8; r++) {
			for (int c = kc; c >= 0; c--) {
				a[0]++;
				a[1]--;
				boolean flag = false;
				for (int qr = 0; qr < q.length; qr++) {
					if (a[0] == q[qr][0] && a[1] == q[qr][1]) {
						System.out.print(a[0] + " " + a[1]);
						System.out.println();
						flag = true;
						break;
					}
				}
				if (flag) {
					break;
				}
			}
		}

	}

}
