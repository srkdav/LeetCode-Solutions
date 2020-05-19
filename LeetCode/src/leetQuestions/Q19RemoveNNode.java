package leetQuestions;

public class Q19RemoveNNode {

	ListNode head;

	public void insert(Q19RemoveNNode list, int key) {
		ListNode node = new ListNode(key);
		node.next = null;
		if (list.head == null) {
			head = node;
		} else {
			ListNode last = head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = node;
		}
	}

	public void findNNodeFromEnd(int n) {
		ListNode temp1 = head;
		ListNode temp2 = head;
		ListNode temp3 = head;
		temp3 = temp3.next;
		while (n != 0 && temp2.next != null) {
			temp2 = temp2.next;
			n--;
		}
		if (temp2.next == null) {
			temp1.next=temp3.next;

		} else {
			while (temp2.next != null) {
				temp2 = temp2.next;
				temp1 = temp1.next;
				temp3 = temp3.next;
			}
			int k = 2;
			if (temp3.next != null || k != 0) {
				temp3 = temp3.next;
				k--;
			}
			temp1.next = temp3;
		}
	}
	
	public void removeNode(int n){
		ListNode curr = new ListNode(0);
		ListNode temp1=curr;
		temp1.next=head;
		ListNode temp2 = temp1;
		for(int i=1;i<n+1;i++){
			temp2=temp2.next;
		}
		while(temp2.next!=null){
			temp2=temp2.next;
			temp1=temp1.next;
		}
		temp1.next=temp1.next.next;

	}

	public void printList(Q19RemoveNNode list) {
		ListNode curr = list.head;
		while (curr != null) {
			System.out.print(curr.val + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Q19RemoveNNode list = new Q19RemoveNNode();
		list.insert(list, 10);
		list.insert(list, 20);
		list.insert(list, 30);
		list.insert(list, 40);
//		list.insert(list, 5);
//		list.insert(list, 6);
		list.printList(list);
//		list.findNNodeFromEnd(4);
		list.removeNode(4);
		list.printList(list);

	}

}
