package leetQuestions;

public class Q852PeakIndexMountainArray {
	public static void main(String[] args) {
		int a[]= new int[] {0,2,1,0};
		int y=0;
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
				y=i;
			}
		}
		System.out.println(y);
	}
}
