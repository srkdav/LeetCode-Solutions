package leetQuestions;

public class Q268MissingNumber {

	public static void main(String[] args) {

		int [] a = new int[] {9,6,4,2,3,5,7,0,1};
		int count=0;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			count++;
			sum=sum+a[i];
		}
		System.out.println((count*(count+1)/2)-sum);
	}

}
