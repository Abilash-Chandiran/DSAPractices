package dsa.Week_5.Day_4;

public class Stack {
	int capacity = 5, index = 0;

	int[] stack = new int[capacity];

	public void push(int data) {
		stack[index] = data;
		index++;
	}

	public int pop() {
		index = index - 1;
		return stack[index] = 0;
	}

	public int top() {
		return stack[--index];
	}

	public boolean isEmpty() {
		return index <= 0;
	}

	public int size() {
		return index;
	}

	public void iterater() {
		for (int a : stack)
			System.out.print(a + " ");
	}
}
