package leetQuestions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q349IntersectionOf2Arrays {

	public static void main(String[] args) {
		
		int num1[]=new int[] {1,2,2,1};
		int num2[]=new int[] {9,4,9,8,4};
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		for(int i=0;i<num1.length;i++) {
			set1.add(num1[i]);
		}
		for(int i=0;i<num2.length;i++) {
			set2.add(num2[i]);
		}
		set1.retainAll(set2);
		int[] num3=new int[set1.size()];	
		int i=0;
		for(Integer x: set1) {
			num3[i++]=x;
		}
	}

}


//List<Integer> list = new ArrayList();
//int count=0;
//for(int i=0;i<num1.length;i++) {
//	for(int j=0;j<num2.length;j++) {
//		if(num1[i]==num2[j]) {
//			if(!list.contains(num1[i]))
//			{
//			list.add(num1[i]);
//			break;
//			}
//		}
//	}
//}
//for(Integer l:list) {
//	System.out.print(l+" ");
//}
