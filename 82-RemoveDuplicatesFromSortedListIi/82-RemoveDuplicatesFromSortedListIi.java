// Last updated: 8/7/2025, 2:59:38 PM

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        Stack<Integer> st=new Stack<>();
        while(head!=null)
        {
         if(st.size()==0 || st.peek()!=head.val) st.push(head.val);
         else if(head.next==null || head.val!=head.next.val) st.pop();
         head=head.next;   
        }
        
        while(st.size()>0)
        {
            ListNode a=new ListNode(st.pop());
            if(head==null) head=a;
            else
            {
                a.next=head;
                head=a;
            }
        }
        return head;
    }
}