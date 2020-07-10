package leetQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q412FizzBuzz {

	public static void main(String[] main) {

		int n = 15;
		List<String> list = new ArrayList<String>();
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		hm.put(3, "Fizz");
		hm.put(5, "Buzz");
		hm.put(7, "Jazz");
		for (int i = 1; i <= n; i++) {
			String numAns = "";
			for(Integer key:hm.keySet()) {
				if(i%key==0) {
					numAns += hm.get(key);
				}
			}
			if(numAns.equals("")) {
				numAns += Integer.toString(i);
			}
			list.add(numAns);		
		}

		for (String l : list) {
			System.out.print(l + " ");
		}

	}
}
