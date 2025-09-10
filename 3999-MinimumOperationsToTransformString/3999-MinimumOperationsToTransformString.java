// Last updated: 9/10/2025, 10:27:34 AM
class Solution {
    public int minOperations(String s) {
        PriorityQueue<Character> pq = new PriorityQueue<>();
        for (int i = 0; i < s.length(); i++) {
            if (!pq.contains(s.charAt(i)))
                pq.add(s.charAt(i));
        }
        int minOpr = 0;
        char last;
        // System.out.println (pq);
        while (pq.size() > 1) {
            last = pq.poll();
            if (last == 'a')
                continue;
            minOpr += (pq.peek() - last);
        }
        if (pq.peek() == 'a')
            return 0;
        return minOpr + ('z' - pq.poll() + 1);
    }
}