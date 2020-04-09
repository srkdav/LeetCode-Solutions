package leetQuestions;

public class Q696CountBinSub {

	public static void main(String[] args) {
		String str = "1011001001";
		for(int i=0;i<str.length();i++) {
			int count=1;
			// to do linear time
		}
		
	}

}


//N ^ 2 solution
//int c=0;
//for(int i=0;i<str.length();i++) {
//	int count=1;
//	boolean flag=false;
//	for(int j=i+1;j<str.length();j++) {
//		if(count<=0) {
//			System.out.println(str.substring(i, j));
//			c++;
//			break;
//		}
//		if(str.charAt(i)==str.charAt(j)) {
//			if(!flag) {
//				count++;
//				continue;
//			}else {
//				break;
//			}
//		}
//		if(str.charAt(i)!=str.charAt(j)) {
//			count--;
//			flag=true;
//			if(count==0) {
//				if(j==str.length()-1) {
//					System.out.println(str.substring(i, j+1));
//					c++;
//				}
//			}
//			continue;
//		}
//	}
//}
//System.out.println(c);