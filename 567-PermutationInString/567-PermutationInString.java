// Last updated: 8/7/2025, 2:54:33 PM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s = s1.length();
        int[] freq = new int[26];
        for (int i = 0; i < s; i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i <= s2.length() - s; i++) {
            String temp = s2.substring(i, i + s);
            int freq2[] = new int[26];
            for (int j = 0; j < s; j++) {
                freq2[temp.charAt(j) - 'a']++;
            }
            //System.out.println(temp);
            int c = 0;
            for (; c < 26; c++) {
                if (freq[c] != freq2[c])
                    break;
            }
            //System.out.println (c);
            if (c == 26)
                return true;
        }
        return false;
    }
}