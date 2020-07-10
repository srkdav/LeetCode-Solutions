package leetQuestions;

import java.util.HashMap;

public class Q237NextGreaterElementI {

	public static void main(String[] args) {
		int[] num1 = new int[] { 4,1,2};
		int[] num2 = new int[] { 1,3,4,2 };
		int max=0;
		int max1=0;
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i=0;i<num2.length;i++) {
			hm.put(num2[i], i);
		}
		for(int i=0;i<num1.length;i++) {
			int count=0;
			if(max<num1[i]) {
				max=num1[i];
				max1=i;
			}
			int j=hm.get(num1[i]);
			for(int k=j;k<num2.length;k++) {
				if(num1[i]<num2[k]) {
					num1[i]=num2[k];
					count++;
					break;
				}
			}
			if(count==0) {
				num1[i]=-1;
		
			}
		}
		//num1[max1]=-1;
		for(int i=0;i<num1.length;i++) {
			System.out.print(num1[i]+" ");
		}
	}

}


//int k = 0;
//boolean check = false;
//for (int i = 0; i < num1.length; i++) {
//	for (int j = 0; j < num2.length; j++) {
//		if (check == true) {
//			check = false;
//			break;
//		}
//		if (num1[i] == num2[j]) {
//			for (k = j + 1; k < num2.length; k++) {
//				if (num2[k] > num1[i]) {
//					num1[i] = num2[k];
//					check = true;
//					break;
//				}
//			}
//			if (check != true) {
//				check = true;
//				num1[i] = -1;
//			}
//		}
//	}
//}
//for (int i = 0; i < num1.length; i++) {
//	System.out.print(num1[i] + " ");
//}
//}