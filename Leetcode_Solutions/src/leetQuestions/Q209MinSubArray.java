package leetQuestions;

public class Q209MinSubArray {

	public static void minSubArray(int[] a, int s) {
		int start = 0;
		int end = 0;
		int sum = 0;
		int count = 0;
		int max = Integer.MAX_VALUE;
		while (end < a.length) {
			sum = sum + a[end];
			if (sum >= s) {
				while (sum >= s) {
					if (sum >= s) {
						count = end - start + 1;
						max = Math.min(max, count);
					}
					sum = sum - a[start];	
					start++;
				}
			}
			end++;
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		int a[] = new int[] { 2, 3, 1, 2, 4, 3 };
		minSubArray(a, 7);
	}

}
