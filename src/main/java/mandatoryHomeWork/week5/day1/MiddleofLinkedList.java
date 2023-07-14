package main.java.mandatoryHomeWork.week5.day1;

import org.junit.Test;

//	https://leetcode.com/problems/middle-of-the-linked-list/


public class MiddleofLinkedList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		middleOfLL();
	
	}

	public static void middleOfLL() {

	}

	// 1. Implementation of Class for NODE
	public class Node {
		int data;
		Node next;
		Node prev;
		Node head = null;

		Node(int key) {
			this.data = key;
			next = null;
		}
	}

	// 2. Implementation of method to add data to node
	public Node addNode(int data) {
		return new Node(data);
	}

	// 3. Implemenation of main method to add data 
	@Test
	public void tesMiddle() {
		Node newNode = new Node(1);
		newNode.next=new Node(2);
		newNode.next.next=new Node(3);
		newNode.next.next.next=new Node(4);
		newNode.next.next.next.next=new Node(5);
		printAllNodes(newNode);
		System.out.println("__________________");
		Node tail = middleNode(newNode);
		printAllNodes(tail);
	}

	// 4. method to find middle the node
	public Node middleNode(Node newNode) {
		//Find the size of the node
				int nodeSize = size(newNode);
				//System.out.println(nodeSize);
				
				//find the mid index of the node
				int mid=nodeSize/2;
				//System.out.println(mid);
				
				//return head if we have one node
				if(nodeSize==1) return newNode;
				
				//set a counter
				int count=-1;
				
				//assing the input node as head
				Node head=newNode;
				
				//traverse from head using head node itself till mid node without using temp node.
				while(count<=mid) {
					count++;
					if(count==mid) {
						return head;
					}
					head=head.next;
				}
				return head;
	}

	//5. Printing the nodes for input and output
	

	private int size(Node newNode) {
		Node head = null;
		Node n = head;
		int count = 0;
		if (head == null) {
			//System.out.println(count);
			return count;
		} else {
			while (n.next != null) {
				count++;// 3
				n = n.next;
			}
			return count + 1;
		}
	}

	private void printAllNodes(Node tail) {
		while (tail != null) {
			System.out.println(tail.data);
			tail = tail.next;
			
		}
	}
}
