package leetQuestions;
public class Q707LL {

	ListNode head;
	int size = 0;

	public int get(int index) {

		if (index >= size) {
			return -1;
		}
		ListNode curr = head;
		for (int i = 0; i < index; i++) {
			curr = curr.next;
		}
		return curr.val;
	}

	public void addAtHead(int val) {
		ListNode temp = new ListNode(val);
		temp.next = null;
		if (head == null) {
			head = temp;
		} else {
			temp.next = head;
			head = temp;
		}
		size++;
	}

	public void addAtTail(int val) {
		ListNode temp = new ListNode(val);
		temp.next = null;
		if (head == null) {
			head = temp;
		} else {
			ListNode curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = temp;
		}
		size++;
	}

	public void addAtIndex(int index, int val) {
		if (index < 0 || index > size) {
			return;
		}
		if (index == 0) {
			addAtHead(val);
		} else {
			size++;
			ListNode temp = new ListNode(val);
			ListNode curr = head;
			for (int i = 0; i < index - 1; i++) {
				curr = curr.next;
			}
			temp.next = curr.next;
			curr.next = temp;
		}

	}

	public void deleteAtIndex(int index) {
		if (index < 0 || index >=size) {
			return;
		}
		size--;
		if (index == 0) {
			ListNode curr = head;
			head = head.next;
			curr.next = null;
		} else {
			ListNode curr = head;
			for (int i = 0; i < index - 1; i++) {
				curr = curr.next;
			}
			curr.next = curr.next.next;
		}
	}

	public void printList(Q707LL list) {
		ListNode curr = list.head;
		while (curr != null) {
			System.out.print(curr.val + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Q707LL list = new Q707LL();
		list.addAtHead(2);
		list.deleteAtIndex(1);
		list.addAtHead(2);
		list.addAtHead(7);
		list.addAtHead(3);
		list.addAtHead(2);
		list.addAtHead(5);
		list.addAtTail(5);
		list.printList(list);
		list.get(5);
		list.deleteAtIndex(6);
		list.deleteAtIndex(4);
	}

}
