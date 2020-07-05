package leetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q70Stairs {

	static int count = 0;

	public static int findCount(int start, int target, int[] mem) {
		if (start > target) {
			return 0;
		}
		if (start == target) {
			count++;
			return 1;
		}
		mem[start] = findCount(start + 1, target, mem) + findCount(start + 2, target, mem);
		return mem[start];
	}

	public static void main(String[] args) {
		int[] mem = new int[5];
		findCount(0, 4,mem);
		System.out.println(count);

	}

}
