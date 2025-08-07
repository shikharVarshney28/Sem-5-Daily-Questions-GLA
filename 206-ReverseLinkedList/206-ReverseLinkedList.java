// Last updated: 8/7/2025, 2:57:38 PM
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev=null,curr=head,Next=head;
        while(Next!=null){
            Next=Next.next;
            curr.next=prev;
            prev=curr;
            curr=Next; 
        }
        return prev;
    }
}