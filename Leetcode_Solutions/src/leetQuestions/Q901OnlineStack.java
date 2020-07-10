package leetQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q901OnlineStack {

	static List<Integer> list = new ArrayList<Integer>();
	static Stack<Integer> st = new Stack<>();	
	public int next(int price){
		int i=list.size();
		list.add(price);
		if(st.isEmpty()){
			st.add(i);
			return 1;
		}else{
			while(!st.isEmpty() && list.get(st.peek())<=price){
				st.pop();
			}
			int t=-1;
			if(!st.isEmpty()){
			t=st.peek();
			}
			st.add(i);
			return i-t;
		}
		
	}
	public static void main(String[] args) {
		Q901OnlineStack s = new Q901OnlineStack();
		System.out.println(s.next(31));
		System.out.println(s.next(41));
		System.out.println(s.next(48));
		System.out.println(s.next(59));
		System.out.println(s.next(79));
//		System.out.println(s.next(75));
//		System.out.println(s.next(85));
		
	}

}
