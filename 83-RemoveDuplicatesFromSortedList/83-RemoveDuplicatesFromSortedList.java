// Last updated: 8/7/2025, 2:59:37 PM
class Solution {
    public ListNode deleteDuplicates(ListNode head) 
    {
    
        if(head==null) return head;
      ListNode current=head,previous=head;
      while(current!=null)
      {
        if(current.val!=previous.val)
        {
            previous.next=current;
            previous=current;
        }
        current=current.next;
      }
      if(previous.next!=null) previous.next=null;
      return head;
    
      
    }
}