package leetQuestions;

public class Q33SearchInSortedArray {

	public static int findDivEle(int []a,int low,int high){
		if(high<low){
			return -1;
		}
		if(high==low){
			return low;
		}
		int mid = (low+high)/2;
		if(mid<high && a[mid]>a[mid+1]){
			return mid;
		}
		if(mid>low && a[mid]<a[mid-1]){
			return mid-1;
		}
		if(a[low]>=a[mid]){
			return findDivEle(a, low, mid-1);
		}
		return findDivEle(a, mid+1, high);
	}
	
	public static int findTarget(int a[],int t){
		int pivot=-1;
		int pivotI = findDivEle(a, 0, a.length-1);
		if(pivotI>=0){
			pivot = a[pivotI];
		}
		int t1 = binarySearch(a, 0, pivotI, t);
		int t2 = binarySearch(a, pivotI+1, a.length-1, t);
		if(t1>=0){
			return t1;
		}
		else if(t2>=0){
			return t2;
		}
		else{
			return -1;
		}
	}
	
	public static int binarySearch(int a[],int l,int r,int t){
		if(l<=r){
			int mid = l + (r-l)/2;
			if(a[mid]==t){
				return mid;
			}
			if(a[mid]>t){
				return binarySearch(a, l, mid-1, t);
			}else{
				return binarySearch(a, mid+1, r, t);
			}	
		}
		return -1;
	}
	public static void main(String[] args) {

		int a[] = new int[]{8,9,2,3,4};
		int x  = findTarget(a, 9);
		System.out.println(x);
	}

}
