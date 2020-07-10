package leetQuestions;

import java.util.HashMap;
import java.util.HashSet;

//to do
public class Q1189Balloons {

	public static void main(String[] args) {

		String str = "qqqbalon";
		HashSet<Character> hs = new HashSet<Character>();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		String str1 = "balloon";
		for (int i = 0; i < str1.length(); i++) {
			hs.add(str1.charAt(i));
			if (!hm.containsKey(str1.charAt(i))) {
				hm.put(str1.charAt(i), 0);
			} else {
				int c = hm.get(str1.charAt(i));
				c++;
				hm.replace(str1.charAt(i), c);
			}

		}

		int min = Integer.MAX_VALUE;
		int[] c = new int[26];
		for (int i = 0; i < str.length(); i++) {
			if (hs.contains(str.charAt(i))) {
				c[(int) str.charAt(i) - 'a']++;
			}
		}


		int count = 5;
		int j = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] != 0) {
				j++;
			}
			if (c[i] < min && c[i] != 0) {
				int x = (char) i;
				char b = (char) ((char) x + 'a');
				int y = hm.get(b);
				if (y <= c[i]) {
					min = c[i];
					j++;
				} else {
					System.out.println("not possible");
					break;
				}
			}
		}
		if (j < count) {
			System.out.println(0);
		} else {
			System.out.println(min);
		}

	}

}
