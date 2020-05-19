package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q60PermutationSeq {

	static int count=0;
	public static void permutateSeq1(List<Character> list, char a[], int n, int k) {
		if (list.size() == n) {
			count++;
			if(count==k){
				String s = list.toString();
//				System.out.println(s);
				StringBuilder s1 = new StringBuilder();
				for(Character l:list){
					s1.append(l);
				}
				s=s1.toString();
				System.out.println(s);
			}
			return;
		} else {
			for (int i = 0; i < a.length; i++) {
				if (list.contains(a[i])) {
					continue;
				}
				list.add(a[i]);
				permutateSeq1(list, a, n, k);
				list.remove(list.size() - 1);
			}
		}
	}

	public static void main(String[] args) {

		String str = "123456789";
		List<Character> list = new ArrayList<Character>();
		// permutateSeq(a, 0);
		int k=9;
		int n=4;
		char a[] = str.substring(0, n).toCharArray();
		permutateSeq1(list, a, n, k);

	}

}
