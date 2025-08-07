// Last updated: 8/7/2025, 2:57:14 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode reverse(ListNode h)
    {
        ListNode current=h;
        ListNode previous=null,Next=null;
        while(current!=null)
        {
            Next=current.next;
            current.next=previous;
            previous=current;
            current=Next;
        }
        return previous;
    }
    public boolean isPalindrome(ListNode head) 
    {
        ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode a=reverse(slow.next);
        slow.next=a;
        while(head!=slow.next && a!=null)
        {
            if(head.val!=a.val) return false;
            head=head.next;
            a=a.next;
        }
        return true;
    }
}