package leetQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q115MinStack {
	int min = Integer.MAX_VALUE;
	Stack<Integer> stack = new Stack<Integer>();
	List<Integer> list= new ArrayList<Integer>();

	public Q115MinStack(){
			
	}
	public void push(int x) {
		if (x<min) {
			min = x;
			list.add(x);
		}
		if(list.isEmpty()) {
			list.add(x);
			min=x;
		}
		stack.push(x);
	}

	public void pop() {
		int x = stack.pop();
		if(list.get(list.size()-1)==x) {
			list.remove(list.size()-1);
		}
		if(!list.isEmpty()) {
			min = list.get(list.size()-1);
		}
	}

	public int top() {
		return stack.peek();

	}

	public int getMin() {
		if(!list.isEmpty())
		return list.get(list.size()-1);
		else
			return min;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q115MinStack st = new Q115MinStack();
		st.push(395);
		System.out.println(st.getMin());
		System.out.println(st.top());
		System.out.println(st.getMin());
		st.push(276);
		st.push(29);
		System.out.println(st.getMin());
		st.push(-482);
		System.out.println(st.getMin());
		st.pop();
		st.push(-108);
		st.push(-251);
		System.out.println(st.getMin());
		st.pop();
		st.push(-439);
		System.out.println(st.getMin()); //
	}
	
	

}
