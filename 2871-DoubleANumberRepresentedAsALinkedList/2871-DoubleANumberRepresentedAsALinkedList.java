// Last updated: 8/7/2025, 2:46:01 PM
class Solution {
    ListNode reverse(ListNode head) {
        ListNode curr = head, prev = null, Next = null;
        while (curr != null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }

    public ListNode doubleIt(ListNode head) {
        head = reverse(head);
        int carry = 0;
        ListNode temp = head;
        while (temp.next != null) {
            int product = temp.val * 2 + carry;
            carry = product / 10;
            product %= 10;
            temp.val = product;
            temp = temp.next;
        }
        int product = temp.val * 2 + carry;
        carry = product / 10;
        product %= 10;
        temp.val = product;
        if (carry != 0)
            temp.next = new ListNode(carry);
        return reverse(head);
    }
}