package leetQuestions;

public class Q771Jewels {
	public static void main(String[] args) {
		String J = "aA";
		String S = "aAAbBcCC";
		int count = 0;
		for(int i=0;i<S.length();i++) {
			if(J.indexOf(S.charAt(i))!=-1) {
				count++;
			}
		}
		System.out.println(count);
	}
}
