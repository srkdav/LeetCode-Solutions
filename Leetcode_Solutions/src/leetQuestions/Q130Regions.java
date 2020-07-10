package leetQuestions;

public class Q130Regions {

	static boolean ans = false;

	public static boolean solve1(char[][] a, int row, int col, boolean[][] seen) {
		if (row < 0 || row >= a.length || col < 0 || col >= a[row].length) {
			return false;
		}
		if (a[row][col] == 'X') {
			{
				seen[row][col] = true;
			}
			return false;
		}
		if (row == 0 || row == a.length - 1 || col == 0 || col == a[0].length - 1) {
			seen[row][col] = true;
			if (a[row][col] == 'O') {
				return true;
			} else {
				return false;
			}
		} else {
			if (a[row][col] == 'O' && seen[row][col] == false) {
				seen[row][col] = true;
				boolean d = solve1(a, row + 1, col, seen);
				boolean u = solve1(a, row - 1, col, seen);
				boolean r = solve1(a, row, col + 1, seen);
				boolean l = solve1(a, row, col - 1, seen);
				ans = l || r || u || d;
				if (!(l || r || u || d)) {
					a[row][col] = 'X';
				}
			}
		}
		return ans;
	}

	static boolean check = false;

	public static boolean seen2(char a[][], int row, int col, boolean seen[][]) {
		if (row < 0 || row >= a.length || col < 0 || col >= a[row].length) {
			return true;
		}
		if (seen[row][col] == true) {
			return false;
		}
		if (a[row][col] == 'X') {
			return false;
		}
		seen[row][col] = true;
		boolean d = seen2(a, row + 1, col, seen);
		boolean u = seen2(a, row - 1, col, seen);
		boolean r = seen2(a, row, col + 1, seen);
		boolean l = seen2(a, row, col - 1, seen);
		check = d || u || r || l;
		if (check == false) {
			a[row][col] = 'X';
		}
//		seen[row][col] = false;
		return check;
	}

	public static void main(String[] args) {
		char a[][] = new char[][] { { 'X', 'O', 'X', 'O', 'O', 'O','O' }, { 'X', 'O', 'O', 'O', 'O', 'O','O' },
				{ 'X', 'O', 'O', 'O', 'O', 'X', 'O' }, { 'O', 'O', 'O', 'O', 'X', 'O', 'X' },
				{ 'O', 'X', 'O', 'O', 'O', 'O', 'O' }, { 'O', 'O', 'O', 'O', 'O', 'O', 'O' },
				{ 'O', 'X', 'O', 'O', 'O', 'O', 'O' } };

		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				System.out.print(a[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------");
		for (int row = 1; row < a.length-1; row++) {
			for (int col = 1; col < a[row].length-1; col++) {
				boolean[][] seen = new boolean[a.length][a[row].length];
				seen2(a, row, col, seen);
			}
		}

		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				System.out.print(a[row][col] + " ");
			}
			System.out.println();
		}
	}

}

//char a[][] = new char[][] { { 'X', 'O', 'X', 'O', 'X','O'}, { 'O', 'X', 'O', 'X', 'O', 'X'},
//	{ 'X', 'O', 'O', 'O', 'O', 'X', 'O' }, { 'O', 'O', 'O', 'O', 'X', 'O', 'X' },
//	{ 'O', 'X', 'O', 'O', 'O', 'O', 'O' }, { 'O', 'O', 'O', 'O', 'O', 'O', 'O' },
//	{ 'O', 'X', 'O', 'O', 'O', 'O', 'O' } };

//char a[][] = new char[][] { { 'X', 'O', 'X', 'O', 'X', 'O' }, { 'O', 'X', 'O', 'X', 'O', 'X' },
//	{ 'X', 'O', 'X', 'O', 'X', 'O' }, { 'O', 'X', 'O', 'X', 'O', 'X' } };
