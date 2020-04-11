package leetQuestions;

public class Q557ReverseWordsInStringIII {

	public static void main(String[] args) {
		String str1 = "Let's take LeetCode contest";
		String words[] = str1.split(" ");
		StringBuilder str2= new StringBuilder();
		for(String w:words) {
			str2.append(new StringBuffer(w).reverse().toString()+" ");
		}
		System.out.println(str2);
		

	}
}


//char a[] = new char[str.length()];
//for (int i = 0; i < str.length(); i++) {
//	a[i] = str.charAt(i);
//char t;
//char b[] = new char[]{'l','e','t','s'};
//for(int i=0;i<b.length/2;i++) {
//	t = b[i];
//	b[i] = b[b.length-1- i];
//	b[b.length-1- i] = t;
//}
//
//for (int j = 0; j < b.length; j++) {
//	System.out.print(b[j]);
//}
//
//}