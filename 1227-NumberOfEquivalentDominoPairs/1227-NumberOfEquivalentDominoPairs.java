// Last updated: 8/7/2025, 2:52:04 PM
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<String, Integer> hmap = new HashMap<>();
        for (int i[] : dominoes) {
            String s1=""+i[0]+i[1],s2=""+i[1]+i[0];
            if (hmap.containsKey(s1)) {
                hmap.put(s1, hmap.get(s1) + 1);
            }
            else if(hmap.containsKey (s2)){
                hmap.put(s2,hmap.get(s2)+1);
            }
            else {
                hmap.put(s1, 0);
            }
        }
        int res = 0;
        for (String i : hmap.keySet()) {
            int n=hmap.get(i);
            res += (n*(n+1))/2;
        }
        return res;
    }
}