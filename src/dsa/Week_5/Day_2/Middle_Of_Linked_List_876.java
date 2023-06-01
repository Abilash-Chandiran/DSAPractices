package dsa.Week_5.Day_2;

public class Middle_Of_Linked_List_876 {

	class Node {
		int val;
		Node next;

		Node() {
			next = null;
		}

		Node(int key) {
			this.val = key;
		}
	}

	public Node addValue(int data) {
		Node node = new Node(data);
		return node;
	}

	private void printAllNodes(Node node) {
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}
}
