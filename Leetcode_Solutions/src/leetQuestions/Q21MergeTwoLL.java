package leetQuestions;

public class Q21MergeTwoLL {

	ListNode head;

	public Q21MergeTwoLL insert(Q21MergeTwoLL list, int data) {
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

	public static void mergeLL(ListNode temp1, ListNode temp2) {
		ListNode curr = new ListNode(0);
		ListNode temp = curr;
		while (temp1 != null && temp2 != null) {
			if (temp1.val <= temp2.val) {
				temp.next = temp1;
				temp1 = temp1.next;
			} else {
				temp.next = temp2;
				temp2 = temp2.next;
			}
			temp = temp.next;
		}
//		if (temp != null && temp2 != null) {
//			if (temp.val <= temp2.val) {
//				temp.next = temp2;
//			}
//		}
//		if (temp != null && temp1 != null) {
//			if (temp.val <= temp1.val) {
//				temp.next = temp1;
//			}
//		}
		if (temp1 != null) {
			temp.next = temp1;
		} else if (temp2 != null) {
			temp.next = temp2;
		}

	}

	public void printList(Q21MergeTwoLL list) {
		ListNode curr = list.head;
		while (curr != null) {
			System.out.print(curr.val + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Q21MergeTwoLL list1 = new Q21MergeTwoLL();
		Q21MergeTwoLL list2 = new Q21MergeTwoLL();
		list1.insert(list1, 1);
		list1.insert(list1, 2);
		list1.insert(list1, 4);
//		list2.insert(list2, 1);
//		list2.insert(list2, 3);
//		list2.insert(list2, 4);
		mergeLL(list1.head, list2.head);
		list1.printList(list1);

	}

}
