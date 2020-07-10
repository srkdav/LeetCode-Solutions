package leetQuestions;

import java.lang.module.FindException;

public class Q1267Server {

	public static int countServers(int [][]a,int row,int col) {
		for(int j=0;j<a[row].length;j++) {
			if(j!=col && a[row][j]==1) {
				return 1;
			}
		}
		for(int i=0;i<a.length;i++) {
			if(i!=row && a[i][col]==1) {
				return 1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		int a[][]=new int[][] {{1,1,0,0},{0,0,1,0},{0,0,1,0},{0,0,0,1}};
		int ans=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]==1) {
					ans=ans+countServers(a, i, j);
				}
			}
		}
		System.out.println(ans);
	}

}
