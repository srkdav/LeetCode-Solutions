package leetQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1268SearchSugg {

	public static void main(String[] args) {

		 String[] a = new String[] { "mobile", "mouse", "moneypot", "monitor",
		 "mousepad" };
//		String[] a = new String[] { "bags", "baggage", "banner", "box", "cloths" };
		Arrays.sort(a);
		// for (int t = 0; t < a.length; t++) {
		// System.out.print(a[t] + " ");
		// }
		// mobile moneypot monitor mouse mousepad
		String b = "mouse";
		List<List<String>> list = new ArrayList<List<String>>();
		for (int i = 0; i < b.length(); i++) {
			List<String> list1 = new ArrayList<String>();
			for (int j = 0; j < a.length; j++) {
				if (list1.size() < 3) {
					if (b.substring(0, i + 1).length() <= a[j].length()) {
						if (b.substring(0, i + 1).equals(a[j].substring(0, i + 1))) {
							list1.add(a[j]);
						}
					}
				}
			}
			list.add(list1);
		}

		System.out.println(list);
	}

}
