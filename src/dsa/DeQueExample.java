package dsa;

public class DeQueExample {
	public static void main(String[] args) {
		Deque dq = new Deque();
		System.out.println("Add First");
		dq.addFirst(10);
		dq.addFirst(9);
		dq.addFirst(8);
		dq.addFirst(7);
		System.out.println(dq);

		System.out.println("Remove First");
		System.out.println(dq.removeFirst());
		System.out.println(dq);
		System.out.println(dq.removeFirst());
		System.out.println(dq);
		System.out.println(dq.removeFirst());
		System.out.println(dq);
		System.out.println(dq.removeFirst());
		System.out.println(dq);

		System.out.println("Add Last");
		dq.addFirst(10);
		dq.addFirst(9);
		dq.addLast(5);
		dq.addLast(6);
		dq.addLast(7);
		System.out.println(dq);
		
		System.out.println("Remove Last");
		dq.addFirst(10);

	}
}

class Deque {
	class Node {
		int value;
		Node next = null;
		Node previous = null;
	}

	private Node start = null;
	private Node end = null;
	private int size = 0;

	void addFirst(int no) {
		Node node = new Node();
		node.value = no;

		// Adding the 1st no
		if (start == null) {
			start = node;
			end = node;
		}

		// We are doing a regular addition
		else {
			node.next = start;
			start.previous = node;
			start = node;
		}
		size++;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		Node current = start;
		while (current != null) {
			sb.append(current.value + ", ");
			current = current.next;
		}
		sb.append("] --> Size: " + size);
		return sb.toString();
	}

	int removeFirst() {
		// The deque is empty
		if (start == null) {
			throw new NullPointerException("The Deque is already empty");
		}

		Node temp = start;
		// If there is only one element
		if (start == end) {
			start = null;
			end = null;
		}
		// Regular removal
		else {
			start.next.previous = null;
			start = start.next;
		}
		size--;
		return temp.value;
	}

	void addLast(int no) {
		Node node = new Node();
		node.value = no;

		// If we are inserting at the 1st Place
		if (start == null) {
			start = node;
			end = node;
		}

		// If we are doing an insertion for non 1st element in the DQ
		else {
			node.previous = end;
			end.next = node;
			end = node;
		}
		size++;
	}

	int removelast() {

		// If DQ is empty
		if (start == null) {

			throw new NullPointerException("DQ is Empty");
		}

		// If DQ has only one element
		Node temp = end;
		if (start == end) {

			start = null;
			end = null;
		}

		// If it is a regular removal
		else {

			end = end.previous;
			end.next = null;
		}
		size--;
		return temp.value;
	}
}