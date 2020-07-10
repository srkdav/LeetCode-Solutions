package leetQuestions;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Q146LRUCache {

	LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<Integer, Integer>();
	int size = 0;

	public Q146LRUCache(int capacity) {
		size = capacity;
	}

	public void put(int key, int value) {
		if (hm.size() < size) {
			hm.put(key, value);
		} else {
			if (hm.containsKey(key)) {
				hm.remove(key);
				hm.put(key, value);
			} else {
				int fk = 0;
				Set<Integer> keys = hm.keySet();
				for (Integer k : keys) {
					fk = k;
					break;
				}
				hm.remove(fk);
				hm.put(key, value);
			}
		}
	}

	public int get(int key) {
		if (hm.containsKey(key)) {
			int v = hm.get(key);
			hm.remove(key);
			hm.put(key, v);
			return hm.get(key);
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		Q146LRUCache cache = new Q146LRUCache(2);
		cache.put(2, 6);
		System.out.println(cache.get(1));
		cache.put(1, 5);
		cache.put(1, 2);
		System.out.println(cache.get(1));
		System.out.println(cache.get(2));
		// System.out.println(cache.get(3));
		// System.out.println(cache.get(4));

	}

}
