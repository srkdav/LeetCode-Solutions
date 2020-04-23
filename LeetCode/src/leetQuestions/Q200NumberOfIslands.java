package leetQuestions;

public class Q200NumberOfIslands {
	static char[][] grid;
	static boolean[][] seen;
	static int count = 0;
	static boolean flag = false;

	public static void countTotal(int r, int c) {
		if (r < 0 || r >= grid.length || c < 0 || c >= grid[r].length || seen[r][c] == true || grid[r][c] == '0') {
			return;
		} else {
			seen[r][c] = true;
			countTotal(r + 1, c);
			countTotal(r - 1, c);
			countTotal(r, c + 1);
			countTotal(r, c - 1);
			flag = true;
		}
	}

	public static void countTotalUtil(char[][] grid1, boolean[][] seen1) {
		grid = grid1;
		seen = seen1;
		for (int r = 0; r < grid.length; r++) {
			for (int c = 0; c < grid[r].length; c++) {
				flag = false;
				countTotal(r, c);
				System.out.print(grid[r][c]+" ");
				System.out.print(flag);
				if (flag == true) {
					count++;
				}
			}
			System.out.println();
		}
		System.out.println(count);
	}

	public static void main(String[] args) {

//		char[][] grid = new char[][] { { 1, 1, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 0, 1, 1 } };
		char[][] grid=new char[][]{};
//		if(grid[0].length==0){
//		System.out.println("wqw" +grid[0].length);
//		}else{
//			System.out.println("inavlid");
//		}
		System.out.println(grid.length);
//		boolean[][] seen = new boolean[grid.length][grid[0].length];
//		countTotalUtil(grid, seen);
	}

}
