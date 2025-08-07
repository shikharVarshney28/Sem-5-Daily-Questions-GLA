// Last updated: 8/7/2025, 2:49:20 PM
class Solution {
    public int[] minOperations(String boxes) {
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < boxes.length(); i++) {
            char ch = boxes.charAt(i);
            if (ch == '1')
                dq.add(i);
        }
        int res[] = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            int sum = 0;
            int size = dq.size();
            while (size-- > 0) {
                int x = dq.poll();
                sum += Math.abs(x - i);
                dq.addLast(x);
            }
            res[i] = sum;
        }
        return res;
    }
}