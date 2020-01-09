package yoobin.leetcode;


public class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	
}

static class Solution {
	public static ListNode oddEvenList(ListNode head) {
    
    
    ListNode odd=head; //È¦¼ö
    ListNode even=odd.next;//Â¦¼ö
    ListNode temp=odd.next;
    
    while(temp.next!=null && temp!=null){
       
    	temp=odd.next.next;
    	odd=temp.next;
        temp=temp.next.next;
  
        
        odd=odd.next;
        temp=temp.next;
        odd.next=even;
    
 
	}
	return head;
}
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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



}}
