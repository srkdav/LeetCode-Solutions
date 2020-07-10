package leetQuestions;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Q11Container {
	
	public static void findMaxArea(int a[]) {
		int low=0;
		int high=a.length-1;
		int maxArea = Integer.MIN_VALUE;
		while(low<=high) {
			maxArea=Math.max(maxArea, Math.min(a[low], a[high])*(high-low));
			if(a[low]<a[high]) {
				low++;
			}else {
				high--;
			}
		}
		System.out.println(maxArea);
	}
	public static void main(String[] args) {
		
		int a[] = new int[] {1,1,6,2,5,4,8,1,1};
		findMaxArea(a);
	}

}
