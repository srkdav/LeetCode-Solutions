package leetQuestions;

public class Q922ParityII {

	public static void main(String[] args) {
		int a[]=new int[] {4,2,5,7};
		int k=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==0 && a[i]%2==0 || i%2!=0 && a[i]%2!=0) {
				continue;
			}
			int j=a.length-i-1;
			if(j%2==0 && a[j]%2==0 || j%2!=0 && a[j]%2!=0) {
				j--;
			}	
			
		}
		
		
	}
}


//for(int i=0;i<a.length;i++) {
//	if(i%2==0 && a[i]%2==0) {
//		continue;
//	}
//	if(i%2!=0 && a[i]%2!=0) {
//		continue;
//	}
//	if(i%2!=0 && a[i]%2==0) {
//		for(int j=i+1;j<a.length;j++) {
//			if(j%2==0 && a[j]%2!=0 ) {
//				int t=a[i];
//				a[i]=a[j];
//				a[j]=t;
//			}
//		}
//	}
//	if(i%2==0 && a[i]%2!=0) {
//		for(int j=i+1;j<a.length;j++) {
//			if(j%2!=0 && a[j]%2==0 ) {
//				int t=a[i];
//				a[i]=a[j];
//				a[j]=t;
//			}
//		}
//	}
//		
//}
//for(int i=0;i<a.length;i++) {
//	System.out.print(a[i]+" ");
//}