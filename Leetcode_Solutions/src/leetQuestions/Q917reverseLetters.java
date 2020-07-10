package leetQuestions;

public class Q917reverseLetters {

	static void swap(char[] a, int i, int j) {
		char x = a[i];
		a[i] = a[j];
		a[j] = x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ab-cd";
		char a[] = new char[str.length()];
		a = str.toCharArray();
		int j = a.length - 1;
		for (int i = 0; i < a.length; i++) {
			if (i <= j) {  //a[i] != '-' && a[i]!='=' && a[i] != '!'
				if ( (int)a[i] >=65 && (int)a[i]<=90 || (int)a[i]>=97 && (int)a[i]<=122 ) {
					while (j > 0) {
						if ((int)a[j] >=65 && (int)a[j]<=90 || (int)a[j]>=97 && (int)a[j]<=122 ) {
							swap(a, i, j);
							j--;
							break;
						} else {
							j--;
						}
					}
				} else {
					continue;
				}
			}
		}
		StringBuilder str1 = new StringBuilder();
//		System.out.println(a.toString());
		for (int i = 0; i < a.length; i++) {
			str1.append(a[i]);
		}
		System.out.println(str1.toString());
	}

}
