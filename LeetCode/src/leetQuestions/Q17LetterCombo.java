package leetQuestions;

import java.util.HashMap;
import java.util.List;

public class Q17LetterCombo {

	char a[] = new char[]{'a','b','c'};
	char b[] = new char[]{'d','e','f'};
	
	public void backTrack(char a[],List<Character> temp){
		if (temp.size() == a.length) {
			
		} else {
			for (int i = 0; i < a.length; i++) {
				if (temp.contains(a[i])) {
					continue;
				}
				temp.add(a[i]);
				backTrack(a, temp);
				temp.remove(temp.size()-1);
			}
		}
	}
	
	public static void backTrack2(String letter,String str,HashMap<String,String> hm){
		if(str.length()==0){
			System.out.println(letter);
			return;
		}else{
			String l = str.substring(0, 1);
			String combo = hm.get(l);
			for(int i=0;i<combo.length();i++){
				String ans = combo.substring(i, i+1);
				backTrack2(letter+ans, str.substring(1,str.length()),hm);
			}
		}
	}
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("2", "abc");
		hm.put("3", "def");
		backTrack2("", "23",hm);
		
	}

}
