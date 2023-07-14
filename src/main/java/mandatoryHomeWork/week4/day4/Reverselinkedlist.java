package main.java.mandatoryHomeWork.week4.day4;

import org.junit.Test;

//https://leetcode.com/problems/reverse-linked-list/

public class Reverselinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverseLinkedList();
	
	}

	public static void reverseLinkedList() {

	}

	// 1. Implementation of Class for NODE
	public class Node {
		int data;
		Node next;
		Node prev;

		Node(int key) {
			this.data = key;
			next = null;
		}
	}

	// 2. Implementation of method to add data to node
	public Node addNode(int data) {
		return new Node(data);
	}

	// 3. Implemenation of main method to add data and reverse the list
	@Test
	public void testReverse() {
		Node head = addNode(1);
		head.next = addNode(2);
		head.next.next = addNode(3);
		head.next.next.next = addNode(4);
		head.next.next.next.next = addNode(5);
		printAllNodes(head);
		System.out.println(" -- ");
		Node tail = reverseNode(head);
		printAllNodes(tail);
	}

	// 4. method to reverse the node
	public Node reverseNode(Node head) {
			Node current = head;
			Node prev = null;
			Node next = null;
			while (current != null) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			return prev;
	}
	//5. Printing the nodes for input and output
	
	private void printAllNodes(Node tail) {
		while (tail != null) {
			System.out.println(tail.data);
			tail = tail.next;
			
		}
	}

}
