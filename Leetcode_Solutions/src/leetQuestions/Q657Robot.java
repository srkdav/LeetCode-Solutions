package leetQuestions;

public class Q657Robot {
	public static void main(String[] args) {
		int[] a = new int[] {0,0};
		int x=0;
		int y=0;
		String str = "UD";
		for(int i=0;i<str.length();i++) {
			switch(str.charAt(i)) {
			case 'R':
//				a[1]=a[1]+1;
				x++;
				break;
			case 'L':
//				a[1]=a[1]-1;
				x--;
				break;
			case 'U':
//				a[0]=a[0]+1;
				y++;
				break;
			case 'D':
//				a[0]=a[0]-1;
				y--;
				break;
			}
		}
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		if(x==0 && y==0) {
			System.out.println("same");
		}
	}
}


//if(str.charAt(i)=='R') {
//	a[1]=a[1]+1;
//}
//if(str.charAt(i)=='L') {
//	a[1]=a[1]-1;
//}
//if(str.charAt(i)=='U') {
//	a[0]=a[0]+1;
//}	
//if(str.charAt(i)=='D') {
//	a[0]=a[0]-1;
//}