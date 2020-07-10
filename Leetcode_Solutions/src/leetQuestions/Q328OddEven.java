package leetQuestions;

public class Q328OddEven {

	ListNode head;

	public Q328OddEven insert(Q328OddEven list, int data) {
		ListNode node = new ListNode(data);
		node.next = null;
		if (list.head == null) {
			list.head = node;
		} else {
			ListNode last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = node;
		}
		return list;
	}

	public void oddEvenList() {
		ListNode curr = head;
		ListNode temp = head.next;
		ListNode temp1 = head.next;
		while (temp!=null && temp.next != null) {
			curr.next = curr.next.next;
			curr = curr.next;
//			if (curr.next != null) {
				temp.next = curr.next;
				temp = temp.next;
//			}
		}
		curr.next=temp1;
//		temp.next = null;
	}

	public void printList(Q328OddEven list) {
		ListNode curr = list.head;
		while (curr != null) {
			System.out.print(curr.val + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Q328OddEven list = new Q328OddEven();
		list.insert(list, 1);
		list.insert(list, 2);
		list.insert(list, 3);
		list.insert(list, 4);
		list.insert(list, 5);
		list.insert(list, 6);
		list.insert(list, 7);
		list.insert(list, 8);
		list.printList(list);
		list.oddEvenList();
		list.printList(list);

	}

}
