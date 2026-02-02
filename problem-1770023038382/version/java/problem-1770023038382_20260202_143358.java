// Last updated: 2/2/2026, 2:33:58 PM
1class Solution {
2    int size = 0;
3
4    int[] nextGreaterElement(ListNode head) {
5        int ans[] = new int[size];
6        Stack<Integer> st = new Stack<>();
7        while (head != null) {
8            while (st.size() > 0 && st.peek() <= head.val) {
9                st.pop();
10            }
11            ans[size-- - 1] = !st.isEmpty() ? st.peek() : 0;
12            st.push(head.val);
13            head = head.next;
14        }
15        return ans;
16    }
17
18    ListNode reverse(ListNode h) {
19        ListNode prev = null, curr = h, next = null;
20        while (curr != null) {
21            next = curr.next;
22            curr.next = prev;
23            prev = curr;
24            curr = next;
25            size++;
26        }
27        return prev;
28    }
29
30    public int[] nextLargerNodes(ListNode head) {
31        head = reverse(head);
32        return nextGreaterElement(head);
33    }
34}