package leetQuestions;

public class Q670MaxSwap {
//2736
	public static int maximumSwap(int num) {
		char[] a = Integer.toString(num).toCharArray();
		int maxIndex=a.length-1;
		int x=0,y=0;
		for(int i=a.length-1;i>=0;i--) {
			if(a[maxIndex]==a[i]) {
				continue;
			}
			if(a[maxIndex]<a[i]) {
				maxIndex=i;
			}else {
				x=maxIndex;
				y=i;
			}
		}
		char j = a[x];
		a[x]=a[y];
		a[y]=j;
		return Integer.parseInt(a.toString());
		
	}
	public static void main(String[] args) {
		maximumSwap(87345);
	}

}
