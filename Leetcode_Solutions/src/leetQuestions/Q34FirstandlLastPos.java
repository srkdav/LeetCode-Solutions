package leetQuestions;

public class Q34FirstandlLastPos {

	public static void findIndexOfT(int a[], int t) {
		int idx = findTarget(a, t, 0, a.length - 1);
		int ans[] = new int[2];
		ans[0] = findTarget(a, t, 0, idx);
		ans[1] = findTarget1(a, t, idx, a.length - 1);
		System.out.println(idx + " " + ans[0] + " " + ans[1]);
	}

	public static int findTarget1(int a[], int t, int low, int high) {
		if (low <= high) {
			int mid = low + (high - low) / 2;
			if (a[mid] == t) {
				return mid;
			} else if (a[mid] >= t) {
				return findTarget1(a, t, low, mid);
			} else {
				return findTarget1(a, t, mid, high);
			}
		}
		return -1;
	}

	public static int findTarget(int a[], int t, int low, int high) {
		if (low <= high) {
			int mid = low + (high - low) / 2;
			if (a[mid] == t) {
				return mid;
			} else if (a[mid] <= t) {
				return findTarget(a, t, mid + 1, high);
			} else {
				return findTarget(a, t, low, mid - 1);
			}
		}
		return -1;
	}

	public static void findRange(int a[],int t){

		int ans[]=new int[]{-1,-1};
		int low=0;
		int high=a.length-1;
		while(low<=high){
			int mid = low+(high-low)/2;
			if(a[mid]>=t){
				high=mid-1;
			}else{
				low=mid+1;
			}
			if(a[mid]==t){
				ans[0]=mid;
			}
		}
		low=0;
		high=a.length-1;
		while(low<=high){
			int mid=low+(high-low)/2;
			if(a[mid]<=t){
				low=mid+1;
			}else{
				high=mid-1;
			}
			if(a[mid]==t){
				ans[1]=mid;
			}
		}
	}
	public static int findTargetElement(int a[],int t){
		int low=0;
		int high=a.length-1;
		int mid = low+(high-low)/2;
		while(low<=high){
			if(a[mid]==t){
				System.out.println("found "+mid);
				return mid;
			}else if(a[mid]<t){
				low=mid+1;
				mid=low+(high-low)/2;
			}else{
				high=mid-1;
				mid=low+(high-low)/2;
			}
		}
		return -1;
	}
	public static void main(String[] args) {

		int a[] = new int[] { 1,2,3,3,3,3,4,5,9};
//		int a[] = new int[]{};
		int t = 3;
		findRange(a, t);
	}

}
