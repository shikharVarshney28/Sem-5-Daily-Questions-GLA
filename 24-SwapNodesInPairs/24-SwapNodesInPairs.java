// Last updated: 8/7/2025, 3:00:55 PM
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
    public ListNode swapPairs(ListNode head) 
    {
        ListNode fast=head;
        ListNode slow=head;
       while(fast!=null && fast.next!=null)
       {
        ListNode a= new ListNode(fast.val);
        fast.val=fast.next.val;
        fast.next.val=a.val;
        fast=fast.next.next;
       }
       return head;
    }
}