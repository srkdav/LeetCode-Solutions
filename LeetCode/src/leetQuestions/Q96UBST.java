package leetQuestions;

public class Q96UBST {

	public static void numtrees(int n) {
		int [] dp=new int[n+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<=n;i++) {
			int sum=0;
			for(int j=0;j<i;j++) {
				sum=sum+(dp[j]*dp[i-1-j]);
			}
			dp[i]=sum;
		}
		System.out.println(dp[n]);
	}
	public static void main(String[] args) {
		numtrees(4);
	}

}
