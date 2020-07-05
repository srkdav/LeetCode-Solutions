package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q310MinimumHeightTree {

	public static void findMinHeightTrees(int n,int [][]a) {
		int[] degree = new int[n];
		for(int row=0;row<a.length;row++) {
			int from = a[row][1];
			int to= a[row][0];
			degree[from]++;
			degree[to]++;
		}
		List<Integer> leaves = new ArrayList<Integer>();
		for(int i=0;i<degree.length;i++) {
			if(degree[i]<=1) {
				leaves.add(i);
			}
		}
		int processedLeaves = leaves.size();
		while(processedLeaves<n) {
			List<Integer> newLeaves = new ArrayList<Integer>();
			for(int leaf:leaves) {
				int neigh=-1;
				for(int row=0;row<a.length;row++) {
					if(a[row][0]==leaf) {
						neigh=a[row][1];
						break;
					}else if(a[row][1]==leaf) {
						neigh=a[row][0];
						break;
					}
				}
				degree[neigh]--;
				if(degree[neigh]==1) {
					newLeaves.add(neigh);
				}
				degree[leaf]=0;
			}
			processedLeaves=processedLeaves+newLeaves.size();
			leaves=newLeaves;
		}
		System.out.println(leaves);
	}
	public static void main(String[] args) {
		int [][]a =new int[][] {{1, 0}, {1, 3}, {1, 2}};
		findMinHeightTrees(4, a);
	}

}
