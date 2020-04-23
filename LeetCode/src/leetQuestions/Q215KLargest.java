package leetQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q215KLargest {

	public static void main(String[] args) {

		int a[] = new int[]{3,2,3,1,2,4,5,5,6};
		int k=4;
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++){
			if(list.size()<k){
				list.add(a[i]);
			}else{
				int min= Integer.MAX_VALUE;
				int mini=-1;
				int q=0;
				for(Integer l:list){
					if(l<min){
						min=l;
						mini=q;
					}
					q++;
				}
				if(a[i]>min){
					list.remove(mini);
					list.add(a[i]);
				}
			}
		}
		Collections.sort(list);
		for(Integer l:list){
			System.out.print(l+" ");
		}
	}

}
