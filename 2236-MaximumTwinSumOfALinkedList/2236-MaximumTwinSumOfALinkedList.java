// Last updated: 8/7/2025, 2:48:15 PM
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
    ListNode reverse(ListNode h)
    {
        ListNode current=h;
        ListNode previous=null,Next=null;
        while(current!=null)
        {
            Next=current.next;
            current.next=previous;
            previous=current;
            current=Next;
        } return previous;
    }
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode a=reverse(slow.next);
        slow.next=a;
        ListNode sum=new ListNode(0);
        while(a!=null)
        {
            if((sum.val)<(head.val+a.val))
                sum.val=head.val+a.val;
            head=head.next;
            a=a.next;
        } return sum.val;
    }
}