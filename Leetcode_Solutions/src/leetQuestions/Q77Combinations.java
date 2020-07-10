package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q77Combinations {

	
	public static void combineHelper(List<List<Integer>> ans,int n, int k, int idx, List<Integer> list) {
		if (k==0) {
			ans.add(new ArrayList<Integer>(list));
			return;
		} else {
			for (int i = idx; i <=n-k+1 ; i++) {
				list.add(i);
				combineHelper(ans,n, k-1, i + 1, list);
				list.remove(list.size() - 1);
			}
		}
	}

	public static void combine(int n, int k) {
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		combineHelper(ans,n, k, 1, list);
		System.out.println(ans);
	
	}

	public static void main(String[] args) {
		combine(4, 2);

	}

}
