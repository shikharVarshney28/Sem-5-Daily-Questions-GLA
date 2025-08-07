// Last updated: 8/7/2025, 2:55:49 PM
class Solution {
    static List<String> ans;

    public List<String> readBinaryWatch(int turnedOn) {
        ans = new ArrayList<>();
        binaryWatch(turnedOn, 0, 0, 9);
        return (ans);
    }

    static void binaryWatch(int n, int hr, int min, int idx) {
        if (n == 0) {
            ans.add((hr + ":" + (min < 10 ? "0" + min : min)));
            return;
        }
        for (int i = idx; i >= 0; i--) {
            if (i <= 3) {
                //hr digitd
                if ((hr | (1 << i)) >= 12)
                    continue;
                binaryWatch(n - 1, hr | (1 << i), min, i - 1);
            } else {
                if ((min | (1 << (9 - i))) >= 60)
                    continue;
                binaryWatch(n - 1, hr, min | (1 << (9 - i)), i - 1);
            }
        }
    }
}