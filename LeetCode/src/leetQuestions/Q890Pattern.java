package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q890Pattern {

	// Test cases are wicked. Solution must be changed. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = new String[] {"abc","deq","mee","aqq","dkd","ccc"};
		String b = "abb";
		boolean flag = true;
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < a.length; i++) {
			flag = true;
			if (b.length() == a[i].length()) {
				for (int j = 0; j < b.length() - 1; j++) {
					if (b.charAt(j) == b.charAt(j + 1) && a[i].charAt(j) == a[i].charAt(j + 1)
							|| b.charAt(j) != b.charAt(j + 1) && a[i].charAt(j) != a[i].charAt(j + 1)) {
//						System.out.println(a[i]);
						continue;
					}
					if (b.charAt(j) != b.charAt(j + 1) && a[i].charAt(j) == a[i].charAt(j + 1)
							|| b.charAt(j) == b.charAt(j + 1) && a[i].charAt(j) != a[i].charAt(j + 1)) {
						flag = false;
						break;
					}
				}
				if (flag == true) {
					if (b.charAt(0) == b.charAt(b.length() - 1) && a[i].charAt(0) == a[i].charAt(a[i].length() - 1)
							|| b.charAt(0) != b.charAt(b.length() - 1)
									&& a[i].charAt(0) != a[i].charAt(a[i].length() - 1)) {

						flag = true;
					} else {
						flag = false;
					}
					if (flag == true) {
						list.add(a[i]);
					}
				}
			}
		}
		for (String l : list) {
			System.out.println("in list" + l);
		}
	}

}

//if (b.charAt(0) == b.charAt(b.length() - 1) && a[i].charAt(0) == a[i].charAt(a[i].length() - 1)) {
//	System.out.println(a[i]);
//	continue;
//}
//if (b.charAt(0) != b.charAt(b.length() - 1) && a[i].charAt(0) != a[i].charAt(a[i].length() - 1)) {
//	System.out.println(a[i]);
//	continue;
//}else {
//	flag=false;
//}