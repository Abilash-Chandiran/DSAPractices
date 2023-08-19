package main.java.optionalPrograms;

import java.util.*;

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
	}
}

public class ReverseArrayUsingLinkedList {
	public static int[] reverseArray(int[] arr) {
		if (arr == null || arr.length <= 1) {
			return arr;
		}

		ListNode head = null;
		for (int i = 0; i <= arr.length - 1; i++) {
			ListNode newNode = new ListNode(arr[i]);
			newNode.next = head;
			head = newNode;
		}

		int[] reversedArray = new int[arr.length];
		ListNode current = head;
		int index = 0;
		while (current != null) {
			reversedArray[index++] = current.val;
			current = current.next;
		}

		return reversedArray;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] reversedArray = reverseArray(arr);
		System.out.println(Arrays.toString(reversedArray));
	}

}
