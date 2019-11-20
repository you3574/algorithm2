package jimin.leetcode;

import java.util.Stack;

public class QueueUsingStacks {
	
	   
	    public static void main(String[] args) {
	    	MyQueue queue = new MyQueue();

	    	queue.push(1);
	    	queue.push(2);  
	    	queue.peek();  // returns 1
	    	queue.pop();   // returns 1
	    	queue.empty(); // returns false
	    	 

		}
}

class MyQueue {
    Stack<Integer> stack;
    /** Initialize your data structure here. */
    public MyQueue() {
    	stack=new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	int result;
    	Stack<Integer> temp=new Stack<>();
    	while(!stack.isEmpty()) {
    		temp.add(stack.pop());
    	}
    	result=temp.pop();
    	while(!temp.isEmpty()) {
    		stack.push(temp.pop());
    	}
        return result;
    }
    
    /** Get the front element. */
    public int peek() {
    	int result;
    	Stack<Integer> temp=new Stack<>();
    	while(!stack.isEmpty()) {
    		temp.add(stack.pop());
    	}
    	result=temp.peek();
    	while(!temp.isEmpty()) {
    		stack.push(temp.pop());
    	}
        return result;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(stack.isEmpty())
        	return true;
        else 
        	return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
