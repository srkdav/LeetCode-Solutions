package leetQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;

public class Q380Random {

	HashMap<Integer, Integer> hm = new LinkedHashMap<Integer, Integer>();
	Random random = new Random();
	List<Integer> list = new ArrayList<Integer>();

	public boolean insert(int k) {
		if (hm.containsKey(k)) {
			return false;
		}
		int size = list.size();
		hm.putIfAbsent(k, size);
		list.add(k);
		return true;

	}

	public boolean remove(int k) {
		if (hm.containsKey(k)) {
			int index = hm.get(k);
			if (index < list.size() - 1) {
				int last = list.get(list.size() - 1);
				list.set(index, last);
				hm.put(last, index);
			}
			hm.remove(k);
			list.remove(list.size() - 1);
			return true;
		} else {
			return false;
		}
	}

	public boolean randomRemove(int k) {
		if (hm.containsKey(k)) {
			int index = hm.get(k);
			int lastEle = 0;
			if (index < list.size() - 1) {
				lastEle = list.get(list.size() - 1);
				list.set(index, lastEle);

				hm.remove(k);
				hm.put(lastEle, index);
				list.remove(list.size() - 1);
			}else{
				hm.remove(k);
				list.remove(list.size() - 1);
			}
			return true;
		} else {
			return false;
		}

	}

	public void getRandom() {
		int x = random.nextInt(list.size());
		System.out.println(list.get(x));
	}

	public static void main(String[] args) {
		Q380Random q = new Q380Random();
		System.out.println(q.randomRemove(0));
		System.out.println(q.randomRemove(0));
		System.out.println(q.insert(0));
		q.getRandom();
		System.out.println(q.randomRemove(0));
		System.out.println(q.insert(0));

	}

}
