package leetQuestions;

public class Q713SubArrayLessK {

	public static void numSubarrayProductLessThanK(int[] a, int k) {
//10, 5, 2, 6
		int start = 0;
		int end = 0;
		int count = 0;
		int prod = 1;
		while (end < a.length) {
			prod=prod*a[end];
			while(start<=end && prod>=k) {
				prod=prod/a[start];
				start++;
			}
			count=count+end-start+1;
			end++;
		}
		System.out.println(count);

	}

	public static void main(String[] args) {

		int a[] = new int[] { 10, 5, 2, 6 };
		numSubarrayProductLessThanK(a, 100);
	}

}
