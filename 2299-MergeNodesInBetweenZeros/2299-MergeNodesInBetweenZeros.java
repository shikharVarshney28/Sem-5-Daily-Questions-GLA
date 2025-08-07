// Last updated: 8/7/2025, 2:48:02 PM
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode new_head=new ListNode(100);
        ListNode temp=new_head;
        int sum=0;
        while(head!=null)
        {
            if(head.val==0 && sum!=0)
            {
                ListNode a=new ListNode(sum);
                temp.next=a;
                temp=a;
                sum=0;
            }
            else sum=sum+head.val;
            head=head.next;
        }
        return new_head.next;

    }
}