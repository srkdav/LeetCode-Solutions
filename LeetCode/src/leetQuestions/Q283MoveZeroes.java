package leetQuestions;

public class Q283MoveZeroes {
//To Do
	public static void main(String[] args) {
		
		int a[]=new int[] {0,0,3,0,5,1,0};
		for(int i=0;i<a.length;i++) {
			if(a[i]==0 && a[i+1]!=0) 
			{
				int t=a[i];
				a[i]=a[i+1];
				a[i+1]=t;
			}
			if(a[i]==0 && a[i+1]==0) 
			{
				int x=i+2;
				int t=a[i+1];
				a[i+1]=a[x];
				a[x]=t;
				
				
			}
		}
	}
}
