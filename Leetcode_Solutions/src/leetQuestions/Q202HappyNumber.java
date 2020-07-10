package leetQuestions;

import java.util.HashSet;

public class Q202HappyNumber {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>(); 
		int n = 123;
		int sum = 0;
		int p = 0;
		boolean flag=true;
		while (sum != 1) {
			sum=0;
			while (n != 0) {
				p = n % 10;
				n = n / 10;
				sum = sum + (p * p);
			
			}
			if(sum==1) {
				flag=true;
				break;
			}
			if(hs.contains(sum)) {
				flag=false;
				break;
			}else {
				hs.add(sum);
			}
			n=sum;
		}
		System.out.println(flag);
	}

}
