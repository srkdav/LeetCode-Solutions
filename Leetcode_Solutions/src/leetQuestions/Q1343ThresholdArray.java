package leetQuestions;

public class Q1343ThresholdArray {

	public static void findCount(int a[], int k, int t) {
		int l = 0;
		int r = 0;
		int sum = 0;
		int ans = 0;
		while (r < k - 1) {
			sum = sum + a[r];
			r++;
		}
		if (sum / k >= t) {
			ans++;
		}
		while (r < a.length) {
			while (r - l != k) {
				sum = sum - a[l];
				l++;
				if (r - l == k) {
					if (sum / k >= t) {
						ans++;
					}
				}
			}
			r++;
			if (r < a.length)
				sum = sum + a[r];

		}

		if (sum / k >= t) {
			ans++;
		}
		System.out.println(ans);
	}

	public static void findCount2(int a[], int k, int t) {
		int sum = 0, ans = 0;
		for (int i = 0; i < k - 1; i++) {
			sum = sum + a[i];
		}
		for (int i = k - 1; i < a.length; i++) {
			sum = sum + a[i];
			if (sum / k >= t) {
				ans++;
			}
			sum = sum - a[Math.abs(k-i-1)];
		}

		System.out.println(ans);
	}

	public static void main(String[] args) {
//		int a[] = new int[] { 2852, 5203, 9375, 3209, 932, 9529, 4416, 3525, 2435, 3131, 3232, 2047, 2871, 3550, 5923,
//				4553, 2086, 5990, 4580, 2948, 8522, 4850, 3597, 744, 6963, 8126, 2153, 258, 1955, 3169, 3165, 4334, 791,
//				5342, 4348, 5404, 8531, 1045, 7767, 9842 };
		int a[] = new int[] { 2, 2, 2, 2, 5, 5, 5, 8 };
//		int a[]=new int[] {1,1,1,1,1};
		findCount2(a, 3, 4);
	}

}
