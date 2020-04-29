package leetQuestions;

import java.util.HashSet;

public class Q1143LongestSub {
	static HashSet<String> hs1=new HashSet<String>();
	public static void permutate(String a,String res,int index){
		if(index==a.length()-1){
			System.out.println(res);
			hs1.add(res);
			return;
		}
		for(int i=index+1;i<a.length();i++){
			res=res+a.charAt(i);
			hs1.add(res);
			permutate(a, res, i);
			res=res.substring(0, res.length()-1);
		}
	}
	
	static int max=0;
	public static void permutate2(String a,String res,int index){
		if(index==a.length()-1){
			System.out.println(res);
			if(hs1.contains(res)){
				if(res.length()>max){
					max=res.length();
				}
			}
			return;
		}
		for(int i=index+1;i<a.length();i++){
			res=res+a.charAt(i);
			if(hs1.contains(res)){
				if(res.length()>max){
					max=res.length();
				}
			}
			permutate2(a, res, i);
			res=res.substring(0, res.length()-1);
		}
	}
	static int dp[][];
	public static void findMaxLength(String a,String b){
		dp=new int[b.length()+1][a.length()+1];
		for(int row=1;row<dp.length;row++){
			for(int col=1;col<dp[row].length;col++){
				if(a.charAt(col-1)==b.charAt(row-1)){
					dp[row][col]=1+dp[row-1][col-1];
				}else{
					dp[row][col]= Math.max(dp[row-1][col], dp[row][col-1]);
				}
			}
		}
		System.out.println(dp[b.length()][a.length()]);
	}
	
	public static void main(String[] args) {

		String a= "abcde";
		String b="ace";
		String res="";
//		permutate(a, res, -1);
//		permutate2(b, res, -1);
		findMaxLength(a, b);
	}

}
