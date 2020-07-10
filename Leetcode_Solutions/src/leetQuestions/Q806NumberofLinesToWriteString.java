package leetQuestions;

public class Q806NumberofLinesToWriteString {

	public static void main(String[] args) {
		
		int[] width = new int[] {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		String str= "bbbcccdddaaa";
		int sum=0;
		int count=1;
		int[] result = new int[2];
		//width[0]=a,width[1]=b...
		for(char c: str.toCharArray()) {
			sum=sum+width[c-'a'];
			if(sum>100) {
				count++;
				sum=width[c-'a'];
			}
		}
//		for(int i=0;i<str.length();i++) {
//			int k=(int)str.charAt(i);
//			sum=sum+width[k-97];
//			if(sum>100) {
//				count++;
//				sum=width[k-97];
//			}
//		}
		result[0]=count;
		result[1]=sum;
		System.out.println(sum);
		System.out.println(count);
	}

}
