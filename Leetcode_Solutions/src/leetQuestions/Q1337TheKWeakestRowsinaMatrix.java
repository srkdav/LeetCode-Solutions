package leetQuestions;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Q1337TheKWeakestRowsinaMatrix {
    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<Integer, Integer> > list = 
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
            public int compare(Map.Entry<Integer, Integer> o1,  
                               Map.Entry<Integer, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>(); 
        for (Map.Entry<Integer, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    }
	public static void main(String[] args) {

		int[][] a = new int[][] {{1,1,0,0,0},
								{1,1,1,1,0},
								{1,0,0,0,0},
								{1,1,0,0,0},
								{1,1,1,1,1}};
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();	
	
		for(int row=0;row<a.length;row++) {
			int count=0;
			for(int col=0;col<a[row].length;col++) {
				if(a[row][col]==1) {
					count++;
				}
			}
		hm.put(row, count);
		}
		hm=sortByValue(hm);
		int k=3;
		int b[]= new int[k];
		int i=0;
		for(Integer key:hm.keySet()) {
			b[i]=key;
			i++;
			if(i==k) {
				break;
			}
		}
		for(int j=0;j<b.length;j++) {
			System.out.print(b[j]);
		}
	}

}
