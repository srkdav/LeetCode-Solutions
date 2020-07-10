package leetQuestions;

public class Q441ArrangingCoins {

	public static void findCoins(int n) {
		int count = 0;
		int i = 1;
		while (n > 0) {
			n = n - i;
			if (n >= 0) {
				count++;
			}
			i++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		findCoins(5);
	}

}
