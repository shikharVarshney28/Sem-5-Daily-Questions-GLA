// Last updated: 8/7/2025, 2:57:42 PM
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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        ListNode curr=new ListNode(head.val);
        ListNode temp=removeElements(head.next,val);
        if(curr.val==val) return temp;
        curr.next =temp;
        return curr;
    }
}