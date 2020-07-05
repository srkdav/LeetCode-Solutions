package leetQuestions;

public class Q81Search2 {

	public static int findPivot(int a[]) {
		int low=0;
		int high=a.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(a[mid]>a[mid+1] && a[mid]<a[mid-1]) {
				return mid;
			}
			if(a[mid]>a[low]) {
				low=mid+1;
			}
			else if(a[mid]<a[low]) {
				high=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int a[]=new int[] {2,5,6,0,0,0,1,2};
		System.out.println(findPivot(a));
//		System.out.println(0<=0);
	}

}
