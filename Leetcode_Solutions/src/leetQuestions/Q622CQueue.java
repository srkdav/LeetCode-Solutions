package leetQuestions;

public class Q622CQueue {

	static int a[];
	static int front = -1;
	static int rear = -1;
	static int len = 0;

	public Q622CQueue() {

	}

	public Q622CQueue(int k) {
		a = new int[k];
	}

	public boolean enQueue(int value) {
		if (isFull()) {
			return false;
		} else {
			rear = (rear + 1) % a.length;
			a[rear] = value;
			len++;
			
			return true;
		}
	}

	public boolean deQueue() {
		if (len == 0) {
			return false;
		} else {
			front = (front + 1) % a.length;
			len--;
			return true;
		}
	}

	public int Front() {
		if (len == 0) {
			return -1;
		} else {
			System.out.println(a[front]);
			return a[front];
		}
	}

	public int Rear() {
		if (len == 0) {
			return -1;
		} else {
			System.out.println(a[rear]);
			return a[rear];
		}
	}

	public boolean isFull() {
		return len == a.length;
	}

	public boolean isEmpty() {
		return len == 0;
	}

	public static void main(String[] args) {
		Q622CQueue q = new Q622CQueue(6);
		q.enQueue(6);
		q.Rear();
		q.Rear();
		q.deQueue();
		q.Rear();
		q.enQueue(5);
		q.Rear();
		q.deQueue();
		q.Front();
		q.deQueue();
		q.deQueue();
		q.deQueue();
	}

}
