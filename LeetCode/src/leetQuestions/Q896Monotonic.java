package leetQuestions;

public class Q896Monotonic {

	public static void main(String[] args) {

		int a[] = new int[] { 1, 2 };

		int i = 0;
		boolean inc = false;
		boolean dec = false;
		for(i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]) {
				continue;
			}else {
				break;
			}
		}
		if (i + 1 < a.length) {
			if (a[i] < a[i + 1]) {
				inc = true;
			} else {
				dec = true;
			}
			if (inc == true) {
				for (; i < a.length - 1; i++) {
					if (a[i] <= a[i + 1]) {
						continue;
					} else {
						inc = false;// return false
						System.out.println(inc);
						break;
					}
				}

			}
			if (dec == true) {
				for (; i < a.length - 1; i++) {
					if (a[i] >= a[i + 1]) {
						continue;
					} else {
						dec = false;// return false
						System.out.println(dec);
						break;
					}
				}
			}
		}else {
//			return true;
		}
	}

}
