package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q60PermutationSeq {
//
//	static int count = 0;
//
//	public static void permutateSeq1(List<Character> list, char a[], int n, int k) {
//		if (list.size() == n) {
//			count++;
//			if (count == k) {
//				String s = list.toString();
////				System.out.println(s);
//				StringBuilder s1 = new StringBuilder();
//				for (Character l : list) {
//					s1.append(l);
//				}
//				s = s1.toString();
//				System.out.println(s);
//			}
//			return;
//		} else {
//			for (int i = 0; i < a.length; i++) {
//				if (list.contains(a[i])) {
//					continue;
//				}
//				list.add(a[i]);
//				permutateSeq1(list, a, n, k);
//				list.remove(list.size() - 1);
//			}
//		}
//	}

	static int count=0;
	public static void findSeq(String str, List<Character> list, int idx) {
		if (list.size()==str.length()) {
			count++;
			if(count==3)
				System.out.println(list);
			return;
		} else {
			for (int i = 0; i < str.length(); i++) {
				if(list.contains(str.charAt(i))) {
					continue;
				}
				list.add(str.charAt(i));
				findSeq(str, list, i+1);
				list.remove(list.size()-1);
			}
		}
	}

	public static void findSeq2(int n,int k) {
//		String fStr="123456789";
//		String str = fStr.substring(0, n);
		int []fact = new int[n+1];
		fact[0]=1; //1 2 6 24
		int sum=1;
		List<Integer> num = new ArrayList<Integer>();
		for(int i=1;i<=n;i++) {
			sum=sum*(i);
			fact[i]=sum;
		}
		for(int i=1;i<=n;i++) {
			num.add(i);
		}
		StringBuilder sb = new StringBuilder();
		k--;
		for(int i=1;i<=n;i++) {
			int index = k/fact[n-i];
			sb.append(num.get(index));
			num.remove(index);
			k=k-(index*fact[n-i]);
		}
		System.out.println(sb.toString());
	}
	public static void main(String[] args) {

		findSeq2(4, 9);
	}

}
