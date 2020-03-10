package leetQuestions;

public class Q766ToeplizMatrix {

	public static void main(String[] args) {
//to do. Not completed.
		int[][] a = new int[][] {{1,2,3,4},
								{5,1,2,3},
								{9,5,1,2}};
								
		int r=a.length;//3
		int c =a[0].length;//4
		for(int row=0;row<a.length;row++) {
			if(row+1<a.length&&a[row][row]==a[row+1][row+1]) {
				System.out.println("same");
			}
		}
		for(int row=0;row<a.length;row++) {
			int x=0,y=0;
			if(a[row][row]==a[row+1][row+1]) {
				System.out.println("same");
			}
		}
		
	}

}

//for(int row=0;row<a.length;row++) {
//	for(int col=0;col<a[row].length;col++) {
//		System.out.print(a[row][col]);
//	}
//	System.out.println();
//}