package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q198Robber {
	// List<Integer> l = new ArrayList<Integer>();
	static boolean flag = false;

	public static int findHouse(int[] a, int index) {
		if (index < 0) {
			return 0;
		}
		int x = findHouse(a, index - 2);
		int y = findHouse(a, index - 1);
		if (index != a.length - 1) {
			return Math.max(x + a[index], y);
		} else {
			if(x>y){
				
			}else{
				
			}
			return Math.max(x, y);
		}
	}

	public static void main(String[] args) {
		int[] a = new int[] { 11, 99, 10, 5 };
		System.out.println(findHouse(a, a.length - 1));
	}

}
