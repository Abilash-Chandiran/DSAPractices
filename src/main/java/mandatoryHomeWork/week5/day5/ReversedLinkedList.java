package main.java.mandatoryHomeWork.week5.day5;

import org.junit.Test;

//https://leetcode.com/problems/reverse-linked-list-ii/

public class ReversedLinkedList {


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
		Node newNode = new Node(1);
		newNode.next=new Node(2);
		newNode.next.next=new Node(3);
		newNode.next.next.next=new Node(4);
		newNode.next.next.next.next=new Node(5);
		
		int left=2;
		int right=4;
		printAllNodes(newNode);
		System.out.println("__________________");
		Node tail = reverseNode(newNode, left, right);
		printAllNodes(tail);
	}

	// 4. method to reverse the node
	public Node reverseNode(Node head, int left, int right) {
		Node temp=head;
		int count=1;
		Node prev;
		Node left1;
		//Node left2;
		 while(count!=right) {
			 temp=temp.next;
			 count++;
		 }
		 
		 prev=temp.next; //last portion
		 temp.next=null;
		 //traverse from head till left
		 
		 temp=head;
		 count=2;
		 while(count<left) {
			 temp=temp.next;
			 count++;
		 }
		 //loop till temp!=null
		 Node left2=temp.next;
		 temp.next=null;
		 while(left2.next!=null) {
			 left1=left2.next;
			 left2.next=prev;
			 prev=left2;
			 left2=left1;
		 }
		 left2.next=prev;
		 prev=left2;
		head.next=prev;
		return temp;
	}
	//5. Printing the nodes for input and output
	
	private void printAllNodes(Node tail) {
		while (tail != null) {
			System.out.println(tail.data);
			tail = tail.next;
			
		}
	}
}
