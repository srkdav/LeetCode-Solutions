package leetQuestions;

public class Q55JumpGame {

	public static void checkJump(int a[]) {
		for (int i = a.length - 1; i > 0; i--) {
			if (a[i - 1] + i - 1 == i) {
				i = i - 1;
			}
		}
	}

	static boolean flag = false;
	static boolean fflag = true;

	public static void checkJump2(int a[], int i) {
		if (i > a.length - 1) {
			return;
		}
		if (i != a.length - 1 && a[i] == 0) {
			return;
		}
		if (i == a.length - 1) {
			flag = true;
			return;
		}
		for (int n = 0; n < a[i]; n++) {
			checkJump2(a, n);
			// a[i] = a[i] - 1;
			// checkJump2(a, i + a[i]);
		}
	}

	static boolean check = false;

	public static void checkJump3(int a[], int idx) {
		if (idx > a.length) {
			return;
		}
		if (a[idx] == 0 && idx != a.length - 1) {
			check = false;
			return;
		}
		if (idx == a.length - 1) {
			check = true;
			return;
		}
		for (int i = idx; i < a.length; i++) {
			checkJump3(a, idx + a[i]);
			if (check == false) {
				if (a[i] > 0) {
					a[i]--;
				}
			} else {
				return;
			}
		}

	}

	public static boolean checkJump4(int nums[], int position) {
		if (position == nums.length - 1) {
			return true;
		}

		int furthestJump = Math.min(position + nums[position], nums.length - 1);
		for (int nextPosition = position + 1; nextPosition <= furthestJump; nextPosition++) {
			if (checkJump4(nums, nextPosition)) {
				return true;
			}
		}

		return false;
	}

	public static void checkJump5(int a[], int idx) {
		if (idx == a.length - 1) {
			check=true;
		}
		int maxP = Math.min(a.length - 1, idx + a[idx]);
		for (int i = idx + 1; i <= maxP; i++) {
			checkJump5(a, i);
		}
	}
	
	public static void checkJump6(int a[]){
		boolean arr[] = new boolean[a.length];
		int j=a.length-1;
		for(int i=a.length-1;i>=0;i--){
			while(arr[j]!=true){
				if(a[i-1]+i-1>=i){
					arr[j]=true;
					j=i-1;
				}else{
					i=i-1;
				}
			}
		}
		System.out.println(arr[0]);
	}
	
	static boolean ans=false;
	static int val=0;
	public static void checkJump7(int a[],int idx){
		if(idx==a.length-1){
			ans=true;
			return ;
		}
		if(idx>a.length){
			return;
		}
		for(int i=1;i<a[i];i++){
			checkJump7(a, i+idx);
		}
	}

	public static void main(String[] args) {

		// 3 2 1 0 4 -> 
		int nums[] = new int[] { 3,2,1,0, 4 };
		checkJump7(nums,0);
//		System.out.println(check);
	}

}
