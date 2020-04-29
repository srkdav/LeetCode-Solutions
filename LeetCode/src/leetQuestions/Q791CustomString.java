package leetQuestions;

public class Q791CustomString {

	public static String swap(String a, int x, int y) {
		StringBuilder s = new StringBuilder(a);
		char p = s.charAt(x);
		char q = s.charAt(y);
		s.setCharAt(x, q);
		s.setCharAt(y, p);
		return s.toString();
	}

	// b = cba a = ffabcddee
	public static void findPermutation(String a, String b, int left, int right) {
		if (left >= right) {
			int j = 0;
			for (int k = 0; k < a.length(); k++) {
				if (!b.contains(a.subSequence(k, k+1))) {
					continue;
				} else {
					if (a.charAt(k) == b.charAt(j)) {
						while (a.charAt(k) == b.charAt(j)) {
							k++;
						}
						j++;
					}else{
						j++;
					return;	
					}
				}
			}

		} else {
			for (int i = left; i < a.length(); i++) {
				a = swap(a, left, i);
				findPermutation(a, b, left + 1, right);
				a = swap(a, left, i);
			}
		}
	}

	public static void main(String[] args) {
		String b = "abc";
		 String a = "daabc";
		findPermutation(a,b, 0, a.length() - 1);

	}

}
