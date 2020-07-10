package leetQuestions;

public class Day14LCChallenge {

	public static void main(String[] args) {

		String s = "abcdefg";
		int[][] a = new int[][] {{1,1},{1,1},{0,2},{1,3}};
		StringBuilder str = new StringBuilder(s);
		for(int row=0;row<a.length;row++) {
			if(a[row][0]==0) {
				int x = a[row][1];
				while(x!=0) {
					char c= str.charAt(0);
					str.deleteCharAt(0);
					str.append(c);
					x--;
				}
			}
			else {
				int x=a[row][1];
				while(x!=0) {
					char c = str.charAt(str.length()-1);
					str.deleteCharAt(str.length()-1);
					str.insert(0, c);
					x--;
				}
			}
		}
		System.out.println(str);
	}

}
