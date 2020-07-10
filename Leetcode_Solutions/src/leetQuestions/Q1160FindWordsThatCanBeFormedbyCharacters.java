package leetQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q1160FindWordsThatCanBeFormedbyCharacters {

	public static void main(String[] args) {

//		String[] words = new String[] {"dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin","ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb","ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl","boygirdlggnh","xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx","nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop","hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx","juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr","lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo","oxgaskztzroxuntiwlfyufddl","tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp","qnagrpfzlyrouolqquytwnwnsqnmuzphne","eeilfdaookieawrrbvtnqfzcricvhpiv","sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz","yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue","hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv","cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo","teyygdmmyadppuopvqdodaczob","qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs","qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs"};
		String[] words = new String[] {"aaa"};
		String a = "abcd";
		HashMap<Character, Integer> hm = new HashMap<>();

		for (int i = 0; i < a.length(); i++) {
			if (hm.containsKey(a.charAt(i))) {
				int c = hm.get(a.charAt(i));
				c++;
				hm.put(a.charAt(i), c);
			} else {
				hm.put(a.charAt(i), 1);
			}
		}
		List<String> list = new ArrayList<String>();
		System.out.println(hm);
		for (int j = 0; j < words.length; j++) {
			HashMap<Character, Integer> hm1 = new HashMap<>(hm);
		
			boolean flag=true;
			for (int i = 0; i < words[j].length(); i++) {
				if (hm1.containsKey(words[j].charAt(i))) {
					int c = hm1.get(words[j].charAt(i));
					c--;
					if(c<0) {
						flag=false;
						break;
					}
					hm1.replace(words[j].charAt(i), c);
				} else {
					flag=false;
					break;
				}				
			}
			if(flag==true) {
				list.add(words[j]);
			}
		}
		int sum=0;
		for(String l:list) {
			System.out.println(l);
			sum= l.length()+sum;
		}
		System.out.println(sum);
	}

}
