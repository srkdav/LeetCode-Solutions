package leetQuestions;

public class Q53MaximumSubArray {

	public static void main(String[] args) {

		int a[] = new int[] {-2,1};
	}
}

// O(N ^ 2) solution
//int sum = 0;
//int max = Integer.MIN_VALUE;
//for (int i = 0; i < a.length - 1; i++) {
//	sum = 0;
//	if (a[i] > max) {
//		max = a[i];
//	}
//	for (int j = i ; j < a.length; j++) {
//		sum = sum + a[j];
//		if (sum > max) {
//			max = sum;
//		}
//	}
//}
// if(a[a.length-1]>max){
//        max=a[a.length-1];
//    }
//System.out.println(max);
//}
