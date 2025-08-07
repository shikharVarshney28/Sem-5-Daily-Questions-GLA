// Last updated: 8/7/2025, 3:00:56 PM
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

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<lists.length;i++){
            ListNode head=lists[i];
            while(head!=null) {
                pq.offer(head.val);
                head=head.next;
            }
        }
        ListNode head=new ListNode(100),temp=head;
        while(!pq.isEmpty()){
            temp.next= new ListNode(pq.poll());
            temp=temp.next;
        }
        return head.next;
    }
}