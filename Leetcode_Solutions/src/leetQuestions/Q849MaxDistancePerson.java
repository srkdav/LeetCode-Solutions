package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q849MaxDistancePerson {
	public static void main(String[] args) {

		int a[] = new int[] {0,1,0,0,0,0};
		int last=0;
		int first=0;
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			if(a[i]==1) {
				list.add(i);
			}
		}
		if(a[0]==0) {
			first=0;
		}
		if(a[a.length-1]==0) {
			last=a.length-1;
		}
		int max=0;
		int r=0;
		for(int x=0;x<list.size()-1;x++) {
			int l=list.get(x);
			r=list.get(x+1);
			if((r-l)/2>max){
				max= (r-l)/2;
			}
		}
		if(list.size()==1) {
			r=list.get(0);
		}
		if(last>r) {
			if((last-r)>max) {
				max=last-r;
			}
		}
		if(list.get(0)-first>max) {
			max=list.get(0)-first;
		}
		System.out.println(max);
	}

}
