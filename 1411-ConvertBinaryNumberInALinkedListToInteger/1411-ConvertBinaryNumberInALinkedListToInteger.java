// Last updated: 8/7/2025, 2:51:29 PM
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
    public int getDecimalValue(ListNode head) {
        StringBuilder s = new StringBuilder();
        while (head != null) {
            s.append(head.val);
            head = head.next;
        }
        return Integer.parseInt(s.toString(), 2);
    }
}