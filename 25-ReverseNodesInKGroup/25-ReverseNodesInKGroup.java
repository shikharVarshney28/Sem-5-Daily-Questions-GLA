// Last updated: 8/7/2025, 3:00:53 PM
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        List<ListNode> arr = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            arr.add(temp);
            temp = temp.next;
        }
        int i = 0;
        while (i < arr.size()) {
            int st = i, end = i + k - 1;
            if (end >= arr.size())
                break;
            while (st < end) {
                int temp1 = arr.get(st).val;
                arr.get(st).val = arr.get(end).val;
                arr.get(end).val = temp1;
                st++;
                end--;
            }
            i += k;
        }
        return head;
    }
}