package leetQuestions;

public class Q419BattleShips {

	public static void main(String[] args) {

		char[][] a = new char[][] {{ 'X', 'X', 'X', 'X' } };
		int count = 0;
		boolean flag=false;
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				if (a[row][col] == '.') {
					continue;
				}
				if (a[row][col] == 'X') {
					if (row > 0 && col > 0) {
						if (a[row - 1][col] == 'X' && a[row][col - 1] == 'X') {
							flag=true;
							break;
						}
						if (a[row - 1][col] == 'X' && a[row][col - 1] != 'X') {
							continue;
						}
						if (a[row - 1][col] != 'X' && a[row][col - 1] == 'X') {
							continue;
						}
					}
					if(row==0 && col<a[row].length-1){
						if(a[row][col+1]=='X'){
							continue;
						}
					}
					if(col==0 && row<a.length-1){
						if(a[row+1][col]=='X'){
							continue;
						}
					}
					count++;
				}
			}
		}
		System.out.println(count);
		System.out.println(flag);
	}

}
