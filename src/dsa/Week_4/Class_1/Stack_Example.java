package dsa.Week_4.Class_1;

public class Stack_Example {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push('A');
		stack.push('B');
		stack.push('C');
		stack.pop('A');
		stack.peak('B');
		stack.find('C');
		stack.size();
		stack.push('{');
		System.out.println(stack);
	}
}

class Stack {
	private int size = 50;
	private Character[] stack = new Character[50];
	private int top = 0;

	boolean push(Character element) {
		if (top < size) {
			stack[top] = element;
			top++;
			return true;
		}
		return false;
	}

	public int size() {
		return top;

	}

	public char find(char c) {
		while (top < size) {
			if (stack[top] == c) {
				return stack[top];
			}
			top++;
		}
		return c;
	}

	public char peak(char c) {
		if (top < size)
			c = stack[top];
		return c;
	}

	public boolean pop(char c) {
		if (stack[top] != 0) {
			top--;
			return true;
		}
		return false;
	}
}