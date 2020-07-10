package leetQuestions;

public class Q1291SeqDigits {

	public static void findSeqDigits(int low, int high, int str, int idx, int a) {
		if (Integer.valueOf(str) > low && Integer.valueOf(str) < high) {
			System.out.println(str);
		}
		if (Integer.valueOf(str) > high || a == 9) {
			return;
		}
		str = str * 10 + a + 1;
		a = a + 1;
		findSeqDigits(low, high, str, idx, a);

	}

	public static void main(String[] args) {

		int low = 1000;
		int high = 13000;
		for (int i = 1; i <= 9; i++) {
			findSeqDigits(low, high, i, i, i);
		}
	}

}
