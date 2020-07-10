package leetQuestions;

import java.util.Stack;

public class Q921ParenthesesValid {

	public static void main(String[] args) {
		
		String s = ")(()";
		int lb=0,rb=0;
		for(int i=0;i<s.charAt(i);i++){
			if(s.charAt(i)=='('){
				lb++;
			}
			if(s.charAt(i)==')'){
				if(lb>0){
					lb--;
//					rb--;
				}else{
					rb++;
				}
			}
		}
		System.out.println(lb+rb);
	}

}
