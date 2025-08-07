// Last updated: 8/7/2025, 2:57:08 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //ListNode temp=node;
        while(true)
        {
            node.val=node.next.val;
            if(node.next.next==null) break;
            node=node.next;
        }
        node.next=null;
    }
}