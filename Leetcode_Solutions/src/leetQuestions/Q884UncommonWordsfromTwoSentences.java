package leetQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q884UncommonWordsfromTwoSentences {

	public static void main(String[] args) {
	
	String a= "xf tyl xf ";
	String b="gw p gw xf ";
	
	String[] words = a.split("\\s+");
	HashMap<String, Integer> hm= new HashMap<>();
	HashMap<String, Integer> hm1= new HashMap<>();
	
	for (int i = 0; i < words.length; i++) {
	    words[i] = words[i].replaceAll("[^\\w]", "");
	}
	String[] words1 = b.split("\\s+");
	
	for (int i = 0; i < words1.length; i++) {
		words1[i] = words1[i].replaceAll("[^\\w]", "");
	}
	for(int i=0;i<words.length;i++) {
		if(hm.containsKey(words[i])) {
			int count= hm.get(words[i]);
			count++;
			hm.replace(words[i], count);
		}
		else {
		hm.put(words[i],1);
		}
	}
	
	for(int i=0;i<words1.length;i++) {
		if(hm1.containsKey(words1[i])) {
			int count= hm1.get(words1[i]);
			count++;
			hm1.replace(words1[i], count);
		}
		else {
		hm1.put(words1[i],1);
		}
	}
	
	List<String> list = new ArrayList<String>();
	for(String key:hm.keySet()) {
		if(hm1.containsKey(key)) {
		//	System.out.println(key+ " yes");
		}
		else {
			if(hm.get(key)>1) {
				continue;
			}
			else
			list.add(key);
		}
		
	}
	for(String key:hm1.keySet()) {
		if(hm.containsKey(key)) {
			//System.out.println(key+ " yes");
		}
		else {
			if(hm1.get(key)>1) {
				continue;
			}
			else
			list.add(key);
		}
	}
	
	String[] fin = new String[list.size()];
	int i=0;
	for(String l:list) {
		System.out.println(l);
		fin[i]=l;
		i++;
	}
	
	
	}

}
