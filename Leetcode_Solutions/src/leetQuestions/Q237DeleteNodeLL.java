package leetQuestions;

public class Q237DeleteNodeLL {

	ListNode head;
	public void deleteNode(ListNode node) {
		ListNode temp=head;
		if(temp.val==node.val) {
			head=head.next;
			temp.next=null;
		}else {
			while(temp.next!=null) {
				if(temp.next.val==node.val) {
					temp.next=temp.next.next;
				}
				temp=temp.next;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
