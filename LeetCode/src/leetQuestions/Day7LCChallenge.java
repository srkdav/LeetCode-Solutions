package leetQuestions;

import java.util.Arrays;

public class Day7LCChallenge {

	public static void main(String[] args) {
	
		int[] a = new int[] {1,1,2,2};
		Arrays.sort(a);
		//a = [0 1 2 3 3 5]
		int count=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+1==a[j]) {
					count++;
					break;
				}
				if(a[i]+1<a[j]) {
					break;
				}
			}
		}
		System.out.println(count);
	}

}
