package leetQuestions;

public class Q275HIdx {

	public static int hIndex(int a[]) {
		int low=0;
		int high=a.length-1;
		int size=a.length;
		while(low<=high) {
			int mid = low + (high-low)/2;
			if(a[mid]==size-mid) {
				return size-mid;
			}
			else if(a[mid]<size-mid) {
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		return size-low;
	}
	public static void main(String[] args) {
		
		int a[]=new int[] {0};
		System.out.println(hIndex(a));
	}

}
