package leetQuestions;

public class Q698PartKEqualSubs {

	static int count = 0;

	public static void backTrack(int[] a, int idx, int s, int psum, int[] v) {
		if (idx >= a.length) {
			if (psum == s) {
				count++;
			}
			return;
		}
		if(v[idx]==0) {
		v[idx]=1;
		backTrack(a, idx + 1, s, psum, v);
		backTrack(a, idx + 1, s, psum + a[idx], v);
		v[idx]=0;
		}
	}

	public static void canPartitionKSubsets(int[] a, int k) {
		int sum = 0;
		for (int A : a) {
			sum = sum + A;
		}
		int[] visited = new int[a.length];
		if (sum / k != 0) {
			backTrack(a, 0, 5, 0, visited);
			System.out.println(count);
		}
	}

	public static void main(String[] args) {
		int a[] = new int[] { 4, 3, 2, 3, 5, 2, 1 };
		canPartitionKSubsets(a, 4);

	}

}
