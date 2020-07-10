package leetQuestions;

public class Q415AddStrings {

	public static void main(String[] args) {
		String a = "408";
		String b = "9";
		int a1 = 0, b1 = 0;

		int i = a.length() - 1;
		int j = b.length() - 1;
		int prevCarry = 0;

		StringBuilder str = new StringBuilder();
		
		while (i >= 0 || j >= 0 || prevCarry > 0) {
			int sum=0;
			if (i >= 0) {
				a1 = ((int) a.charAt(i) - 48);
				sum=sum+a1;
				i--;
			}
			if (j >= 0) {
				b1 = ((int) b.charAt(j) - 48);
				sum=sum+b1;
				j--;
			}
			sum = sum+ prevCarry;
			int carry = 0;
			if (sum > 9) {
				carry = 1;
				sum = sum % 10;
			}
			prevCarry = carry;
			str.append(sum);
		}
//		int sum = 0;
//		int carry = 0;
//		if(i==j) {
//			if(prevCarry!=0) {
//				str.append(prevCarry);
//			}
//		}
//		if (i >= 0) {
//			while (i >= 0) {
//				sum = prevCarry + (int) a.charAt(i) - 48;
//				carry = 0;
//				if (sum > 9) {
//					carry = 1;
//					sum = sum % 10;
//				}
//				prevCarry = carry;
//				String s1 = "" + sum;
//				str.append(s1);
//				i--;
//
//			}
//		}
//		if (j >= 0) {
//			while (j >= 0) {
//				sum = prevCarry + (int) b.charAt(j) - 48;
//				carry = 0;
//				if (sum > 9) {
//					carry = 1;
//					sum = sum % 10;
//				}
//				prevCarry = carry;
//				String s1 = "" + sum;
//				str.append(s1);
//				j--;
//			}
//		}
//		if (i == j) {
//			if (prevCarry != 0) {
//				str.append(prevCarry);
//			}
//		}
		System.out.println(str.reverse());
	}

}
