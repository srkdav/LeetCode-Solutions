package leetQuestions;

public class Q66PlusOne {

	public static void plusOne(int a[]) {
		if (a[a.length - 1] != 9) {
			a[a.length - 1]++;
		} else {
			if (a[0] != 9) {
				int i = a.length - 1;
				while (a[i] == 9) {
					a[i] = 0;
					i--;
				}
				a[i]++;
			} else {// 1299
				int[] ans1 = new int[a.length+1];
				ans1[0]=1;
				for (int i = 0; i < ans1.length; i++) {
					System.out.print(ans1[i] + " ");
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
//		int a[] = new int[] { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
//				9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
//				9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
		int a[]=new int[] {1,2,9,9};
		plusOne(a);

	}

}

//if(a[0]!=9) {
//	a[a.length-1] ++;
//}else {
//	StringBuilder str = new StringBuilder();
//	for(int i=0;i<a.length;i++) {
//		str.append(a[i]);
//	}
//	int ans = Integer.valueOf(str.toString());
//	ans=ans+1;
//	int ans1[]=new int[a.length+1];
//	int j=0;
//	while(ans>0) {
//		ans1[j]=ans%10;
//		ans=ans/10;
//	}
//	for(int i=0;i<ans1.length;i++) {
//		System.out.print(ans1[i]+" ");
//	}
