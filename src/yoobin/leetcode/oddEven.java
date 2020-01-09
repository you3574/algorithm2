package yoobin.leetcode;
/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        else if (head.next == null) {
            return head;
        }
        ListNode oddRoot = head;
        ListNode evenRoot = head.next;
        ListNode oddNode = oddRoot;
        ListNode evenNode = evenRoot;
        while(oddNode.next != null && evenNode.next != null) {
            oddNode.next = oddNode.next.next;
            oddNode = oddNode.next;
            evenNode.next = evenNode.next.next;
            evenNode = evenNode.next;
        }
        oddNode.next = evenRoot;
        return oddRoot;
    }
}