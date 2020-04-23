package leetQuestions;

public class Q160InterLL {
	
	ListNode head;
	
	public  Q160InterLL insert(Q160InterLL list, int data) {
		ListNode node = new ListNode(data);
		node.next=null;
		if(list.head==null) {
			list.head=node;
		}
		else {
			ListNode last = list.head;
			while(last.next !=null) {
				last=last.next;
			}
			last.next=node;
		}
		return list;
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
