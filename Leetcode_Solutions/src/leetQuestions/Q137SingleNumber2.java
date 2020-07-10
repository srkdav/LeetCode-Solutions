package leetQuestions;

public class Q137SingleNumber2 {

	public static int singleNumber(int A[]) {
		int res = 0;
		int[] bit = new int[32];
		for (int i = 0; i < bit.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (((A[j] >> i) & 1) == 1) {
					bit[i]++;
				}
			}
			res = res + ((bit[i] % 3) << i);
		}

		return res;
	}

	public static void main(String[] args) {

		int a[] = new int[] { 2, 2, 3, 2 };
		System.out.println(singleNumber(a));
	}

}
