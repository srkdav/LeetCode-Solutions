package leetQuestions;

public class Q50Powx_n {

	public static double findPower(double x, int n) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return x;
		}
		if (n < 0) {
			n = Math.abs(n);
			x = 1 / x;
		}
		if (n % 2 == 0) {
			return findPower(x * x, n / 2);
		} else {

			return x * findPower(x * x, (n) / 2);
		}
	}

	public static void main(String[] args) {
		System.out.println(findPower(-2.00000, -2147483648));
	}

}
