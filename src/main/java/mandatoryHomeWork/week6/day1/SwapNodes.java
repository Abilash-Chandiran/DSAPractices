package main.java.mandatoryHomeWork.week6.day1;

import org.junit.Test;

//https://leetcode.com/problems/swap-nodes-in-pairs/solutions/

public class SwapNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		swapNodesLinkedList();
	
	}

	public static void swapNodesLinkedList() {

	}

	// 1. Implementation of Class for NODE
	public class Node2 {
		int data;
		Node2 next;
		Node2 prev;

		Node2(int key) {
			this.data = key;
			next = null;
		}
	}

	// 2. Implementation of method to add data to node
	public Node2 addNode(int data) {
		return new Node2(data);
	}

	// 3. Implemenation of main method to add data and reverse the list
	@Test
	public void testSwap() {
		Node2 head = addNode(1);
		head.next = addNode(2);
		head.next.next = addNode(3);
		head.next.next.next = addNode(4);
		
		printAllNodes(head);
		System.out.println(" --- ");
		Node2 tail = swapNodePairs(head);
		swapNodePairs(tail);
	}

	// 4. method to reverse the node
	public Node2 swapNodePairs(Node2 node) {
		Node2 current = node;
		Node2 prev = null;
		Node2 next = null;
			while (current != null) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			return prev;
	}
	//5. Printing the nodes for input and output
	
	private void printAllNodes(Node2 node) {
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
			
		}
	}

}
