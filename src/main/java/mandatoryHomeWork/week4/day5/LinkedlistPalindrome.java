package main.java.mandatoryHomeWork.week4.day5;

import java.util.ArrayList;
import java.util.*;

import org.junit.Test;
//https://leetcode.com/problems/palindrome-linked-list/description/

public class LinkedlistPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		palindromeLL();
	
	}

	public static void palindromeLL() {

	}

	// 1. Implementation of Class for NODE
	public class Node {
		int data;
		Node next;
		Node prev;
		public Integer val;
		
		Node(int val) {
			this.data = val;
			
		}
	}

	// 2. Implementation of method to add data to node
	public Node addNode(int data) {
		return new Node(data);
	}

	// 3. Implemenation of main method to add data and reverse the list
	@Test
	public void testPalindrome() {
		Node head = addNode(1);
		head.next = addNode(2);
		head.next.next = addNode(2);
		head.next.next.next = addNode(1);
		printAllNodes(head);
		System.out.println("__________________");
		System.out.println(palindromeNode(head));
	}

	// 4. method to reverse the node
	public boolean palindromeNode(Node head) {
		if (head == null || head.next == null) {
            return true;
        }
        
        // Step 1: Store node values in a list
        List<Integer> values = new ArrayList<Integer>();
        Node current = head;
        while (current != null) {
            values.add(current.val);
            current = current.next;
        }
        
        // Step 2: Find the middle of the linked list
        int mid = values.size() / 2;
        
        // Step 3: Reverse the second half of the linked list
        Node prev = null;
        current = head;
        for (int i = 0; i < mid; i++) {
            current = current.next;
        }
        while (current != null) {
        	Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        // Step 4: Compare values of first half with reversed second half
        current = head;
        for (int i = 0; i < mid; i++) {
            if (current.val != prev.val) {
                return false;
            }
            current = current.next;
            prev = prev.next;
        }System.out.println(head);
        
        return true;
	}
	//5. Printing the nodes for input and output
	
	private void printAllNodes(Node tail) {
		while (tail != null) {
			System.out.println(tail.data);
			tail = tail.next;
			
		}
	}

}
