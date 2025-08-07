// Last updated: 8/7/2025, 2:56:25 PM
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
    public ListNode oddEvenList(ListNode head) 
    {
        ListNode ho=new ListNode(100);
        ListNode he=new ListNode(100);
        ListNode t1=ho,t2=he;
        int count=1;
        while(head!=null)
        {
            if(count%2==0)
            {
                ListNode a=new ListNode(head.val);
                t2.next=a;
                t2=a;
            }
            else
            {
                ListNode a=new ListNode(head.val);
                t1.next=a;
                t1=a;
            }
            count++; 
            head=head.next;
        }
        t1.next=he.next;
        return ho.next;
    }
}