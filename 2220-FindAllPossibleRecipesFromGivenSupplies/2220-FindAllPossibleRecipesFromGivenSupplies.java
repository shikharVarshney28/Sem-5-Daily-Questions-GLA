// Last updated: 8/7/2025, 2:48:19 PM
class Solution {
    List<String> vis = new ArrayList<>(); // to keep track and to stop infinite calling ie bread req yeast and yeast req bread...

    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        HashMap<String, List<String>> adjList = new HashMap<>();
        HashSet<String> hSet = new HashSet<>();
        for (String s : supplies) {
            hSet.add(s);
        }
        int n = recipes.length;
        for (int i = 0; i < n; i++) {
            adjList.put(recipes[i], new ArrayList<>(ingredients.get(i)));
        }
        // System.out.println (adjList);
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!ans.contains(recipes[i])) {
                dfs(recipes, hSet, adjList, recipes[i], ans);
            }
        }
        return ans;
    }

    boolean dfs(String[] s, HashSet<String> hSet, HashMap<String, List<String>> adjList, String i, List<String> ans) {
        boolean allPresent = true;
        vis.add(i);
        for (String t : adjList.get(i)) {
            if (!hSet.contains(t)) {
                if (!adjList.containsKey(t) || vis.contains(t))
                    return false;
                allPresent = allPresent && dfs(s, hSet, adjList, t, ans); // tthis item need to prepare first
                if (!allPresent)
                    return false; // item cannot be preapred and hence this item i cannot be prepared...
            }
        }
        hSet.add(i); // to make sure the newly prepared item can be used as other ingridents
        ans.add(i); // item is prepared successfully
        return true;
    }
}
