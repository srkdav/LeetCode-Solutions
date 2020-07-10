package leetQuestions;

public class Q930BinarySubArray {

	public static void numSubarraysWithSum(int a[],int s) {
		int start=0;
		int end=1;
		int count=0;
		int sum=a[0];
		while(end<a.length) {
			while(sum<=s) {
				if(sum==s) {
					count++;
				}
				sum=sum+a[end];
				end++;
			}
			end--;
			sum=sum-a[end];
			sum=sum-a[start];
			start++;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		int a[]=new int[] {1,0,1,0,1};
		numSubarraysWithSum(a, 2);
	}

}
