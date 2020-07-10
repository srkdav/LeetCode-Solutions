package leetQuestions;

public class Q1351Neg {
	public static void main(String[] args) {
		int[][] a = new int[][] {{4,3,2,-1},
								 {3,2,1,-1},
								 {1,1,-1,-2},
								 {-1,-1,-2,-3}
								 };
		int count=0;
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
				if(a[row][col]<0) {
					count=count+a[row].length-col;
					break;
				}
			}
		}
		System.out.println(count);
	}
}
