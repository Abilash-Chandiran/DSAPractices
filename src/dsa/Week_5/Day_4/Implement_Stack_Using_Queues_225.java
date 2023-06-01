package dsa.Week_5.Day_4;

import java.util.Queue;

public class Implement_Stack_Using_Queues_225 {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(9);
		s.push(14);
		s.push(11);
		s.iterater();
		System.out.println("Top = " + s.top());
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.push(11);
		//s.pop();
		s.iterater();
		System.out.println(s.isEmpty());
		
		
	}

}
