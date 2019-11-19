package cheoljin.leetcode;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
    }
}

class MyQueue {
    Stack<Integer> inQueue;
    Stack<Integer> outQueue;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        inQueue = new Stack<>();
        outQueue = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        inQueue.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if(outQueue.isEmpty()) {
            while(!inQueue.isEmpty()) {
                outQueue.add(inQueue.pop());
            }
        }
        return outQueue.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if(outQueue.isEmpty()) {
            while(!inQueue.isEmpty()) {
                outQueue.add(inQueue.pop());
            }
        }
        return outQueue.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        if(inQueue.isEmpty() && outQueue.isEmpty()) {
            return true;
        }
        return false;
    }
}