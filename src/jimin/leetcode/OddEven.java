package jimin.leetcode;

import java.util.ArrayList;

public class OddEven {
	public static ListNode oddEvenList(ListNode head) {
		ListNode root = new ListNode(head.val);
		ListNode point = root;
		
		ListNode st = head.next.next;
		//È¦¼ö
		while (true) {
			
			
			if (st == null) {
				break;
			}
			if (st.next == null) {

			}

		}
		//Â¦¼ö
		while (true) {

			if (st == null) {
				break;
			}
			if (st.next == null) {

			}

		}
		
		return root;
	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };
		ListNode root = new ListNode(array[0]);
		ListNode point = root;
		for (int i = 1; i < array.length; i++) {
			point.next = new ListNode(array[i]);
			point = point.next;
		}
		ListNode output = oddEvenList(root);

		for (int i = 0; i < array.length; i++) {
			System.out.println(output.val);
			output = output.next;
		}
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}