// Last updated: 8/7/2025, 2:58:03 PM
class Solution {
    public int compareVersion(String version1, String version2) {
        String s[] = version1.split("\\.");
        String t[] = version2.split("\\.");
        for (String m : t)
            System.out.print(m + " ");
        int i = 0, j = 0;
        while (i < s.length && j < t.length) {
            if (Integer.parseInt(s[i]) < Integer.parseInt(t[j]))
                return -1;
            else if (Integer.parseInt(s[i]) > Integer.parseInt(t[j]))
                return 1;
            i++;
            j++;
        }
        while (i < s.length) {
            if (Integer.parseInt(s[i++]) != 0)
                return 1;
        }
        while (j < t.length) {
            if (Integer.parseInt(t[j++]) != 0)
                return -1;
        }
        return 0;
    }
}