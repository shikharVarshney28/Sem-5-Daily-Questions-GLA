// Last updated: 8/7/2025, 2:55:29 PM
class Solution {
    ListNode reverse(ListNode l1){
        ListNode prev = null,Next =null,curr = l1;
        while(curr!=null){
            Next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
    ListNode sum(ListNode l1,ListNode l2){
        ListNode head = new ListNode(100),temp=head;
        int carry=0;
        while(l1!= null || l2!=null){
            int sum=0;
            if(l1!=null) sum+=l1.val;
            if(l2!=null) sum+=l2.val;
            sum+=carry;
            carry = sum/10;
            sum%=10;
            temp.next=new ListNode(sum);
            temp=temp.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        if(carry!=0) temp.next = new ListNode(carry);
        return head.next;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverse(l1);
        l2=reverse(l2);
        return reverse(sum(l1,l2));
    }
}