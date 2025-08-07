// Last updated: 8/7/2025, 2:56:30 PM
class Solution {
    public int maxProduct(String[] words) {
        int arr[] = new int[words.length];
        int idx = 0;
        for (String s : words) {
            int mask = 0;
            for (int j = 0; j < s.length(); j++) {
                mask = mask | (1 << (s.charAt(j) - 'a'));
            }
            arr[idx++] = mask;
        }
        int ans = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((arr[i] & arr[j]) == 0) {
                    //System.out.println (words[i]+" "+words[j])     ;
                    ans = Math.max(ans, words[i].length() * words[j].length());
                }
            }
        }
        return ans;
    }
}