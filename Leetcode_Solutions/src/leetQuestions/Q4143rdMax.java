package leetQuestions;

public class Q4143rdMax {

	static void swap(int a, int b) {
		int t = a;
		a = b;
		b = t;
	}

	public static void main(String[] args) {
		int a[] = new int[] {-2147483648,1,1};
		int c=0;
		int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max1) {
				if (max2 != Integer.MIN_VALUE || max3 != Integer.MIN_VALUE) {
					int p = max2;
					max3 = p;
					max2 = a[i];
				}
				int t = max1;
				max2 = t;
				max1 = a[i];
				continue;
			}
			if (a[i] > max2 && a[i] <= max1) {
				int t = max2;
				c++;
				max3 = t;
				max2 = a[i];
				continue;
			}
			if (a[i]<= max2 && a[i] >=max3) {
				max3 = a[i];
				c++;
				continue;
			}
		}
		if(max2==max3 && max2!=Integer.MIN_VALUE) {
			
		}
		if (max3 != Integer.MIN_VALUE || c>0) {
			System.out.println(max3);
		}
		if (max3 == Integer.MIN_VALUE) {
			System.out.println(max1);
		}

	}

}
