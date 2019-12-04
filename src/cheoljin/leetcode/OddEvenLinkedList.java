package cheoljin.leetcode;

public class OddEvenLinkedList {
    public static void main(String[] args) {
        /*
            https://leetcode.com/problems/odd-even-linked-list/submissions/
         */
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        //result
        //1 2 3 4 5 -> 1 3 5 2 4
        //1 2 3 4 5 6 -> 1 3 5 2 4 6

        ListNode result = oddEvenList(head);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    static ListNode oddEvenList(ListNode head) {
        ListNode tmp = head;
        ListNode oddTail = head;
        int count = 1;
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }
        while (tmp != null) {
            if (tmp.next.next == null) {
                if (count % 2 == 0) {
                    oddTail = tmp.next;
                } else {
                    oddTail = tmp;
                }
                break;
            }
            count++;
            tmp = tmp.next;
        }
        count++;
        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode evenHeadTmp = evenHead;
        for (int i = 0; i < (count / 2); i++) {
            if (oddHead.next.next != null) {
                oddHead.next = oddHead.next.next;
                oddHead = oddHead.next;
            }
            if (i != count / 2 - 1) {
                if (evenHeadTmp.next.next != null) {
                    evenHeadTmp.next = evenHeadTmp.next.next;
                    evenHeadTmp = evenHeadTmp.next;
                }
            }
        }
        evenHeadTmp.next = null;
        oddTail.next = evenHead;
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
