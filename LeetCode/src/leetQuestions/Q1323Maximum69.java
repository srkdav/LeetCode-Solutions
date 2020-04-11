package leetQuestions;

public class Q1323Maximum69 {

	public static void main(String[] args) {
		int num1 = 9999;
		int max = num1;
		StringBuilder str = new StringBuilder(String.valueOf(num1));
		for(int i=0;i<str.length();i++) {
			str=new StringBuilder(String.valueOf(num1));
			if(str.charAt(i)=='9') {
				str.setCharAt(i, '6');
			}else {
				str.setCharAt(i, '9');
			}
			if(Integer.parseInt(str.toString())>max) {
				max=Integer.parseInt(str.toString());
			}
		}
		System.out.println(max);
		
	}
}
