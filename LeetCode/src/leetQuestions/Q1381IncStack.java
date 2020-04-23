package leetQuestions;

import java.util.ArrayList;
import java.util.Stack;

public class Q1381IncStack {
	Stack<Integer> st = new Stack<Integer>();
	ArrayList<Integer> list = new ArrayList<Integer>();
	int maxSize;
//	int a[] = new int[maxSize];
	
	Q1381IncStack(int maxSize) {
		this.maxSize = maxSize;
	}

	public void push(int x) {
		if (st.size() < maxSize) {
			st.push(x);
			list.add(x);
		}
	}

	public int pop() {
		if(st.isEmpty()){
			return -1;
		}
		int x = st.pop();
		if (list.get(list.size() - 1) == x) {
			list.remove(list.size() - 1);
		}
		return x;
	}

	public void increment(int k, int val) {
		Stack<Integer> st1 = new Stack<Integer>();
		int limit = Math.min(st.size(), k);
		for (int i = 0; i < limit; i++) {
			int org=list.get(i);
			list.remove(i);
			list.add(i, org+val);
		}
		while(!st.isEmpty()){
			st1.push(st.pop());
		}
		for(Integer l:list){
			st.push(l);
		}
		if(st.size()<st1.size()){
			for(Integer l:list){
				st1.pop();
			}
			while(st.size()<st1.size()){
				st.push(st1.pop());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1381IncStack stack = new Q1381IncStack(3);
		stack.push(1);
		stack.push(2);
		stack.pop();
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.increment(5, 100);
		stack.increment(2, 100);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}

}
