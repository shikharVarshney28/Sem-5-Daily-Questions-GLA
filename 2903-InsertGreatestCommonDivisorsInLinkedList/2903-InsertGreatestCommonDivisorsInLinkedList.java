// Last updated: 8/7/2025, 2:45:57 PM
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
    int gcd(int x,int y)
    {
        if(y==0) return x;
        return gcd(y,x%y);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode head_2=null;
        ListNode temp=head,temp_2=null,temp_connect=head;
        while(temp.next!=null)
        {
            ListNode x=new ListNode(gcd(temp.val,temp.next.val));
            if(head_2==null) head_2=x;
            else temp_2.next=x;
            temp_2=x;
            temp=temp.next;
        }
        //temp_2=head_2;
        temp=head.next;
        while(head_2!=null)
        {
            temp_connect.next=head_2;
            temp_connect=head_2;
            head_2=head_2.next;

            temp_connect.next=temp;
            temp_connect=temp;
            temp=temp.next;
        }
        return head;
    }
}