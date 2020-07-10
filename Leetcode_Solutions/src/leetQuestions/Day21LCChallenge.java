package leetQuestions;

public class Day21LCChallenge {

	public static int binarySearch(int[][] a,int col,int l,int r){
		if(l>=r){
			return -1;
		}
		int mid = l+ (r-l)/2;
		if(a[mid][col]==1){
			return col;
		}
		if(a[mid][col]==0){
			return binarySearch(a, col, mid+1, r);
		}
		return -1;
		
	}
	public static void main(String[] args) {

		int [][] a = new int[][]{{0,0,1},{0,0,1}};
		for(int col=0;col<a[0].length;col++){
			int check=binarySearch(a, col, 0, a.length);
			if(check!=-1){
				System.out.println(check);
				break;
			}
		}
	}

}
