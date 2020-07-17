package leetQuestions;

public class Q151RevWords {

	public static void reverseWords(String s) {
		String result="";
		int i=0;
		while (i < s.length()) {
			while (i < s.length() && s.charAt(i) == ' ') {
				i++;
			}
			int j=i+1;
			while(j<s.length() && s.charAt(j)!=' ') {
				j++;
			}
			if(i<s.length() && j<=s.length()) {
			String str = s.substring(i, j);
			result=str+" "+result;
			}
			i=j;
		}
		if(result.length()!=0)
			result=result.substring(0, result.length()-1);
		System.out.println(result);

	}

	public static void main(String[] args) {
		reverseWords("    ");
		
	}

}
