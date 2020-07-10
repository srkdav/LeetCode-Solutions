package leetQuestions;

public class Q999AvailableCapturesforRook {
	
	public static void main(String[] args) {

//		String[][] board= new String[][] {
//										{['.',".",".",".",".",".",".","."]},
//										{[".",".",".","p",".",".",".","."]},
//										{[".",".",".","R",".",".",".","p"]},
//										{[".",".",".",".",".",".",".","."]},
//										{[".",".",".",".",".",".",".","."]},
//										{[".",".",".","p",".",".",".","."]},
//										{[".",".",".",".",".",".",".","."]},
//										{[".",".",".",".",".",".",".","."]}
//										};

		char[][] board = new char[][] {{'.','B','.'},
									   {'B','R','B'},
									   {'.','B','.'}};
		int count = 0;
		int row = 0, col = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 'R') {
					row = i;
					col = j;
				}
			}
		}
//Towards right
		for (int j = col; j < board[0].length; j++) {
			if(board[row][j]=='B') {
				break;
			}
			if(board[row][j]=='p') {
				count=count+1;
				break;
			}
			
		}
		
//To south
		for (int i = row; i < board[0].length; i++) {
			if(board[i][col]=='B') {
//				count--;
				break;
			}
			if(board[i][col]=='p') {
				count++;
				break;
			}
			
		}
		
//towards left
		
		for (int j = col; j >=0; j--) {
			if(board[row][j]=='B') {
//				count--;
				break;
			}
			if(board[row][j]=='p') {
				count++;
				break;
			}
			
		}
		
//to north
		for (int i = row; i >=0; i--) {
			if(board[i][col]=='B') {
//				count--;
				break;
			}
			if(board[i][col]=='p') {
				count++;
				break;
			}
			
		}
		System.out.println(count);

	}

}
