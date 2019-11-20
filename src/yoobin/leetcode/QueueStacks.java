package yoobin.leetcode;

import java.util.*;

public class QueueStacks {

	Stack<Integer> inBox = new Stack<>();
	Stack<Integer> outBox = new Stack<>();

	public void enQueue(Integer num) {
		inBox.add(num);
	}

	public int deQueue() {
		if (!outBox.isEmpty()) {
			return outBox.pop();
		} else {
			while (inBox.size() > 0)
				outBox.push(inBox.pop());
		}
		return outBox.pop();

	}

	public int peek() {
		if (!outBox.isEmpty()) {
			return outBox.peek();
		} else {
			while (inBox.size() > 0)
				outBox.push(inBox.pop());
		}
		return outBox.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueStacks q = new QueueStacks();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);

		System.out.println(q.deQueue());
		System.out.println(q.peek());
	}

}
