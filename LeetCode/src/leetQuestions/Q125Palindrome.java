package leetQuestions;

public class Q125Palindrome {

	public static void main(String[] args) {

		String str1 = "423";
		String str = str1.toLowerCase();
		int i=0;
		int j=str.length()-1;
		while(i<j){
			Character l =str.charAt(i);
			Character r = str.charAt(j);
			if(!Character.isLetterOrDigit(l)){
				i++;
			}
			else if(!Character.isLetterOrDigit(r)){
				j--;
			}
			else if(l==r){
				i++;
				j--;
			}else{
				System.out.println(i);
				System.out.println(j);
				System.out.println((int)l);
				System.out.println((int)r);
				System.out.println("not same");
				break;
			}
			
		}
	}

}
