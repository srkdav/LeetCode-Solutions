
package leetQuestions;

public class Q680ValidPalindrome2 {

	public static boolean isPalindrome(String str) {

		int low = 0;
		int high = str.length() - 1;
		int count = 0;
		while (low <= high) {
			if (str.charAt(low) == str.charAt(high)) {
				low++;
				high--;
			} else if (str.charAt(low) != str.charAt(high) && str.charAt(low + 1) == str.charAt(high)) {
				System.out.println(str.charAt(low) + " " + str.charAt(high));
				count++;
				low++;
			} else if (str.charAt(low) != str.charAt(high) && str.charAt(low) == str.charAt(high - 1)) {
				System.out.println(str.charAt(low) + " " + str.charAt(high));
				count++;
				high--;
			} else {
				System.out.println(str.charAt(low) + " " + str.charAt(high));
				return false;
			}
		}
		if (count < 2) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkPalindrome(String str, int low, int high) {
		while (low <= high) {
			if (str.charAt(low) != str.charAt(high)) {
				return false;
			}
			low++;
			high--;
		}
		return true;
	}

	public static void main(String[] args) {

		 String str =
		 "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
//		String str = "abbbbca";
		int low = 0;
		boolean ans = true;
		int high = str.length() - 1;
		while (low <= high) {
			if (str.charAt(low) != str.charAt(high)) {
				ans = checkPalindrome(str, low + 1, high) || checkPalindrome(str, low, high - 1);
				if (ans == false) {
					System.out.println("nope");
					break;
				}
			}
			low++;
			high--;
		}
		if (ans == true) {
			System.out.println("same");
		}
	}

}
