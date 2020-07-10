package leetQuestions;

public class Q957PrisonCells {

	public static void findNDays(int num[], int n) {
		if(n>14) {
			n=(n-1)%14 +1;
		}
		int a[] = new int[num.length];
		int b[] = new int[num.length];
		for (int c = 0; c < a.length; c++) {
			a[c] = num[c];
		}
		int i = 0;
		while (i < n) {
			b[0] = 0;
			for (int j = 1; j < b.length - 1; j++) {
				if (a[j - 1] == a[j + 1]) {
					b[j] = 1;
				}else {
					b[j]=0;
				}
			}
			b[b.length-1] = 0;
			i++;
			a[0] = 0;
			for (int j = 1; j < a.length - 1; j++) {
				if (b[j - 1] == b[j + 1]) {
					a[j] = 1;
				}else {
					a[j]=0;
				}
			}
			a[a.length-1] = 0;
			i++;
		}
		if (n % 2 == 0) {
			System.out.println("a");
			for (int k = 0; k < a.length; k++) {
				System.out.print(a[k] + " ");
			}
		} else {
			System.out.println("b");
			for (int k = 0; k < b.length; k++) {
				System.out.print(b[k] + " ");
			}
		}
	}

	public static void main(String[] args) {
		int num[]=new int[] {0,1,0,1,1,0,0,1};
		findNDays(num, 15);
	}

}
