package main.java.optionalPrograms;

/**
 * 
 * Stack - First in Last out concept Stack implementation is done using array
 * and addition variable "top" to track the position of array to push, pop and
 * peek. push() - To add values into arr[top] with help of top variable index.
 * peek() - To Get the last value stored in arr[top-1] here with peek not
 * changing the value only getting the last value stored into array thats the
 * only use of peek. pop() - To return the last value of array and update it to
 * Zero
 *
 */

public class StackPractice {

	int arr[];
	int top = 0;
	int capacity;

	public static void main(String[] args) {

		StackPractice stack = new StackPractice(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		System.out.print("After push() : ");
		stack.printStack();
		System.out.println("After peek() : " + stack.peek());
		stack.pop();
		stack.pop();
		System.out.println("After pop(): ");
		stack.printStack();
		System.out.println("Size of stack : " + stack.size());
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
	}

	StackPractice(int size) {
		arr = new int[size];
		capacity = size;
	}

	public void push(int value) {
		if (isFull()) {
			System.out.println("Stack is full");
		} else {
			arr[top] = value;
			top++;
		}
	}

	public int pop() {
		int data = 0;
		if (top <= 0) {
			System.out.println("Stack is empty");
		} else {
			top--;
			data = arr[top];
			arr[top] = 0;
		}
		return data;
	}

	public int peek() {
		int data;
		data = arr[top - 1];
		return data;
	}

	public void printStack() {
		for (int a : arr)
			System.out.print(a + " ");
		System.out.println();
	}

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		return top <= 0;
	}

	public boolean isFull() {
		return top >= capacity;
	}
}
