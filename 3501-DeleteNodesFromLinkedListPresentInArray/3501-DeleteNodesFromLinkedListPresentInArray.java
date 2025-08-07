// Last updated: 8/7/2025, 2:44:31 PM
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
    ListNode newList(ListNode head,HashSet<Integer> h)
    {
        ListNode new_head=new ListNode(100);
        ListNode temp=new_head;
        while(head!=null)
        {
            if(!h.contains(head.val)){
                ListNode a=new ListNode(head.val);
                temp.next=a;
                temp=a;
            }
            head=head.next;
        }
        return new_head.next;
    }
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> h=new HashSet<>();
        for(int i:nums) h.add(i);
        return newList(head,h);
    }
}