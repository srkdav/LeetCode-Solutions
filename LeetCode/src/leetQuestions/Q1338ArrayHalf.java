package leetQuestions;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Q1338ArrayHalf {

	public static HashMap<Integer,Integer> sortByVal(HashMap<Integer,Integer> hm){
	
		List<Map.Entry<Integer,Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(hm.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>(){
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer,Integer> o2)
			{
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});
		HashMap<Integer,Integer> temp = new LinkedHashMap<Integer,Integer>();
		for(Map.Entry<Integer, Integer> a:list){
			temp.put(a.getKey(), a.getValue());
		}
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[]{7,7,7,7,7,7};
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++){
			if(hm.containsKey(a[i])){
				int c = hm.get(a[i]);
				c++;
				hm.put(a[i], c);
			}else{
				hm.put(a[i], 1);
			}
		}
		hm=sortByVal(hm);
		int origSize = a.length;
		int newSize=0;
		int count=0;
		for(Map.Entry<Integer, Integer> h:hm.entrySet()){
			if(newSize>=a.length/2){
				break;
			}else{
				newSize=newSize+h.getValue();
				count++;
			}
		}
		System.out.println(count);
		System.out.println(hm);
	}

}
