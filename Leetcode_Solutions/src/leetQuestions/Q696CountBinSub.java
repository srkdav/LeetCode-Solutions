	package leetQuestions;

public class Q696CountBinSub {
    public static int countBinarySubstrings(String s) {
        int[] groups = new int[s.length()];
        int t = 0;
        groups[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i-1) != s.charAt(i)) {
                groups[++t] = 1;
            } else {
                groups[t]++;
            }
        }

        int ans = 0;
        for (int i = 1; i <= t; i++) {
            ans += Math.min(groups[i-1], groups[i]);
        }
        return ans;
    }
	public static void main(String[] args) {
		String str = "00110011";
		int x = countBinarySubstrings(str);
		System.out.println(x);
//		for(int i=0;i<str.length();i++) {
//			int count=1;
//			// to do linear time
//		}
		
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