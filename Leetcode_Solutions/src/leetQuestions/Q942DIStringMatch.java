package leetQuestions;

public class Q942DIStringMatch {
	public static void main(String[] args) {
		
//		char s[]= new char[] {'D','D','I'};
		String s = "DDI";
		int a[] = new int[s.length()+1];
		int low=0, high=s.length();
		int i=0;
		for(i=0;i<s.length();i++){
			if(s.charAt(i)=='I') {
				a[i]=low;
				low++;
			} 
			else
			{
				a[i]=high;
				high--;
			}
		}
		
			a[s.length()]=low;


		for(int p=0;p<a.length;p++) {
			System.out.print(a[p]+" ");
		}
	}
}
