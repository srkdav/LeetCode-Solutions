package leetQuestions;

public class Q1004MaxOnes2 {

	public static void findMaxCountOnes(int a[],int k) {
		int end=0,start=0,max=0,zero=0;
		for(end=0;end<a.length;end++) {
			if(a[end]==0) {
				zero++;
			}
			while(zero>k) {
				if(a[start]==0) {
					zero--;
				}
				start++;
			}
			max=Math.max(max, end-start+1);
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		int a[]=new int[] {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
		findMaxCountOnes(a, 3);
	}

}
