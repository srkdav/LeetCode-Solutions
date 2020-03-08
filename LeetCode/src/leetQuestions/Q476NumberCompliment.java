package leetQuestions;

public class Q476NumberCompliment {

	public static void main(String[] args) {
		int n=10;
		String s=Integer.toBinaryString(n);
		System.out.println(s);
		char a[]= new char[s.length()];
		for(int i=0;i<a.length;i++) {
			if(s.charAt(i)==49) {
				a[i]=48;				
			}
			else
			{
				a[i]=49;
			}

		}
		while(n>0) {
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		int x=0;
		int z=0;
		for(int i=0;i<a.length;i++) {
			int y=(int)Math.pow(2, Math.abs(a.length-i-1));
			if(a[i]==49) {
				 z = 1;
			}
			else
			{
				 z = 0;
			}
			x=z*y+x;
			
		}
		System.out.println(x);
		
		
		
	}
}
