package main.java.mandatoryHomeWork.week5.day3;

import java.util.EmptyStackException;
import java.util.Stack;

//https://leetcode.com/problems/implement-queue-using-stacks/

public class QueueUsingStack {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingStack queue=new QueueUsingStack();
    	queue.push(5);
    	queue.push(6);
    	queue.push(7);
    	System.out.println(queue.pop());
    	System.out.println(queue.empty());
    	queue.push(4);
    	queue.push(8);
    	queue.push(9);
    	System.out.println(queue.pop());
    	System.out.println(queue.peek());
    	System.out.println(queue.pop());
    	System.out.println(queue.pop());
    	System.out.println(queue.pop());
    	System.out.println(queue.pop());
    	System.out.println(queue.empty());
    	System.out.println(queue.pop());
	}
	
	Stack<Integer> st1=new Stack<Integer>();
	Stack<Integer> st2=new Stack<Integer>();
	
	 public void MyQueue() {
		 
	    }
	    
	 	
	    public void push(int x) {
	    	//If stack is empty, push the new value into stack1
	    if(st1.empty()) {
	    	st1.push(x);
	    }
	    //if stack is not empty,
	    else {
	    	//push all the stack1 values to stack2
	    	while(!st1.empty()) {
	    		
	    	st2.push(st1.pop());
	    	}
	    	//push the x value in stack 1
	    	st1.push(x);
	    	//again push the stack2 value to stack1
	    	while(!st2.empty()) {
	    		st1.push(st2.pop());
	    	}
	    }
	    	
	    }
	    
	    public int pop() {
	    	if(st1.empty()) {
	    		throw new EmptyStackException();
	    	}
	    	return st1.pop();
	    	
	    }
	    
	   public int peek() {
		   if(st1.empty()) {
	    		throw new EmptyStackException();
	    	}
	    	return st1.peek();
	    }
	    
	    public boolean empty() {
	    	
	    	if(st1.isEmpty()) {
	    		return true;
	    	}
	        return false;
	    }
	    

}
