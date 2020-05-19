package leetQuestions;

public class Q918MaxCircSubArray {

	public static void findMaxSum(int a[]){
		int lmax=0;
		int gmax=Integer.MIN_VALUE;
		int lmin=0;
		int gmin=Integer.MAX_VALUE;
		int sum=0;
		for(int i=0;i<a.length;i++){
			lmax=Math.max(a[i], lmax+a[i]);
			lmin=Math.min(a[i], lmin+a[i]);
			if(lmax>gmax){
				gmax=lmax;
			}
			if(lmin<gmin){
				gmin=lmin;
			}
			sum=sum+a[i];
		}
		if(gmin==sum){
			
		}
		System.out.println(Math.max(gmax, sum-gmin));
		System.out.println(gmax);
		System.out.println(gmin);
		System.out.println(sum);
	}
	public static void main(String[] args) {

		int a[]=new int[]{-2,-3,-1};
		findMaxSum(a);
	}

}
