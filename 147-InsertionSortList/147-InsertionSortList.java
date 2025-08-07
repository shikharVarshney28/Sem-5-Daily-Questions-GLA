// Last updated: 8/7/2025, 2:58:31 PM
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
    int size(ListNode h1)
    {
        int c=0;
        while(h1!=null)
        {
            c++;
            h1=h1.next;
        }
        return c;
    }
    public ListNode insertionSortList(ListNode head) {
        //insertion sort
        int n=size(head);
        for(int i=0;i<n;i++)
        {
            ListNode temp=head;
            while(temp.next!=null)
            {
                if(temp.val>temp.next.val)
                {
                    ListNode t=new ListNode(temp.val);
                    temp.val=temp.next.val;
                    temp.next.val=t.val;
                }
                temp=temp.next;
            }
        }
        return head;
    }
}