package leetQuestions;

import java.util.HashMap;

public class Q166Fraction {

	public static void main(String[] args) {

		int n=11;
		int d=3;
		int r=1;
		HashMap<Integer,Integer> hm = new HashMap<>();
		while(r!=0){
			r=n%d;
			if(hm.containsKey(r)){
				int c = hm.get(r);
				c++;
//				hm.put(arg0, arg1)
			}
		}
	}

}
