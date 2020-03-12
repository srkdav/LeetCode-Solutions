package leetQuestions;

public class Q867TransposeMatrix {

	public static int[][] swap(int a[][], int b[], int c[]) {

		int t = a[b[0]][b[1]];
		a[b[0]][b[1]] = a[c[0]][c[1]];
		a[c[0]][c[1]] = t;
		return a;
	}

	public static void main(String[] args) {
		int a[][] = new int[][] { { 1, 2,3},{4,5,6},{7,8,9}  };

		if (a.length != a[0].length) {
			int m=a.length;
			int n=a[0].length;
			int k[][]=new int[n][m];
			int x[]= new int[n*m];
			int i=0;
			for(int row=0;row<a.length;row++) {
				for(int col=0;col<a[row].length;col++) {
					x[i]=a[row][col];
					i++;
				}
			}
			for(int j=0;j<x.length;j++) {
				System.out.print(x[j]+" ");
			}
			i=0;
			for(int y=0;y<k[0].length;y++) {
				for(int z=0;z<k.length;z++) {
					k[z][y]=x[i];
					i++;
				}
				
			}
			System.out.println("yep");
			for(int row=0;row<k.length;row++) {
				for(int col=0;col<k[row].length;col++) {
					System.out.print(k[row][col]+" ");
				}
				System.out.println();
			}
		
		} else {
//			int c[] = new int[] { i, j + i };
			int c[] = new int[2];
			for (int i = 0; i < a.length; i++) {
				int b[] = new int[] { i, i };
				for (int j = 0; j < a.length; j++) {
					if (j + i < a.length) {
						c[0]=i;
						c[1]=j+1;
						swap(a, b, c);
//						 c = new int[]{ j + i, i };
						c[0]=j+1;
						c[1]=i;
						swap(a, b, c);
//						c = new int[] { i, j + i };
						c[0]=i;
						c[1]=j+1;
						swap(a, b, c);
					}
				}
			}
		}

		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				System.out.print(a[row][col] + " ");
			}
			System.out.println();
		}
	}

}
