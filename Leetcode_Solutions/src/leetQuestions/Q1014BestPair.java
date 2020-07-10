package leetQuestions;

public class Q1014BestPair {

	public static void bestPair(int[] a) {
		int start = 0;
		int end = a.length - 1;
		int max = 0;
		while (start < end) {
			max = Math.max(max, a[start] + a[end] + start - end);
			if (a[start] > a[end]) {
				end--;
			} else {
				start++;
			}
		}
		System.out.println(max);
	}

	public static void bestPair1(int a[]) {
		int maxBefore = a[0] + 0;
		int result = 0;
		for (int i = 1; i < a.length; i++) {
			result = Math.max(result, maxBefore+a[i]-i);
			maxBefore = Math.max(maxBefore, a[i] + i);
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		int a[] = new int[] { 6, 9, 10, 5, 9, 10, 4, 5 };
//		int a[]=new int[] {8,1,5,2,6};
		bestPair1(a);
	}

}
