// Last updated: 8/7/2025, 2:52:25 PM
class Solution {
    class DSU {
        int parent[];
        int rank[];

        DSU(int n) {
            this.parent = new int[n];
            this.rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        int findParent(int node) {
            if (parent[node] == node)
                return node;
            parent[node] = findParent(parent[node]);
            return parent[node];
        }

        boolean unionByRank(int a, int b) {
            int p1 = findParent(a);
            int p2 = findParent(b);

            if (p1 == p2)
                return false;
            if(p1<p2){
                parent[p2]=p1;
            }else{
                parent[p1]=p2;
            }
            return true;
        }
    }
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        DSU dsu = new DSU(26);
        for (int i = 0; i < s1.length(); i++) {
            int ch = s1.charAt(i) - 'a', th = s2.charAt(i) - 'a';
            dsu.unionByRank(ch, th);
        }
        StringBuilder s = new StringBuilder(baseStr);
        
        for (int i = 0; i < s.length(); i++) {
            s.setCharAt(i,(char)(dsu.findParent(s.charAt(i)-'a')+'a'));
        }
        return s.toString();
    }
}