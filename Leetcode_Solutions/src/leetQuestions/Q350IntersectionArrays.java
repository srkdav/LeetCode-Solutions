package leetQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//to do
public class Q350IntersectionArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[] = new int[] {4,9,5};
		int a2[] = new int[] {9,4,9,8,4 }; 
//		Arrays.sort(a1);
//		Arrays.sort(a2);
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<a1.length;i++){
			for(int j=i;j<a2.length;j++){
				if(a1[i]!=a2[j]){
					continue;
				}else{
					list.add(a1[i]);
					break;
				}
				
			}
		}
		for(Integer l:list){
			System.out.print(l+" ");
		}

	}

}
