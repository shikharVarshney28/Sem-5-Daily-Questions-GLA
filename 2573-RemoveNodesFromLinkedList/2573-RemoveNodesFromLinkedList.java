// Last updated: 8/7/2025, 2:46:54 PM
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
    public ListNode removeNodes(ListNode head) {
        if(head==null) return null;
        // if curr points to head then still the LL exist as pointer curr is still actinacting as a head..
        ListNode curr=new ListNode(head.val);
        ListNode temp=removeNodes(head.next);
        if(temp ==null || curr.val>= temp.val){
            curr.next=temp;
            return curr;
        }
        return temp;








    }
}