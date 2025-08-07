// Last updated: 8/7/2025, 2:58:28 PM
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
    ListNode merge(ListNode t1,ListNode t2)
    {
        ListNode head=new ListNode(100);
        ListNode temp=head;
        while(t1!=null && t2!=null)
        {
            if(t1.val<t2.val)
            {
                temp.next=t1;
                temp=t1;
                t1=t1.next;
            }
            else
            {
                temp.next=t2;
                temp=t2;
                t2=t2.next;
            }
        }
        if(t2==null) temp.next=t1;
        if(t1==null) temp.next=t2;
        return head.next;
    }
    ListNode divide(ListNode head)
    {
        if(head==null|| head.next==null) return head;
        //calculation of mid
        ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode a=slow.next;
        slow.next=null;
        ListNode t1=divide(head);
        ListNode t2=divide(a);
        return merge(t1,t2);
    }
    public ListNode sortList(ListNode head) {
        return divide(head);
    }
}