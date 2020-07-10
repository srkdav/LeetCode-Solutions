package leetQuestions;

public class Q566ReshapeMatrix {

	public static void main(String[] args) {

		int[][]nums=new int[][] {{1,2,3},{3,4,3}};
		int nums_row=nums.length;
		int nums_col=nums[0].length;
		int[] a=new int[nums_row*nums_col];
		int k=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				a[k]=nums[i][j];
				k++;
			}
		}
	
		int r=1;
		int c=6;
		int[][] arr=new int[1][6];
		k=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=a[k];
				k++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
