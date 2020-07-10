package leetQuestions;

public class Q1232CheckStLine {

	public static void main(String[] args) {

//		int a[][] = new int[][] { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 } };
		int a[][] = new int[][]{{-3,-2},{-1,-2},{2,-2},{-2,-2},{0,-2}};
		int x1=a[1][0],x0= a[0][0],y1=a[1][1],y0=a[0][1];
		int dx =x1- x0 ,dy= y1-y0;
		for(int row=2;row<a.length-1;row++){
			int x = a[row][0];
			int y= a[row][1];
			if(dx * (y-y1) != dy * (x-x1)){
				System.out.println("no");
			}
		}
	}

}
