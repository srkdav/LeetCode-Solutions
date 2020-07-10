package leetQuestions;

public class Q762PrimeNumberofSetBitsinBinaryRepresentation {

	public static void main(String[] args) {

		int n = 12;
//		String str = Integer.toBinaryString(n);
//		System.out.println(str);
		int l = 842;
		int r = 888;
		int prime = 0;
		int count = 0;
		boolean flag=false;
		for (int i = l; i <= r; i++) {
			flag=false;
			count=0;
			String str = Integer.toBinaryString(i);
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '1') {
					count++;
				}
			}
			if(count==1) {
				continue; 
			}
			for (int k = 2; k <= count / 2; k++) {
				if (count % k == 0) 
				{
					flag=true;
				}
			}
			if(flag==false) {
			prime++;
			}
		}
		System.out.println(prime);
	}

}
