package leetQuestions;

public class Q1395CountTeams {

	public static void main(String[] args) {
		int a[] = new int[] { 1,2,3,4};
		int count = 0;
		for (int i = 0; i < a.length - 2; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				{
					for (int k = j + 1; k < a.length; k++) {
						if (a[i] < a[j] && a[j] < a[k]) {
							count++;
						}
						if(a[i]>a[j]  && a[j]>a[k]) {
							count++;
						}
					}

				}
			}
		}
		System.out.println(count);

	}

}
