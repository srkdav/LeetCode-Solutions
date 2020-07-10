package leetQuestions;

public class Q682BaseballGame {
//Runtime error- will retry.
	public static void main(String[] args) {
		String[] a = new String[] {"5","2","C","D","+" };
		int[] b = new int[1000];
		int j = 0; // 5 10
		// System.out.println(Integer.parseInt(a[4]));
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == "C") {
				if(j>1) {
					sum=sum-b[j-1];
				}	
				j--;
				b[j] = 0;
					
				continue;
			}
			if (a[i] == "D") {
				b[j] = 2 * b[j - 1];
				sum=sum+b[j];
				j++;
				continue;
			}
			if (a[i] == "+") {
				
				if(j>1) {
					b[j]=b[j-1]+b[j-2];
				}
				sum=sum+b[j];
				j++;

			} else {
				int k = Integer.parseInt(a[i]);
				b[j] = k;
				sum=sum+b[j];
				j++;

			}
		}
		System.out.println(sum);
	}

}
