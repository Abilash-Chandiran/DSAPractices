package main.java.optionalPrograms;

/**
 * https://www.programiz.com/java-programming/examples/stack-implementation
 */

public class StackLearning {

	private int[] arr; // Store elements of stack
	private int top; // represent top of stack
	private int capacity; // represent total capacity of stack

	public static void main(String[] args) {

		StackLearning stack = new StackLearning(5);
		stack.push(55);
		stack.push(44);
		stack.push(33);
		stack.push(22);
		stack.push(11);
		System.out.println("Size of Stack "+stack.getSize());
		System.out.println("Print Stack ");
		stack.printStack();
		stack.pop();
		stack.pop();
		System.out.println("\nAfter popping out");
		stack.printStack();
	}

	// Creating Stack
	StackLearning(int size) {

		arr = new int[size];
		capacity = size;
		top = -1;
	}

	// Push elements to top of the stack
	public void push(int x) {

		if (isFull()) {

			System.out.println("Stack Overflow");
			System.exit(1); // Terminates the program
		}

		// Insert Element on top of stack
		System.out.println("Inserting " + x);
		arr[++top] = x;
	}

	// Pop element from top of stack
	public int pop() {

		// If stack is empty no element to pop
		if (isEmpty()) {

			System.out.println("Stack Empty");
			System.exit(1);
		}

		arr[top--] = 0;
		return arr[top];
	}

	// Return size of Stack
	public int getSize() {
		return top + 1;
	}

	// Check if stack is Empty
	public Boolean isEmpty() {
		return top == -1;
	}

	// Check if the stack is Full
	public Boolean isFull() {

		return top == capacity - 1;
	}

	// Print Elements of Stack
	public void printStack() {

		for (int i = 0; i <= top; i++)
			System.out.print(arr[i] + ", ");
	}

}
