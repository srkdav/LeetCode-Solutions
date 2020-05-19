package leetQuestions;

public class Q706HashMap {

	static ListNode1 a[] = new ListNode1[10];

	public Q706HashMap() {
	}

	class ListNode1 {
		int key;
		int val;
		ListNode1 next;

		ListNode1(int k, int v) {
			key = k;
			val = v;
		}
	}

	public void put(int key, int value) {
		int i = Integer.hashCode(key) % a.length;
		if (a[i] == null) {
			ListNode1 temp = new ListNode1(key, value);
			temp.next = null;
			a[i] = temp;
		} else {
			boolean flag=false;
			ListNode1 temp = a[i];
			while(temp!=null){
				if(temp.key==key){
					flag=true;
					temp.val=value;
				}
				temp=temp.next;
			}
			if(flag==false){
				ListNode1 curr = new ListNode1(key,value);
				temp=a[i];
				while(temp.next!=null){
					temp=temp.next;
				}
				temp.next=curr;
			}
		}
	}

	public int get(int key) {
		int i = Integer.hashCode(key) % a.length;
		if (a[i] == null) {
			return -1;
		} else {
			ListNode1 temp = a[i];
			while (temp != null) {
				if (temp.key == key) {
					return temp.val;
				}
				temp = temp.next;
			}
		}
		return -1;
	}

	public void remove(int key) {
		int i = Integer.hashCode(key) % a.length;
		if (a[i] == null) {
			return;
		} else {
			ListNode1 temp = a[i];
			if (temp.key == key) {
				if (temp.next == null) {
					a[i] = null;
				} else {
					a[i] = temp.next;
				}
			} else {
				while (temp != null) {
					if (temp.key == key) {
						break;
					}
					temp = temp.next;
				}
				ListNode1 temp1 = a[i];
				while (temp1.next != temp) {
					temp1 = temp1.next;
				}
				temp1.next = temp.next;
			}
		}
	}

	public static void main(String[] args) {

		Q706HashMap hm = new Q706HashMap();
		hm.put(1, 1);
		hm.put(2, 2);
		System.out.println(hm.get(1));
		System.out.println(hm.get(3));
		hm.put(2, 1);
		System.out.println(hm.get(2));
		hm.remove(2);
		System.out.println(hm.get(2));

	}

}
