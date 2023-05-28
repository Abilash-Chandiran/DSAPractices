package dsa;

import java.util.LinkedList;

import org.junit.Test;

/***
 * 
 * Given a LinkedList with equal number of integer followed by same number of
 * alphabets. Arrange the LinkedList in an alternate number and alphabet
 * fashion. Example: Input: [1, 2, 3, a, b, c] Output: [1. a, 2, b, 3, c] NOTE:
 * SHOULD NOT USE INBUILT FUNCTION
 */

public class ArrangeLinkedList {

	@Test
	public void test1() {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("1");
		ll.add("2");
		ll.add("3");
		ll.add("a");
		ll.add("b");
		ll.add("c");

		arrangeLinkedlist(ll);
	}

	void changeLinkedList(LinkedList start) {
		
	}

	public void arrangeLinkedlist(LinkedList ll) {

		LinkedList<String> ll01 = new LinkedList<String>();
		
		
		
		
	}
}
