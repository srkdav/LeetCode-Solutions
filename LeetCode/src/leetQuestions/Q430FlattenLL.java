package leetQuestions;

public class Q430FlattenLL {

	public class DNode {
		public int val;
		public DNode prev;
		public DNode next;
		public DNode child;

		public DNode() {
		}

		public DNode(int val, DNode prev, DNode next, DNode child) {
			super();
			this.val = val;
			this.prev = prev;
			this.next = next;
			this.child = child;
		}

		public int getVal() {
			return val;
		}

		public void setVal(int val) {
			this.val = val;
		}

		public DNode getPrev() {
			return prev;
		}

		public void setPrev(DNode prev) {
			this.prev = prev;
		}

		public DNode getNext() {
			return next;
		}

		public void setNext(DNode next) {
			this.next = next;
		}

		public DNode getChild() {
			return child;
		}

		public void setChild(DNode child) {
			this.child = child;
		}

	}

	DNode head;

	public static DNode flatten(DNode head) {
		if (head == null) {
			return head;
		}
		if (head.child == null) {
			if (head.next == null) {
				return head;
			}
			return flatten(head.next);
		} else {
			DNode child = head.child;
			head.child=null;
			DNode next = head.next;
			DNode child_tail = flatten(child);
			head.next=child;
			child.prev=head;
			if(next!=null) {
				child_tail.next=next;
				next.prev=child_tail;
				return flatten(next);
			}
			return child_tail;
		}
	}

	public static void main(String[] args) {

	}

}
