package leetQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Day28LLCChallenge {

	HashMap<Integer,Integer> hm = new LinkedHashMap<Integer,Integer>();
	
	public Day28LLCChallenge(int[] a){
		for(int i=0;i<a.length;i++){
			if(hm.containsKey(a[i])){
				int c = hm.get(a[i]);
				c++;
				hm.put(a[i], c);
			}else{
				hm.put(a[i], 1);
			}
		}
	}
	public void add(int value){
		if(hm.containsKey(value)){
			int c = hm.get(value);
			c++;
			hm.put(value, c);
		}else{
			hm.put(value, 1);
		}
	}
	
	public int showFirstUnique(){
		Set<Integer> keys = hm.keySet();
		for(Integer k:keys){
			if(hm.get(k)==1){
				return k;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
	
		Day28LLCChallenge d = new Day28LLCChallenge(new int[]{2,3,5});
		System.out.println(d.showFirstUnique());
		d.add(5);
		System.out.println(d.showFirstUnique());
		d.add(2);
		System.out.println(d.showFirstUnique());
		d.add(3);
		System.out.println(d.showFirstUnique());
	}

}
