// Last updated: 10/16/2025, 10:42:57 AM
class Solution {
    public long minTime(int[] skill, int[] mana) {
        long time[] = new long[skill.length];
        long t = 0;
        for (int i = 0; i < skill.length; i++) {
            t += skill[i] * mana[0];
            time[i] = t;
        }

        for (int i = 1; i < mana.length; i++) {
            long startTime = binarySearch(skill, mana, time, time[0], time[time.length - 1], i);
            for (int j = 0; j < skill.length; j++) {
                startTime += (skill[j] * mana[i]);
                time[j] = startTime;
            }
        }
        return time[time.length - 1];
    }

    long binarySearch(int[] s, int[] m, long time[], long st, long end, int potion) {
        long ans = -1;
        while (st <= end) {
            long mid = (st + end) / 2;
            if (possible(s, m, mid, time, potion)) {
                ans = mid;
                end = mid - 1;
            } else
                st = mid + 1;
        }
        return ans;
    }

    boolean possible(int s[], int m[], long mid, long t[], int p) {

        for (int i = 0; i < s.length; i++) {
            if (mid < t[i]) {  // or mid + 1 <= t[i] since it can be possible that the portion get ready at t = 60 while the next wizard will complete its prev potion by 60 hece tthis wizaard will gets that potion at 61...
                return false;
            }
            mid += (s[i] * m[p]);
        }
        return true;
    }
}