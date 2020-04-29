package leetQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Q406QueueRecons {

	static int ans[][];
	public static void setAnswer(int[][] a){
		ans=new int[a.length][a[0].length];
	}
	public static int[][] swap(int a[][], int row1, int row2) {
		int b[][] = new int[2][2];
		b[0] = a[row1];
		b[1] = a[row2];
		a[row1] = a[row2];
		a[row2] = b[0];
		return a;
	}

	public static void findAllPermutations(int a[][], int left, int right) {
		if (left >= right) {
			boolean flag = true;
			int row1 = 0;
			for (int row = 0; row < a.length; row++) {
				int count=0;
				for(row1=0;row1<row;row1++){
					if(a[row1][0]>=a[row][0]){
						count++;
					}
				}
				if(count!=a[row][1]){
					flag=false;
					return;
				}
			}
			if (flag == true) {
				for (int row = 0; row < ans.length; row++) {
					for (int col = 0; col < ans[row].length; col++) {
						ans[row][col]=a[row][col];
					}
				}
			}
			if (flag == true) {
				for (int row = 0; row < ans.length; row++) {
					for (int col = 0; col < ans[row].length; col++) {
						System.out.print(ans[row][col]+" ");
					}
				}
				System.out.println();
			}
		} else {
			for (int i = left; i < a.length; i++) {
				a = swap(a, left, i);
				findAllPermutations(a, left + 1, right);
				a = swap(a, left, i);
			}
		}

	}
	
    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2){
                return o1[0]!=o2[0]?-o1[0]+o2[0]:o1[1]-o2[1];
            }
         });
         List<int[]> res = new LinkedList<>();
         for(int[] cur : people){
             res.add(cur[1],cur);       
         }
         return res.toArray(new int[people.length][]);
    }

	public static void main(String[] args) {

		int a[][] = new int[][] { { 7, 0 }, { 4, 4 }, { 7, 1 }, { 5, 0 }, { 6, 1 }, { 5, 2 } };
//		System.out.println(a.length);
//		System.out.println(a[0].length);
//		setAnswer(a);
//		findAllPermutations(a, 0, a.length - 1);
		reconstructQueue(a);
	}

}
