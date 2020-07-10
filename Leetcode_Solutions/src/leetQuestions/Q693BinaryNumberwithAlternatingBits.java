package leetQuestions;

public class Q693BinaryNumberwithAlternatingBits {

	public static void main(String[] args) {
	
		int n =5;
		String str = Integer.toBinaryString(n);
		boolean falg=false;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)!=str.charAt(i+1)) {
				continue;
			}else
				
				System.out.println("false");
			break;
		}
		}

}
