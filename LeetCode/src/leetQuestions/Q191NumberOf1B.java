package leetQuestions;

public class Q191NumberOf1B {

	public static void findOneBits(int n) {
		
		int count=0;
		while (n!=0) {
			n= n & n-1;
			count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {

		findOneBits(4);// 4 - 100 - 011
	}

}
