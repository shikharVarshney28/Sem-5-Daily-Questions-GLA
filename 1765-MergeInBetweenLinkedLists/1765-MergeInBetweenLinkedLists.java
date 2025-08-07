// Last updated: 8/7/2025, 2:49:45 PM
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
    public ListNode mergeInBetween(ListNode head, int a, int b, ListNode list2) {
        ListNode temp=head,temp2=head,temp3=list2;
        for(int i=1;i<a;i++) temp=temp.next;
        for(int i=0;i<b+1;i++) temp2=temp2.next;
        while(temp3.next!=null) temp3=temp3.next;
        //System.out.print(temp2.val);
        temp.next=list2;
        temp3.next=temp2;
        return head;

    }
}