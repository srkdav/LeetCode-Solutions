package leetQuestions;

public class Q1047RemoveAllAdjacentDuplicatesString {

	public static StringBuilder deleteCommon(StringBuilder s) {
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				s.deleteCharAt(i);
				s.delete(i, i+1);
//				s.deleteCharAt(i+1);
			}
		}
		return s;
	}
	public static void main(String[] args) {
		String str= "abbaca";
		StringBuilder s =new StringBuilder(str);
		for(int i=0;i<s.length()-1;i++) {
			System.out.println(s.charAt(i)+" "+s.charAt(i+1));
			if(s.charAt(i)==s.charAt(i+1)) {
				s= deleteCommon(s);
				i=-1;
			}
		}
		String x = s.toString();
		System.out.println(s.toString());
	}

}
