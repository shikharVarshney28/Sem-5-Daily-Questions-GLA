// Last updated: 8/7/2025, 2:48:13 PM
class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> ans = new ArrayList<>();
        for (String s : bank) {
            int ones = find(s);
            if (ones != 0)
                ans.add(ones);
        }
        int res = 0;
        for (int i = 0; i < ans.size() - 1; i++) {
            res += (ans.get(i) * ans.get(i + 1));
        }
        return res;
    }

    int find(String s) {
        int c = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '1')
                c++;
        }
        return c;
    }
}