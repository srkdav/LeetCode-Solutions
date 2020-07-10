package leetQuestions;

public class Q724PivotIndex {

	public static void main(String[] args) {

		int a[] = new int[] {1,0};

		for(int i=0;i<a.length;i++) {
			int sumr=0;
			int suml=0;
			for(int p=0;p<i;p++) {
				suml=suml+a[p];
			}
			for(int q=i+1;q<a.length;q++) {
				sumr=sumr+a[q];
			}
			if(suml==sumr) {
				System.out.println(i);
			}
		}
	}

}
