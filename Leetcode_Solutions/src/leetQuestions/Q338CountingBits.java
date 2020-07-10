package leetQuestions;

public class Q338CountingBits {

	public static void countBits(int num) {
		int a[] = new int[num+1];
		a[0]=0;
		int offSet=1;
		for(int i=1;i<a.length;i++) {
			if(offSet *2 == i) {
				offSet= offSet*2;
			}
			a[i]=a[i-offSet]+1;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		countBits(5);
	}

}
