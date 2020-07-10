package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q216ComboSum {

	public static void findCombo3(int a[],List<Integer> list,int target,int sum,int idx,int k,List<List<Integer>> ans){
		if(list.size()==k && sum==target){
			ans.add(new ArrayList<>(list));
		}
		for(int i=idx;i<a.length;i++){
			if(sum<target){
			list.add(a[i]);
			findCombo3(a, list, target, sum+a[i], i+1, k,ans);
			list.remove(list.size()-1);
			}
		}
	}
	public static void main(String[] args) {
		
		int a[] = new int[]{1,2,3,4,5,6,7,8,9};
		List<Integer> list = new ArrayList<Integer>();
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		findCombo3(a, list, 9, 0, 0, 3,ans);
		System.out.println(ans);
	}

}
