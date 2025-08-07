// Last updated: 8/7/2025, 3:00:05 PM
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        int size=0;
        // calculation of size;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        k=k%size;
        if(k==0) return head;
        temp=head;
        //now let tempto be point from size-k from starting
        for(int i=1;i<size-k;i++)
            temp=temp.next;
        // let a be point jaha peer roatation occur kr nah hai... to divide in two list
        ListNode a=temp.next;
        temp.next=null;
        temp=a;
        //now we want to add the first elemnet of first list to the end of second list
        while(temp.next!=null) temp=temp.next;
        temp.next=head;
        return a;
        
    }
}