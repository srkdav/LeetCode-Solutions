package leetQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q1286IteratorCombo {

	String str;
	int n;

	List<String> list = new ArrayList<String>();

	Q1286IteratorCombo(String s, int l) {
		str = s;
		n = l;
		String res = "";
		getPermutation(s,-1,res);
		Collections.sort(list);
		
	}

	public void getPermutation(String a,int index,String res) {
		if (index == a.length()-1) {
			return;
		} else {
			for (int i = index+1; i<a.length(); i++) {
				res=res+a.charAt(i);
				if(res.length()==n){
					System.out.println(res);
				}
				getPermutation(a,i, res);
				res=res.substring(0, res.length()-1);
			}
		}
	}

	public String next() {
		if (list.size() != 0) {
			String ans= list.get(0);
			list.remove(0);
			return ans;
		} else {
			return "";
		}
	}

	public boolean hasNext(){
		if(list.size()>0){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1286IteratorCombo obj = new Q1286IteratorCombo("abc",2);
		System.out.println(obj.next());
		System.out.println(obj.next());
		System.out.println(obj.next());
		System.out.println(obj.hasNext());
	}

}
