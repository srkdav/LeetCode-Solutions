package leetQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Q438FindAnagrams {

	public static void count(String a, String b) {
		HashMap<Character, List<Integer>> hm1 = new LinkedHashMap<Character, List<Integer>>();
		HashMap<Character, List<Integer>> hm2 = new HashMap<Character, List<Integer>>();
		for (int i = 0; i < a.length(); i++) {
			if (!hm1.containsKey(a.charAt(i))) {
				List<Integer> list = new ArrayList<Integer>();
				list.add(i);
				hm1.put(a.charAt(i), list);
			} else {
				List<Integer> list = hm1.get(a.charAt(i));
				list.add(i);
				hm1.put(a.charAt(i), list);
			}
		}

		for (int i = 0; i < b.length(); i++) {
			if (!hm2.containsKey(b.charAt(i))) {
				List<Integer> list = new ArrayList<Integer>();
				list.add(i);
				hm2.put(b.charAt(i), list);
			} else {
				List<Integer> list = hm2.get(b.charAt(i));
				list.add(i);
				hm2.put(b.charAt(i), list);
			}
		}

		int count = 0;
		boolean flag = true;
		StringBuilder str = new StringBuilder(b);
		HashMap<Character, List<Integer>> hm3 = new HashMap<Character, List<Integer>>();
		for (Entry<Character, List<Integer>> h : hm2.entrySet()) {
			hm3.put(h.getKey(), h.getValue());
		}

		for (int i = 0; i < a.length(); i++) {
			if (!hm3.containsKey(a.charAt(i))) {
				flag = false;
				continue;
			} else {
				if (flag) {
					List<Integer> list3 = hm2.get(a.charAt(i));
					list3.remove(0);
					flag = true;
					boolean flag1 = true;
					for (Entry<Character, List<Integer>> h : hm2.entrySet()) {
						for (Integer l : h.getValue()) {
							if (l != 0) {
								flag1 = false;
							}
						}
					}
					if (flag1) {
						count++;
						for (Entry<Character, List<Integer>> h : hm3.entrySet()) {
							hm2.put(h.getKey(), h.getValue());
						}
					}
				}
			}
		}
		System.out.println(count);
	}

	public static void findCount2(String a,String b){
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for(Character c:b.toCharArray()){
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		int count = hm.size();
		int begin=0,end=0;
		int len = Integer.MAX_VALUE;
		while(end<a.length()){
			char c = a.charAt(end);
			if(hm.containsKey(c)){
				hm.put(c, hm.get(c)-1);
				if(hm.size()==0){
					count--;
				}
				end++;
			}
			while(count==0){
				char temp = a.charAt(begin);
				if(hm.containsKey(temp)){
					hm.put(temp, hm.get(temp)+1);
					if(hm.get(temp)>0){
						count++;
					}
				}
				if(end-begin==b.length()){
					System.out.println(begin);
				}
				begin++;
			}
		}
	}
	public static List<Integer> findAnagrams(String s, String t) {
        List<Integer> result = new LinkedList<>();
        if(t.length()> s.length()) return result;
        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int counter = map.size();
        
        int begin = 0, end = 0;
        
        
        while(end < s.length()){
            char c = s.charAt(end);
            if( map.containsKey(c) ){
                map.put(c, map.get(c)-1);
                if(map.get(c) == 0) counter--;
            }
            end++;
            
            while(counter == 0){
                char tempc = s.charAt(begin);
                if(map.containsKey(tempc)){
                    map.put(tempc, map.get(tempc) + 1);
                    if(map.get(tempc) > 0){
                        counter++;
                    }
                }
                if(end-begin == t.length()){
                    result.add(begin);
                }
                begin++;
            }
            
        }
        return result;
    }
	
	public static void findAnagrams2(String s,String t){
		if(s.length()<t.length()){
			
		}
		Map<Character,Integer> hm = new HashMap<Character,Integer>();
		for(int i=0;i<t.length();i++){
			if(hm.containsKey(t.charAt(i))){
				int c = hm.get(t.charAt(i));
				c++;
				hm.put(t.charAt(i), c);
			}else{
				hm.put(t.charAt(i), 1);
			}
		}
		int start=0,end=0;
		int count=hm.size();
		List<Integer> list = new ArrayList<Integer>();
		while(end<s.length()){
			if(hm.containsKey(s.charAt(end))){
				int c= hm.get(s.charAt(end));
				c--;
				if(c==0){
					count--;
				}
				hm.put(s.charAt(end), c);
			}
			while(count==0){
				if(hm.containsKey(s.charAt(start))){
					int c= hm.get(s.charAt(start));
					if(c==0){
						count++;
					}
					c++;
					hm.put(s.charAt(start), c);
				}
				if(end-start==t.length()-1){
					list.add(start);
				}
				start++;
			}
			end++;
		}
		System.out.println(list);
	}
	public static void main(String[] args) {

		String a = "aabcabaa";
		String b = "aabc";
		findAnagrams2(a, b);
	}

}
