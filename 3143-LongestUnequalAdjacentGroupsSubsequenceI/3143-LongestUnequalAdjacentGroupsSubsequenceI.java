// Last updated: 8/7/2025, 2:45:53 PM
class Solution {
    List<String> ans;
    int dp[];
    int find(String[] words, int[] groups, int idx, List<String> ds) {
        if (idx >= words.length) {
            if (ds.size() > ans.size()) {
                ans = new ArrayList<>(ds);
            }
            return 0;
        }
        if(dp[idx]!=0 && dp[idx]<=ans.size ()) return 0;
        int len = 0;
        for (int i = idx; i < words.length; i++) {
            if (i + 1 < words.length && groups[i] == groups[i + 1])
                continue;
            ds.add(words[i]);
            len = Math.max(find(words, groups, i + 1, ds), len);
            ds.remove(ds.size() - 1);
        }
        return dp[idx]=len + 1;
    }

    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        ans=new ArrayList <>();
        dp=new int[words.length];
        System.out.println (find(words, groups, 0,new ArrayList<>()));
        return ans;
    }
}