package leetQuestions;

import java.util.Stack;

public class Q461Hamming {
	public static void main(String[] args) {
	int n=1;
	String s1=Integer.toBinaryString(n);
	int m=4;
	String s2=Integer.toBinaryString(m);
	//System.out.println(Integer.toBinaryString(m));
	int[] a1 = new int[4];
	int[] a2 = new int[4];
	for(int i=0;i<a2.length;i++) {
		if(i>=s2.length()) {
			a2[i]=0;
		}
		else
		a2[i]=s2.charAt(i);
	}
	for(int i=0;i<a2.length;i++) {
		System.out.println(i+" "+a2[i]);
	}
	}
}

//Stack<Integer> stack1 = new Stack<Integer>();
//while(n!=0) {
//	int d = n%2;
//	stack1.push(d);
//	n=n/2;
//}
//
//int m=4;
//Stack<Integer> stack2 = new Stack<Integer>();
//while(m!=0) {
//	int d = m%2;
//	stack2.push(d);
//	m=m/2;
//}
//int[] arr1 = new int[4];
//int[] arr2 = new int[4];
//for(int i=0;i<arr1.length;i++) {
//	if(stack1.size()==0) {
//		arr1[i]=0;
//	}else
//	arr1[i]=stack1.pop();
//}
//for(int i=0;i<arr2.length;i++) {
//	if(stack2.size()==0) {
//		arr2[i]=0;
//	}else
//	arr2[i]=stack2.pop();
//}
//for(int i=0;i<arr1.length;i++) {
//	System.out.print(arr1[i]);
//} 		
//for(int i=0;i<arr2.length;i++) {
//	System.out.print(arr2[i]);
//}
////System.out.println(arr2.length);
//}
