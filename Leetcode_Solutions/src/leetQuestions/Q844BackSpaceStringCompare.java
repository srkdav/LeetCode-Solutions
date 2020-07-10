package leetQuestions;

public class Q844BackSpaceStringCompare {

	public static void main(String[] args) {

		String a = "ab##";
		String b = "c#d#";
		StringBuilder str1 = new StringBuilder();
		StringBuilder str2 = new StringBuilder();
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
				str1.append(a.charAt(i));
			} else {
				if (str1.length() > 0) {
					str1.deleteCharAt(str1.length() - 1);
				}
			}

		}
		
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z') {
				str2.append(b.charAt(i));
			} else {
				if (str2.length() > 0) {
					str2.deleteCharAt(str2.length() - 1);
				}
			}
		}
		
		System.out.println(str1.toString().equals(str2.toString()));
	}

}
