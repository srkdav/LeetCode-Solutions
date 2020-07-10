package leetQuestions;

public class Q859BuddyString {

	public static void main(String[] args) {

		String str1 = "abab";
		String str2 = "abab";
		int a[] = new int[2];
		boolean flag = false;
		int x = 0;
		for (int i = 0; i < str1.length() - 1; i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				if (x < a.length) {
					a[x] = i;
				}
				x++;
			}
			if (str1.charAt(i) == str1.charAt(i + 1)) {
				flag = true;
			} else {
				flag = false;
			}
		}
		if (x < 2) {
			if (str1.charAt(str1.length() - 1) != str2.charAt(str2.length() - 1)) {
				a[x] = str1.length() - 1;
			}
		}

		if (x > 2) {
			System.out.println("not possible");
		} else {
			if (!flag) {
				if (str1.equals(str2)) {
					System.out.println("same but diff charac");
				} else {
					StringBuilder str3 = new StringBuilder(str1);
					char p = str1.charAt(a[0]);
					char q = str1.charAt(a[1]);
					str3.setCharAt(a[0], q);
					str3.setCharAt(a[1], p);
					if (str3.toString().equals(str2)) {
						System.out.println("same");
					} else {
						System.out.println("not same");
					}
				}
			} else {
				if (str1.equals(str2)) {
					System.out.println("same and same charac");
				}
			}
		}

	}

}
