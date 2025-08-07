// Last updated: 8/7/2025, 3:01:16 PM
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(100);
        ListNode temp=head;
        int carry=0;
        while(l1!=null || l2!=null)
        {
            int sum=0;
            if(l1!=null) sum+=l1.val;
            if(l2!=null) sum+=l2.val;
            // adding carry
            sum+=carry;
            // updating carry first
            carry=sum/10;
            //Updating sum now
            sum%=10;
            ListNode f=new ListNode(sum);
            temp.next=f;
            temp=f;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
         }
         if(carry!=0) temp.next=new ListNode(carry);
         return head.next;
    }
}