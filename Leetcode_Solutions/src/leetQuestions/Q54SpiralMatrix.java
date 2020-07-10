package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q54SpiralMatrix {

	static boolean seen[][];
	
	public static void printSpiral(int[][] a) {
		seen=new boolean[a.length][a[0].length];
		int count=a.length*a[0].length-1;
		int row=0,col=0;
		while(count!=0) {
			while(col+1<a[row].length && seen[row][col+1]==false) {
				System.out.print(a[row][col]+" ");
				seen[row][col]=true;
				col++;
				count--;
			}
		
			while(row+1<a.length && seen[row+1][col]==false) {
				System.out.print(a[row][col]+" ");
				seen[row][col]=true;
				row++;
				count--;
			}
			
			while(col-1>=0 && seen[row][col-1]==false) {
				System.out.print(a[row][col]+" ");
				seen[row][col]=true;
				col--;
				count--;
			}
			while(row-1>0 && seen[row-1][col]==false) {
				System.out.print(a[row][col]+" ");
				seen[row][col]=true;
				row--;
				count--;
			}
		}
		System.out.println(a[row][col]);
		
	}
    public static List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> res = new ArrayList<Integer>();
        
        if (matrix.length == 0) {
            return res;
        }
        
        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;
        
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // Traverse Right
            for (int j = colBegin; j <= colEnd; j ++) {
                res.add(matrix[rowBegin][j]);
//                System.out.print();
            }
            rowBegin++;
            
            // Traverse Down
            for (int j = rowBegin; j <= rowEnd; j ++) {
                res.add(matrix[j][colEnd]);
            }
            colEnd--;
            
            if (rowBegin <= rowEnd) {
                // Traverse Left
                for (int j = colEnd; j >= colBegin; j --) {
                    res.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;
            
            if (colBegin <= colEnd) {
                // Traver Up
                for (int j = rowEnd; j >= rowBegin; j --) {
                    res.add(matrix[j][colBegin]);
                }
            }
            colBegin ++;
        }
        
        return res;
    }
	
	public static void main(String[] args) {
		
		int a[][]=new int[][] {{1,2,3},{5,6,7},{9,10,11}};
//		printSpiral(a);
		spiralOrder(a);
		
	}

}
