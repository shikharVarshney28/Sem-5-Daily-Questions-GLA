// Last updated: 8/7/2025, 2:58:37 PM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp=head;
        List<ListNode > arr=new ArrayList <>();
        while(temp!=null){
            if(arr.contains(temp)) return temp;
            arr.add (temp);
            temp=temp.next;
        }
        return null;
    }
}