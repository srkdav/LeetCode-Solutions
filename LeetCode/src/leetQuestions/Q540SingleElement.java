package leetQuestions;

public class Q540SingleElement {

	static int single = 0;

	public static void findSingleElement(int a[], int low, int high) {
		if (high >= low) {
			int mid = low + (high - low) / 2;
			if(mid==0){
				if(a[mid]!=a[mid+1]){
					single=a[mid];
					return;
				}
			}else if(mid==a.length-1){
				if(a[mid]!=a[mid-1]){
					single=a[mid];
					return;
				}
			}
			else if (a[mid] != a[mid + 1] && a[mid - 1] != a[mid]) {
				single = a[mid];
				return;
			}
			if (mid % 2 == 0) {
				if (a[mid] == a[mid + 1]) {
					findSingleElement(a, mid + 1, high);
				} else if (a[mid - 1] == a[mid]) {
					findSingleElement(a, low, mid - 1);
				}
			} else {
				if (a[mid] == a[mid + 1]) {
					findSingleElement(a, low, mid - 1);
				} else if (a[mid - 1] == a[mid]) {
					findSingleElement(a, mid + 1, high);
				}
			}
		}

	}

	public static void main(String[] args) {

		int a[] = new int[] { 2,2,3};
		
		findSingleElement(a, 0, a.length - 1);
		System.out.println(single);
	}

}
