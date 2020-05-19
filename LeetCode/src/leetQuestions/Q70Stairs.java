package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q70Stairs {

	public static int findCount(int i,int sum){
		if(i>sum){
			return 0;
		}
		if(i==sum){
			return 1;
		}
		int x=findCount(i+1,sum);
		int y=findCount(i+2, sum);
		return x+y;
	}
	public static void main(String[] args) {
		System.out.println(findCount(0, 3));
		
		
	}

}
