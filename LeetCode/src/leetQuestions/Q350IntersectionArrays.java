package leetQuestions;

import java.util.Arrays;

//to do
public class Q350IntersectionArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[] = new int[] {1,2,2,1 }; // 4 5 9 
		int a2[] = new int[] {2,2 };// 4 4 8 9 9 
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		int size =0;
		if(a1.length>a2.length) {
			size=a1.length;
		}else {
			size = a2.length;
		}
		int a3[] = new int[size];
		Arrays.fill(a3, Integer.MIN_VALUE);
		int m=0;
		int k=0;
		for(int i=0;i<a1.length;i++) {
			for(int j=m;j<a2.length;j++) {
				if(a1[i]==a2[j]) {
					m++;
					a3[k]=a1[i];
					k++;
					break;
				}
				if(a1[i]<a2[j]) {
					break;
				}
			}
		}
		for(int z=0;z<a3.length;z++) {
			System.out.print(a3[z]+" ");
		}
	}

}
