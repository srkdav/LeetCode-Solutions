package leetQuestions;

public class Q392IsSubSeq {

	public static void isSubSeq(String str1,String str2) {
		
		int j=0;
		for(int i=0;i<str1.length();i++) {
			if(j<str2.length() && str1.charAt(i)==str2.charAt(j)) {
				j++;
			}
		}
		if(j==str2.length()) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}
	public static void main(String[] args) {
		isSubSeq("abcde", "ace");
	}

}
