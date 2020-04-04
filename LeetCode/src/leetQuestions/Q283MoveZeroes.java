package leetQuestions;

public class Q283MoveZeroes {
	// To Do
	static void swap(int a[], int x, int y) {
		int t = a[x];
		a[x] = a[y];
		a[y] = t;
	}

	public static void main(String[] args) {

		int a[] = new int[] { 0, 0, 3, 0, 5, 1, 0 };
		int j = 0;

		for (int i = 0; i < a.length - 1; i++) {
			j = 0;
			j = i + 1;
			while (a[j] == 0 && j < a.length - 1) {
				j++;
			}
			if (a[i] == 0 && a[j] != 0) {
				swap(a, i, j);
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}
	}
}

//
//if(a[i]==0 && a[i+1]!=0) 
//{
//	int t=a[i];
//	a[i]=a[i+1];
//	a[i+1]=t;
//}
//if(a[i]==0 && a[i+1]==0) 
//{
//	int x=i+2;
//	int t=a[i+1];
//	a[i+1]=a[x];
//	a[x]=t;
//	
//	
//}
