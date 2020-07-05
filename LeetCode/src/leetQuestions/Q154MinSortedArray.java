package leetQuestions;

public class Q154MinSortedArray {

	public static int findPivotIndex(int a[]) {
		int low=0;
		int high=a.length-1;
		while(low<high) {
			int mid=low+(high-low)/2;
			if(a[mid]>a[high]) {
				low=mid+1;
			}else {
				high=mid;
			}
		}
		return low;
	}
	public static void main(String[] args) {

		int a[] = new int[] {3,1,2};
		int x=findPivotIndex(a);
		System.out.println(x);
	}

}
