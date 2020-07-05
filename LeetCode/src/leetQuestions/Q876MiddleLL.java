package leetQuestions;

public class Q876MiddleLL {

	ListNode head;

	public Q876MiddleLL insert(Q876MiddleLL list, int data) {
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

	public void printList(Q876MiddleLL list) {
		ListNode curr = list.head;
		while (curr != null) {
			System.out.print(curr.val + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	public void findMiddleEle(Q876MiddleLL list) {
		ListNode slow = list.head;
		ListNode fast = list.head;
		while (fast.next != null) {
			slow = slow.next;
			if (fast.next.next != null) {
				fast = fast.next.next;
			} else {
				break;
			}
		}
		System.out.println(slow.val);

	}

	public void deleteNode(int val) {
		while(head!=null && head.val==val) {
			head=head.next;
		}
		ListNode temp = head;
		while(temp!=null && temp.next!=null) {
			if(temp.next.val==val) {
				temp.next=temp.next.next;
			}else {
				temp=temp.next;
			}
		}
		
	}

	public static void main(String[] args) {
		Q876MiddleLL list = new Q876MiddleLL();
		list.insert(list, 6);
		list.insert(list, 6);
//		list.insert(list, 6);
//		list.insert(list, 3);
//		list.insert(list, 4);
//		list.insert(list, 5);
//		list.insert(list, 6);
		list.printList(list);
//		list.findMiddleEle(list);
		list.deleteNode(6);
		list.printList(list);
	}

}
