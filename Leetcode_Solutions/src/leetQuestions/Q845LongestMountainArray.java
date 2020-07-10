package leetQuestions;

public class Q845LongestMountainArray {

	public static void longestMountain(int[] a) {
		int low=0;
		int high=0;
		int ans=0;
		while(low<a.length-2) {
//			boolean dec=false;
//			boolean inc=false;
			while(low<a.length-1 && a[low]>=a[low+1])
				low++;
			high=low+1;
			while(high<a.length-1 && a[high]<a[high+1]) {
				high++;
//				dec=true;
			}
			while(high<a.length-1 && a[high]>a[high+1]) {
				high++;
//				inc=true;
			}
			if(high-low+1>=3) {
				ans=Math.max(ans,high-low+1);
			}
			low=high;
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {

//		int a[]=new int[] {2,1,4,7,3,2,5};
		int a[]=new int[] {0,1,0};
		longestMountain(a);
	}

}
