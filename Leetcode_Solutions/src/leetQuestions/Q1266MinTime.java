package leetQuestions;

public class Q1266MinTime {
	public static void main(String[] args) {
		
		int[][] a = new int[][] {{1,1},{3,4}};
		int[] b =new int[] {1,1};
		int row=0,col=0,count=0;
		if(a[row][col]!=a[row+1][col+1]){
			a[row][col]=a[row][col];
			count++;
			System.out.println(a[row][col]);
		}
//		if(a[row]!=a[])
	}
}
