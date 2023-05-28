package dsa;

import java.util.Arrays;
import java.util.EmptyStackException;

import org.junit.Test;

//import java.util.Stack;

public class StackExample {

	@Test
	public void test() {

		Stack stack = new Stack();
		stack.push('A');
		stack.push('B');
		stack.push('C');
		stack.push('D');
		stack.push('E');
		System.out.println(stack.toString());
		stack.pop();
		System.out.println(stack.toString());

	}

}

class Stack {

	private int size = 50;
	private Character stack[] = new Character[size];
	private int top = 0;

	boolean push(Character element) {
		if (top < size) {
			stack[top] = element;
			top++;
			return true;
		}
		return false;
	}

	Character pop() {
		Character element = null;
		if (top != 0) {
			element = stack[top - 1];
			top--;
		} else {
			throw new EmptyStackException();
		}
		return element;
	}

	int getSize() {
		return top;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int i = 0; i < top; i++) {
			sb.append(stack[i] + ", ");
		}
		sb.append("]-->"+getSize());
		return sb.toString();
	}
}