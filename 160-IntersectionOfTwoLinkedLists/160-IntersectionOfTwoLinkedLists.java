// Last updated: 8/7/2025, 2:58:13 PM
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA,tempB=headB;
        while(tempA != tempB){
            if(tempA==null){
                tempA=headB;
            }else{
                tempA=tempA.next;
            }
            if(tempB==null){
                tempB=headA;
            }else{
                tempB=tempB.next;
            }
        }
        return tempA;
    }
}