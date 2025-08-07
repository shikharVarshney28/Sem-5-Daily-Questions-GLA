// Last updated: 8/7/2025, 2:53:17 PM
class Solution {
    void dfs(HashMap<String, List<String>> hmap, String src, HashSet<String> h) {
        h.add(src);
        for (String s : hmap.get(src)) {
            if (h.contains(s))
                continue;
            dfs(hmap, s, h);
        }
    }

    public int numSimilarGroups(String[] strs) {
        HashMap<String, List<String>> hmap = new HashMap<>();
        int n = strs.length;
        for (int i = 0; i < n; i++) {
            String s = strs[i];
            hmap.put(s, new ArrayList<>());
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                String s2 = strs[j];
                int diff = 0, ind = 0;
                while (ind < s.length()) {
                    if (s.charAt(ind) != s2.charAt(ind))
                        diff++;
                    if (diff > 2)
                        break;
                    ind++;
                }
                if (diff <= 2) {
                    List<String> t = hmap.get(s);
                    t.add(s2);
                    hmap.put(s, t);
                }
            }
        }
        int noOfComponents = 0;
        HashSet<String> isVis = new HashSet<>();
        for (String s : hmap.keySet()) {
            if (!isVis.contains(s)) {
                dfs(hmap, s, isVis);
                noOfComponents++;
            }
        }
        return noOfComponents;
    }
}