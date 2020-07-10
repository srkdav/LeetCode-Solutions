package leetQuestions;

import java.util.HashMap;

public class Q432AllDS {

	static HashMap<String, Integer> hm = new HashMap<>();
	static String max = null;
	static String min = null;

	public void inc(String key) {
		if (hm.containsKey(key)) {
			int val = hm.get(key);
			val++;
			hm.put(key, val);
			if (val > hm.get(max)) {
				max = key;
			}
			if (val < hm.get(min)) {
				min = key;
			}
		} else {
			hm.put(key, 1);
			if (max == null) {
				max = key;
			}
			if (min == null) {
				min = key;
			} else {
				int val = hm.get(min);
				if (val > 1) {
					min = key;
				}
			}
		}
	}

	public void dec(String key) {
		if (hm.containsKey(key)) {
			int val = hm.get(key);
			if (val == 1) {
				hm.remove(key);

			}

		} else {
			return;
		}
	}

	public static void main(String[] args) {

	}

}
