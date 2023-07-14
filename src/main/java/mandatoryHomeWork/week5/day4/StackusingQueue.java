package main.java.mandatoryHomeWork.week5.day4;

import java.util.ArrayDeque;
import java.util.Queue;

import org.junit.Test;

//https://leetcode.com/problems/implement-stack-using-queues/

public class StackusingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	Queue<Integer> q1 = new ArrayDeque<Integer>();
	Queue<Integer> q2 = new ArrayDeque<Integer>();

	// keep on push in the 1st queue
	public void push(int x) {
		q1.add(x);

	}

	// empty q1 and add it in q2 and then pop out
	public int pop() {


		return q1.remove();
	}

	public int top() {
		return q2.peek();

	}

	public boolean empty() {
		if (q2.size() == 0) {
			return true;
		}
		return false;
	}

	@Test
	public void test() {
		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.add(4);
		q1.add(5);

		System.out.println(q1.remove());
		System.out.println(q1.remove());
	}

}
