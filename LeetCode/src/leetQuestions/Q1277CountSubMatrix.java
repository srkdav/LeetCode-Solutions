package leetQuestions;

public class Q1277CountSubMatrix {

	static void findCountOfSubMatrix(int a[][],int row,int col,int row1,int col1){
		
	}
	public static void main(String[] args) {
	
		int[][] a = new int[][] {{0,1,1,1},{1,1,1,1},{0,1,1,1}};
		int row1 = a.length;
		int col1 = a[0].length;
		
		for(int row = 0; row<a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
				if(a[row][col]==1) {
					findCountOfSubMatrix(a,row, col, row1, col1);
				}
			}
		}
	}

}
