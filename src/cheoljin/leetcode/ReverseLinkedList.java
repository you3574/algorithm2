package cheoljin.leetcode;

import java.util.List;
import java.util.Stack;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode result = reverseList(head);

        while(result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    static ListNode reverseList(ListNode head) {
        Stack<Integer> myStack = new Stack<>();
        if (head == null) {
            return null;
        }
        while (head != null) {
            myStack.push(head.val);
            head = head.next;
        }
        ListNode result = new ListNode(myStack.pop());
        ListNode tmp = result;
        while (!myStack.isEmpty()) {
            tmp.next = new ListNode(myStack.pop());
            tmp = tmp.next;
        }
        return result;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
