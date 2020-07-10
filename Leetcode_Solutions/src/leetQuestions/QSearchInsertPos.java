package leetQuestions;

public class QSearchInsertPos {

	public static void main(String[] args) {
	
		int a[] = new int[] {1,3,5};
		
		int x=5;
		int f=0;
		if(a.length==2) {
			if(a[0]==x || x<a[0]) {
				f=0;
			}if(a[1]==x){
                f=1;
            }if(x>a[1]){
                f=2;
            }if(x>a[0] && x<a[1]) {
            	f=0;
            }
            System.out.println(f);
		}
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==x) {
				f=i;
				break;
			}
			if(a[i]<x && a[i+1]>x) {
				f=i+1;
				break;
			}
		}
		if(a[0]>x) {
			f=0;
		}
		if(a[a.length-1]<x) {
			f=a.length;
		}
		System.out.println(f);
	}

}
