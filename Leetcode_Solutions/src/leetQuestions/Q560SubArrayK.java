package leetQuestions;

import java.util.HashMap;

public class Q560SubArrayK {

	public static void main(String[] args) {
	
		int a[] = new int[]{1,2,3,3,2,1};
		int k=6 ;
        int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
		System.out.println(count);
	}

}
