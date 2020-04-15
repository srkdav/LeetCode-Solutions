package leetQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Q367ValidPerfectSquare {

	public static void main(String[] args) {

		int n = 99;
//		ArrayList<Integer> list = new ArrayList<Integer>();
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int i = 2;
		while (n != 1) {
			if (n % i == 0) {
				// list.add(i);
				if (hm.containsKey(i)) {
					int c = hm.get(i);
					c++;
					hm.put(i, c);
				} else {
					hm.put(i, 1);
				}
				n = n / i;
				i = 1;
			}
			i++;
		}
		System.out.println(hm);
		boolean flag=true;
		if (hm.size() == 1) {
			for (Entry<Integer, Integer> h : hm.entrySet()) {
				if(h.getValue()%2!=0){
					flag=false;
				}
			}
		}
		
		int b[] = new int[2];
		if(hm.size()==2){
			int x=0;
			for (Entry<Integer, Integer> h : hm.entrySet()) {
				b[x]=h.getValue();
				x++;
			}
		}
		if(b[0]!=b[1]){
			flag=false;
		}
		if(b[0]==b[1] && b[0]%2!=0){
			flag=false;
		}
	
		System.out.println(flag);
	}

}
