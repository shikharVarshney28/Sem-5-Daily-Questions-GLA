// Last updated: 8/7/2025, 2:58:35 PM
class Solution {
    ListNode reverse(ListNode h1)
    {
        // prev current fast
        ListNode current=h1,previous=null,Next=null;
        while(current!=null)
        {
            Next=current.next;
            current.next=previous;
            previous=current;
            current=Next;
        }
        return previous;
    }
    public void reorderList(ListNode head) 
    {
        ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=reverse(slow.next);
        slow.next=null;
        ListNode head_new=new ListNode(100);
        ListNode t2=head_new;
        // used concept of Merging the linked list;;
        while(head!=null && head2!=null)
        {
            t2.next=head;
            t2=head;
            head=head.next;

            t2.next=head2;
            t2=head2;
            head2=head2.next;
        }
        if(head2==null) t2.next=head;
        else t2.next=head2;
       
    }
}